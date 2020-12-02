package takesix.players.strategy;

import takesix.api.Card;
import takesix.api.PlayerContext;

import java.util.List;

public interface RowSelectStrategy {
    int selectRow(PlayerContext playerContext, List<Card> remainingCards);
}
