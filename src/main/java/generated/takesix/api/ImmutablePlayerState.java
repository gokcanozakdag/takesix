package takesix.api;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
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
 * Immutable implementation of {@link PlayerState}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlayerState.builder()}.
 */
@Generated(from = "PlayerState", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePlayerState extends PlayerState {
  private final int points;
  private final ImmutableList<Card> cards;

  private ImmutablePlayerState(int points, ImmutableList<Card> cards) {
    this.points = points;
    this.cards = cards;
  }

  /**
   * @return The value of the {@code points} attribute
   */
  @Override
  public int points() {
    return points;
  }

  /**
   * @return The value of the {@code cards} attribute
   */
  @Override
  public ImmutableList<Card> cards() {
    return cards;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlayerState#points() points} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for points
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlayerState withPoints(int value) {
    if (this.points == value) return this;
    return new ImmutablePlayerState(value, this.cards);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PlayerState#cards() cards}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlayerState withCards(Card... elements) {
    ImmutableList<Card> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePlayerState(this.points, newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PlayerState#cards() cards}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of cards elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlayerState withCards(Iterable<? extends Card> elements) {
    if (this.cards == elements) return this;
    ImmutableList<Card> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePlayerState(this.points, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlayerState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlayerState
        && equalTo((ImmutablePlayerState) another);
  }

  private boolean equalTo(ImmutablePlayerState another) {
    return points == another.points
        && cards.equals(another.cards);
  }

  /**
   * Computes a hash code from attributes: {@code points}, {@code cards}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + points;
    h += (h << 5) + cards.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PlayerState} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PlayerState")
        .omitNullValues()
        .add("points", points)
        .add("cards", cards)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link PlayerState} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlayerState instance
   */
  public static ImmutablePlayerState copyOf(PlayerState instance) {
    if (instance instanceof ImmutablePlayerState) {
      return (ImmutablePlayerState) instance;
    }
    return ImmutablePlayerState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePlayerState ImmutablePlayerState}.
   * <pre>
   * ImmutablePlayerState.builder()
   *    .points(int) // required {@link PlayerState#points() points}
   *    .addCards|addAllCards(takesix.api.Card) // {@link PlayerState#cards() cards} elements
   *    .build();
   * </pre>
   * @return A new ImmutablePlayerState builder
   */
  public static ImmutablePlayerState.Builder builder() {
    return new ImmutablePlayerState.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePlayerState ImmutablePlayerState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlayerState", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_POINTS = 0x1L;
    private long initBits = 0x1L;

    private int points;
    private ImmutableList.Builder<Card> cards = ImmutableList.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PlayerState} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PlayerState instance) {
      Objects.requireNonNull(instance, "instance");
      points(instance.points());
      addAllCards(instance.cards());
      return this;
    }

    /**
     * Initializes the value for the {@link PlayerState#points() points} attribute.
     * @param points The value for points 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder points(int points) {
      this.points = points;
      initBits &= ~INIT_BIT_POINTS;
      return this;
    }

    /**
     * Adds one element to {@link PlayerState#cards() cards} list.
     * @param element A cards element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCards(Card element) {
      this.cards.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PlayerState#cards() cards} list.
     * @param elements An array of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCards(Card... elements) {
      this.cards.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link PlayerState#cards() cards} list.
     * @param elements An iterable of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder cards(Iterable<? extends Card> elements) {
      this.cards = ImmutableList.builder();
      return addAllCards(elements);
    }

    /**
     * Adds elements to {@link PlayerState#cards() cards} list.
     * @param elements An iterable of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllCards(Iterable<? extends Card> elements) {
      this.cards.addAll(elements);
      return this;
    }

    /**
     * Builds a new {@link ImmutablePlayerState ImmutablePlayerState}.
     * @return An immutable instance of PlayerState
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePlayerState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePlayerState(points, cards.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_POINTS) != 0) attributes.add("points");
      return "Cannot build PlayerState, some of required attributes are not set " + attributes;
    }
  }
}
