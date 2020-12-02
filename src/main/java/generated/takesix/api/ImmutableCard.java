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
 * Immutable implementation of {@link Card}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCard.builder()}.
 */
@Generated(from = "Card", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableCard implements Card {
  private final int bulls;
  private final int value;

  private ImmutableCard(int bulls, int value) {
    this.bulls = bulls;
    this.value = value;
  }

  /**
   * @return The value of the {@code bulls} attribute
   */
  @Override
  public int bulls() {
    return bulls;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @Override
  public int value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Card#bulls() bulls} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for bulls
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withBulls(int value) {
    if (this.bulls == value) return this;
    return new ImmutableCard(value, this.value);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Card#value() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCard withValue(int value) {
    if (this.value == value) return this;
    return new ImmutableCard(this.bulls, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCard} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCard
        && equalTo((ImmutableCard) another);
  }

  private boolean equalTo(ImmutableCard another) {
    return bulls == another.bulls
        && value == another.value;
  }

  /**
   * Computes a hash code from attributes: {@code bulls}, {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + bulls;
    h += (h << 5) + value;
    return h;
  }

  /**
   * Prints the immutable value {@code Card} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("Card")
        .omitNullValues()
        .add("bulls", bulls)
        .add("value", value)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link Card} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Card instance
   */
  public static ImmutableCard copyOf(Card instance) {
    if (instance instanceof ImmutableCard) {
      return (ImmutableCard) instance;
    }
    return ImmutableCard.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableCard ImmutableCard}.
   * <pre>
   * ImmutableCard.builder()
   *    .bulls(int) // required {@link Card#bulls() bulls}
   *    .value(int) // required {@link Card#value() value}
   *    .build();
   * </pre>
   * @return A new ImmutableCard builder
   */
  public static ImmutableCard.Builder builder() {
    return new ImmutableCard.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableCard ImmutableCard}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Card", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_BULLS = 0x1L;
    private static final long INIT_BIT_VALUE = 0x2L;
    private long initBits = 0x3L;

    private int bulls;
    private int value;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code Card} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(Card instance) {
      Objects.requireNonNull(instance, "instance");
      bulls(instance.bulls());
      value(instance.value());
      return this;
    }

    /**
     * Initializes the value for the {@link Card#bulls() bulls} attribute.
     * @param bulls The value for bulls 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder bulls(int bulls) {
      this.bulls = bulls;
      initBits &= ~INIT_BIT_BULLS;
      return this;
    }

    /**
     * Initializes the value for the {@link Card#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder value(int value) {
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link ImmutableCard ImmutableCard}.
     * @return An immutable instance of Card
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableCard build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableCard(bulls, value);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_BULLS) != 0) attributes.add("bulls");
      if ((initBits & INIT_BIT_VALUE) != 0) attributes.add("value");
      return "Cannot build Card, some of required attributes are not set " + attributes;
    }
  }
}
