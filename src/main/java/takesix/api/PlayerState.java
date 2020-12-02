package takesix.api;

import org.immutables.value.Value;
import takesix.api.ImmutablePlayerState;

import java.util.ArrayList;
import java.util.List;

@Value.Immutable
public abstract class PlayerState {
    public abstract int points();
    public abstract List<Card> cards();

    public PlayerState playedCard(int cardIndex) {
        if (cardIndex > cards().size()) {
            throw new IllegalStateException("card index out of bounds");
        }

        List<Card> newCards = new ArrayList<>(cards());
        newCards.remove(cardIndex);

        return ImmutablePlayerState.builder()
                .from(this)
                .cards(newCards)
                .build();
    }

    public PlayerState lostPoints(int lostPoints) {
        return ImmutablePlayerState.builder()
                .from(this)
                .points(points() - lostPoints)
                .build();
    }
}
