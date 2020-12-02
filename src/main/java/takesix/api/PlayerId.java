package takesix.api;

import org.immutables.value.Value;
import takesix.api.ImmutablePlayerId;

@Value.Immutable
public interface PlayerId {
    String value();

    static PlayerId of(String value) {
        return ImmutablePlayerId.builder().value(value).build();
    }
}
