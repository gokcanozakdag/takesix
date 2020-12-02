package takesix.players.strategy;

import takesix.api.PlayerContext;

import java.util.Random;

public class RandomCardDiscard implements CardDiscardStrategy {
    private Random random = new Random();

    @Override
    public int discardCard(PlayerContext playerContext) {
        return random.nextInt(playerContext.cards().size());
    }
}
