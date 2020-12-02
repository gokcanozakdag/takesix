package takesix.players.strategy;

import takesix.api.Card;
import takesix.api.Player;
import takesix.api.PlayerContext;

import java.util.List;

public class ModularPlayer implements Player {
    private final CardDiscardStrategy cardDiscardStrategy;
    private final RowSelectStrategy rowSelectStrategy;

    private ModularPlayer(CardDiscardStrategy cardDiscardStrategy, RowSelectStrategy rowSelectStrategy) {
        this.cardDiscardStrategy = cardDiscardStrategy;
        this.rowSelectStrategy = rowSelectStrategy;
    }

    public static Player withStrategy(CardDiscardStrategy cardDiscardStrategy, RowSelectStrategy rowSelectStrategy) {
        return new ModularPlayer(cardDiscardStrategy, rowSelectStrategy);
    }

    @Override
    public int discardCard(PlayerContext playerContext) {
        return cardDiscardStrategy.discardCard(playerContext);
    }

    @Override
    public int selectRow(PlayerContext playerContext, List<Card> remainingCards) {
        return rowSelectStrategy.selectRow(playerContext, remainingCards);
    }
}
