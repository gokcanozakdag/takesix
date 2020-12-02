package takesix;

import takesix.api.*;
import takesix.api.ImmutableGameState;
import takesix.api.ImmutablePlayerContext;
import takesix.api.ImmutablePlayerState;

import java.util.*;
import java.util.stream.Collectors;

public class Engine {
    Status status;
    GameState gameState;

    public Engine(Map<PlayerId, Player> players) {
        gameState = initialize(players);
        status = Status.IN_PROGRESS;
    }

    public GameResult run() {
        while (status != Status.GAME_FINISHED) {
            iterate();
        }

        return GameResult.from(gameState);
    }

    private GameState initialize(Map<PlayerId, Player> players) {
        Deck deck = Deck.create();

        Table table = Table.withInitialCards(deck.getRandomCards(4));

        Map<PlayerId, PlayerState> playerStateMap = new HashMap<>();
        for (PlayerId playerId : players.keySet()) {
            playerStateMap.put(playerId, ImmutablePlayerState.builder()
                .points(66)
                .addAllCards(deck.getRandomCards(10))
                .build());
        }


        GameState gameState = ImmutableGameState.builder()
                .putAllPlayers(players)
                .remainingTurns(10)
                .putAllPlayerStates(playerStateMap)
                .table(table)
                .build();

        return gameState;
    }


    private void iterate() {
        status = getStatus(gameState);

        switch (status) {
            case GAME_FINISHED:
                finishGame();
                break;
            case TURN_FINISHED:
                refreshCards();
                break;
            case IN_PROGRESS:
                playTurn();
                break;
        }
    }

    private void playTurn() {
        Map<Card, PlayerId> playedCardsToPlayers = discardCards();
        List<Card> playedCards = playedCardsToPlayers.keySet().stream().collect(Collectors.toList());
        playedCards.sort(Comparator.comparingInt(Card::value));

        for (int i = 0; i < playedCards.size(); i++) {
            Card playedCard = playedCards.get(i);
            PlayerId playerId = playedCardsToPlayers.get(playedCard);
            int result = gameState.table().tryAppendCard(playedCard);

            if (result < 0) {
                Player player = gameState.getPlayer(playerId);
                int selectedRow = player.selectRow(getPlayerContext(playerId), playedCards.subList(i, playedCards.size()));
                result = gameState.table().replaceRow(playedCard, selectedRow);

            }

            PlayerState updatedPlayerState = gameState.getPlayerState(playerId).lostPoints(result);
            gameState = gameState.stateWithPlayerState(playerId, updatedPlayerState);
        }

        gameState = gameState.reduceRemainingTurns();
    }

    private Map<Card, PlayerId> discardCards() {
        Map<Card, PlayerId> playedCards = new HashMap<>();

        for (PlayerId playerId : gameState.getPlayers().keySet()) {
            Player player = gameState.getPlayers().get(playerId);
            int playedCardIndex = player.discardCard(getPlayerContext(playerId));

            Card playedCard = gameState.getPlayerState(playerId).cards().get(playedCardIndex);
            PlayerState updatedPlayerState = gameState.getPlayerState(playerId).playedCard(playedCardIndex);
            gameState = gameState.stateWithPlayerState(playerId, updatedPlayerState);
            playedCards.put(playedCard, playerId);
        }

        return playedCards;
    }

    private PlayerContext getPlayerContext(PlayerId playerId) {
        return ImmutablePlayerContext.builder()
                .table(gameState.table())
                .cards(gameState.getPlayerState(playerId).cards())
                .playerId(playerId)
                .build();
    }

    private void refreshCards() {
        Deck deck = Deck.create();

        Table table = Table.withInitialCards(deck.getRandomCards(4));

        Map<PlayerId, PlayerState> playerStateMap = new HashMap<>();
        for (PlayerId playerId : gameState.getPlayerStates().keySet()) {
            playerStateMap.put(playerId, ImmutablePlayerState.builder()
                    .points(gameState.getPlayerState(playerId).points())
                    .addAllCards(deck.getRandomCards(10))
                    .build());
        }


        gameState = ImmutableGameState.builder()
                .putAllPlayers(gameState.getPlayers())
                .remainingTurns(10)
                .putAllPlayerStates(playerStateMap)
                .table(table)
                .build();
    }

    private void finishGame() {
        System.out.println("Game finished:");
        System.out.println(GameResult.from(gameState));
    }


    private Status getStatus(GameState gameState) {
        if (gameState.remainingTurns() > 0) {
            return Status.IN_PROGRESS;
        }

        return anyPlayerFinished(gameState) ? Status.GAME_FINISHED : Status.TURN_FINISHED;
    }

    private boolean anyPlayerFinished(GameState gameState) {
        return gameState.getPlayerStates().values().stream().anyMatch(playerState -> playerState.points() <= 0);
    }

    enum Status {
        IN_PROGRESS, GAME_FINISHED, TURN_FINISHED;
    }
}
