package takesix.api;

import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link PlayerId}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlayerId.builder()}.
 */
@Generated(from = "PlayerId", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePlayerId implements PlayerId {
  private final String value;

  private ImmutablePlayerId(String value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @Override
  public String value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlayerId#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlayerId withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new ImmutablePlayerId(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlayerId} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlayerId
        && equalTo((ImmutablePlayerId) another);
  }

  private boolean equalTo(ImmutablePlayerId another) {
    return value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PlayerId} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PlayerId")
        .omitNullValues()
        .add("value", value)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link PlayerId} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlayerId instance
   */
  public static ImmutablePlayerId copyOf(PlayerId instance) {
    if (instance instanceof ImmutablePlayerId) {
      return (ImmutablePlayerId) instance;
    }
    return ImmutablePlayerId.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePlayerId ImmutablePlayerId}.
   * <pre>
   * ImmutablePlayerId.builder()
   *    .value(String) // required {@link PlayerId#value() value}
   *    .build();
   * </pre>
   * @return A new ImmutablePlayerId builder
   */
  public static ImmutablePlayerId.Builder builder() {
    return new ImmutablePlayerId.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePlayerId ImmutablePlayerId}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlayerId", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PlayerId} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PlayerId instance) {
      Objects.requireNonNull(instance, "instance");
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link PlayerId#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder value(String value) {
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePlayerId ImmutablePlayerId}.
     * @return An immutable instance of PlayerId
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePlayerId build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePlayerId(value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build PlayerId, some of required attributes are not set " + attributes;
    }
  }
}
