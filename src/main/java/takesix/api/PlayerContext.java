package takesix.api;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface PlayerContext {
    Table table();
    List<Card> cards();
    PlayerId playerId();
}
