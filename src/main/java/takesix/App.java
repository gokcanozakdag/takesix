/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package takesix;

import com.google.common.collect.ImmutableMap;
import takesix.api.GameResult;
import takesix.api.Player;
import takesix.api.PlayerId;
import takesix.players.RandomPlayer;
import takesix.players.strategy.LowestRowSelect;
import takesix.players.strategy.ModularPlayer;
import takesix.players.strategy.RandomCardDiscard;
import takesix.simulation.Simulation;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<PlayerId, Player> players = ImmutableMap.of(
                PlayerId.of("random1"), new RandomPlayer(false),
                PlayerId.of("random2"), new RandomPlayer(false),
                PlayerId.of("lowestRowSelecting"), ModularPlayer.withStrategy(
                        new RandomCardDiscard(),
                        new LowestRowSelect())
        );

        Simulation simulation = Simulation.of(players);
        List<GameResult> results = simulation.simulate(10000);
        System.out.println(Simulation.winningHistogram(results));
    }
}
