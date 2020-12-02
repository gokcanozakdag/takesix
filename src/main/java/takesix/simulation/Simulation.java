package takesix.simulation;

import takesix.Engine;
import takesix.api.GameResult;
import takesix.api.Player;
import takesix.api.PlayerId;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simulation {
    private Map<PlayerId, Player> players;
    private List<GameResult> gameResults;

    private Simulation(Map<PlayerId, Player> players) {
        this.players = players;
    }

    public static Simulation of(Map<PlayerId, Player> players) {
        return new Simulation(players);
    }

    public List<GameResult> simulate(int numGames) {
        gameResults = new ArrayList<>();
        for (int i = 0; i < numGames; i++) {
            Engine engine = new Engine(players);
            gameResults.add(engine.run());
        }

        return gameResults;
    }

    public static Map<PlayerId, Integer> winningHistogram(List<GameResult> gameResults) {
        Map<PlayerId, Integer> hist = new HashMap<>();

        for (GameResult gameResult : gameResults) {
            PlayerId winner = gameResult.winner();
            hist.put(winner, hist.getOrDefault(winner, 0) + 1);
        }

        return hist;
    }
}
