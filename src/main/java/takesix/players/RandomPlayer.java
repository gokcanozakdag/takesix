package takesix.players;

import takesix.api.Card;
import takesix.api.Player;
import takesix.api.PlayerContext;

import java.util.List;
import java.util.Random;

public class RandomPlayer implements Player {
    private Random random = new Random();
    private final boolean verbose;

    public RandomPlayer() {
        this(true);
    }

    public RandomPlayer(boolean verbose) {
        this.verbose = verbose;
    }

    @Override
    public int discardCard(PlayerContext playerContext) {
        log("I am " + playerContext.playerId() + ", discarding");
        log("Has cards: " + playerContext.cards());
        int pickedCard = random.nextInt(playerContext.cards().size());
        log("Picking card: " + playerContext.cards().get(pickedCard));
        return pickedCard;
    }

    @Override
    public int selectRow(PlayerContext playerContext, List<Card> remainingCards) {
        log("I am " + playerContext.playerId());
        log("Asked to pick a row, table:");
        log(playerContext.table());

        int pickedRow = random.nextInt(4);
        log("Picking row: " + pickedRow);
        return pickedRow;
    }

    private void log(Object value) {
        if (verbose) {
            System.out.println(value);
        }
    }
}
