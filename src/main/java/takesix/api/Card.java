package takesix.api;

import org.immutables.value.Value;

@Value.Immutable
public interface Card {
    int bulls();
    int value();
}
