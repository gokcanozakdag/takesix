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
 * Immutable implementation of {@link PlayerContext}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePlayerContext.builder()}.
 */
@Generated(from = "PlayerContext", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutablePlayerContext implements PlayerContext {
  private final Table table;
  private final ImmutableList<Card> cards;
  private final PlayerId playerId;

  private ImmutablePlayerContext(
      Table table,
      ImmutableList<Card> cards,
      PlayerId playerId) {
    this.table = table;
    this.cards = cards;
    this.playerId = playerId;
  }

  /**
   * @return The value of the {@code table} attribute
   */
  @Override
  public Table table() {
    return table;
  }

  /**
   * @return The value of the {@code cards} attribute
   */
  @Override
  public ImmutableList<Card> cards() {
    return cards;
  }

  /**
   * @return The value of the {@code playerId} attribute
   */
  @Override
  public PlayerId playerId() {
    return playerId;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlayerContext#table() table} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for table
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlayerContext withTable(Table value) {
    if (this.table == value) return this;
    Table newValue = Objects.requireNonNull(value, "table");
    return new ImmutablePlayerContext(newValue, this.cards, this.playerId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PlayerContext#cards() cards}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlayerContext withCards(Card... elements) {
    ImmutableList<Card> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePlayerContext(this.table, newValue, this.playerId);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link PlayerContext#cards() cards}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of cards elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePlayerContext withCards(Iterable<? extends Card> elements) {
    if (this.cards == elements) return this;
    ImmutableList<Card> newValue = ImmutableList.copyOf(elements);
    return new ImmutablePlayerContext(this.table, newValue, this.playerId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PlayerContext#playerId() playerId} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for playerId
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePlayerContext withPlayerId(PlayerId value) {
    if (this.playerId == value) return this;
    PlayerId newValue = Objects.requireNonNull(value, "playerId");
    return new ImmutablePlayerContext(this.table, this.cards, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePlayerContext} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePlayerContext
        && equalTo((ImmutablePlayerContext) another);
  }

  private boolean equalTo(ImmutablePlayerContext another) {
    return table.equals(another.table)
        && cards.equals(another.cards)
        && playerId.equals(another.playerId);
  }

  /**
   * Computes a hash code from attributes: {@code table}, {@code cards}, {@code playerId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + table.hashCode();
    h += (h << 5) + cards.hashCode();
    h += (h << 5) + playerId.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code PlayerContext} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("PlayerContext")
        .omitNullValues()
        .add("table", table)
        .add("cards", cards)
        .add("playerId", playerId)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link PlayerContext} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PlayerContext instance
   */
  public static ImmutablePlayerContext copyOf(PlayerContext instance) {
    if (instance instanceof ImmutablePlayerContext) {
      return (ImmutablePlayerContext) instance;
    }
    return ImmutablePlayerContext.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutablePlayerContext ImmutablePlayerContext}.
   * <pre>
   * ImmutablePlayerContext.builder()
   *    .table(takesix.api.Table) // required {@link PlayerContext#table() table}
   *    .addCards|addAllCards(takesix.api.Card) // {@link PlayerContext#cards() cards} elements
   *    .playerId(takesix.api.PlayerId) // required {@link PlayerContext#playerId() playerId}
   *    .build();
   * </pre>
   * @return A new ImmutablePlayerContext builder
   */
  public static ImmutablePlayerContext.Builder builder() {
    return new ImmutablePlayerContext.Builder();
  }

  /**
   * Builds instances of type {@link ImmutablePlayerContext ImmutablePlayerContext}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PlayerContext", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TABLE = 0x1L;
    private static final long INIT_BIT_PLAYER_ID = 0x2L;
    private long initBits = 0x3L;

    private @Nullable Table table;
    private ImmutableList.Builder<Card> cards = ImmutableList.builder();
    private @Nullable PlayerId playerId;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code PlayerContext} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(PlayerContext instance) {
      Objects.requireNonNull(instance, "instance");
      table(instance.table());
      addAllCards(instance.cards());
      playerId(instance.playerId());
      return this;
    }

    /**
     * Initializes the value for the {@link PlayerContext#table() table} attribute.
     * @param table The value for table 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder table(Table table) {
      this.table = Objects.requireNonNull(table, "table");
      initBits &= ~INIT_BIT_TABLE;
      return this;
    }

    /**
     * Adds one element to {@link PlayerContext#cards() cards} list.
     * @param element A cards element
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCards(Card element) {
      this.cards.add(element);
      return this;
    }

    /**
     * Adds elements to {@link PlayerContext#cards() cards} list.
     * @param elements An array of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addCards(Card... elements) {
      this.cards.add(elements);
      return this;
    }


    /**
     * Sets or replaces all elements for {@link PlayerContext#cards() cards} list.
     * @param elements An iterable of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder cards(Iterable<? extends Card> elements) {
      this.cards = ImmutableList.builder();
      return addAllCards(elements);
    }

    /**
     * Adds elements to {@link PlayerContext#cards() cards} list.
     * @param elements An iterable of cards elements
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder addAllCards(Iterable<? extends Card> elements) {
      this.cards.addAll(elements);
      return this;
    }

    /**
     * Initializes the value for the {@link PlayerContext#playerId() playerId} attribute.
     * @param playerId The value for playerId 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder playerId(PlayerId playerId) {
      this.playerId = Objects.requireNonNull(playerId, "playerId");
      initBits &= ~INIT_BIT_PLAYER_ID;
      return this;
    }

    /**
     * Builds a new {@link ImmutablePlayerContext ImmutablePlayerContext}.
     * @return An immutable instance of PlayerContext
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutablePlayerContext build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutablePlayerContext(table, cards.build(), playerId);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TABLE) != 0) attributes.add("table");
      if ((initBits & INIT_BIT_PLAYER_ID) != 0) attributes.add("playerId");
      return "Cannot build PlayerContext, some of required attributes are not set " + attributes;
    }
  }
}
