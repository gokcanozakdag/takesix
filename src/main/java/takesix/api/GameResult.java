package takesix.api;

import org.immutables.value.Value;
import takesix.api.ImmutableGameResult;
import takesix.api.PlayerId;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

@Value.Immutable
public interface GameResult {
    PlayerId winner();
    Map<PlayerId, Integer> scores();

    static GameResult from(GameState gameState) {
        Map<PlayerId, Integer> scores = gameState.getPlayerStates().entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().points()));

        PlayerId winner = scores.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        return ImmutableGameResult.builder()
                .winner(winner)
                .scores(scores)
                .build();
    }
}
