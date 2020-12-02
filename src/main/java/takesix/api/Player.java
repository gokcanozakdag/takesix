package takesix.api;

import java.util.List;

public interface Player {
    int discardCard(PlayerContext playerContext);
    int selectRow(PlayerContext playerContext, List<Card> remainingCards);
}
