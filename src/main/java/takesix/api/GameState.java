package takesix.api;

import org.immutables.value.Value;
import takesix.api.ImmutableGameState;

import java.util.HashMap;
import java.util.Map;

@Value.Immutable
public abstract class GameState {
    public abstract Map<PlayerId, Player> getPlayers();
    public abstract Map<PlayerId, PlayerState> getPlayerStates();
    public abstract Table table();
    public abstract int remainingTurns();

    public Player getPlayer(PlayerId playerId) {
        return getPlayers().get(playerId);
    }

    public PlayerState getPlayerState(PlayerId playerId) {
        return getPlayerStates().get(playerId);
    }

    public GameState stateWithPlayerState(PlayerId playerId, PlayerState playerState) {
        Map<PlayerId, PlayerState> newPlayerStateMap = new HashMap<>(getPlayerStates());
        newPlayerStateMap.put(playerId, playerState);

        return ImmutableGameState.builder()
                .table(table())
                .putAllPlayerStates(newPlayerStateMap)
                .putAllPlayers(getPlayers())
                .remainingTurns(remainingTurns())
                .build();
    }

    public GameState reduceRemainingTurns() {
        return ImmutableGameState.builder()
                .table(table())
                .putAllPlayerStates(getPlayerStates())
                .putAllPlayers(getPlayers())
                .remainingTurns(remainingTurns() - 1)
                .build();
    }
}
