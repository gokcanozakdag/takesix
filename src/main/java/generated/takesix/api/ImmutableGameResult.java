package takesix.api;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Var;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link GameResult}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGameResult.builder()}.
 */
@Generated(from = "GameResult", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGameResult implements GameResult {
  private final PlayerId winner;
  private final ImmutableMap<PlayerId, Integer> scores;

  private ImmutableGameResult(
      PlayerId winner,
      ImmutableMap<PlayerId, Integer> scores) {
    this.winner = winner;
    this.scores = scores;
  }

  /**
   * @return The value of the {@code winner} attribute
   */
  @Override
  public PlayerId winner() {
    return winner;
  }

  /**
   * @return The value of the {@code scores} attribute
   */
  @Override
  public ImmutableMap<PlayerId, Integer> scores() {
    return scores;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GameResult#winner() winner} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for winner
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGameResult withWinner(PlayerId value) {
    if (this.winner == value) return this;
    PlayerId newValue = Objects.requireNonNull(value, "winner");
    return new ImmutableGameResult(newValue, this.scores);
  }

  /**
   * Copy the current immutable object by replacing the {@link GameResult#scores() scores} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the scores map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGameResult withScores(Map<? extends PlayerId, ? extends Integer> entries) {
    if (this.scores == entries) return this;
    ImmutableMap<PlayerId, Integer> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableGameResult(this.winner, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGameResult} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGameResult
        && equalTo((ImmutableGameResult) another);
  }

  private boolean equalTo(ImmutableGameResult another) {
    return winner.equals(another.winner)
        && scores.equals(another.scores);
  }

  /**
   * Computes a hash code from attributes: {@code winner}, {@code scores}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + winner.hashCode();
    h += (h << 5) + scores.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code GameResult} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GameResult")
        .omitNullValues()
        .add("winner", winner)
        .add("scores", scores)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GameResult} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GameResult instance
   */
  public static ImmutableGameResult copyOf(GameResult instance) {
    if (instance instanceof ImmutableGameResult) {
      return (ImmutableGameResult) instance;
    }
    return ImmutableGameResult.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGameResult ImmutableGameResult}.
   * <pre>
   * ImmutableGameResult.builder()
   *    .winner(takesix.api.PlayerId) // required {@link GameResult#winner() winner}
   *    .putScores|putAllScores(takesix.api.PlayerId => int) // {@link GameResult#scores() scores} mappings
   *    .build();
   * </pre>
   * @return A new ImmutableGameResult builder
   */
  public static ImmutableGameResult.Builder builder() {
    return new ImmutableGameResult.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGameResult ImmutableGameResult}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GameResult", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_WINNER = 0x1L;
    private long initBits = 0x1L;

    private @Nullable PlayerId winner;
    private ImmutableMap.Builder<PlayerId, Integer> scores = ImmutableMap.builder();

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GameResult} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GameResult instance) {
      Objects.requireNonNull(instance, "instance");
      winner(instance.winner());
      putAllScores(instance.scores());
      return this;
    }

    /**
     * Initializes the value for the {@link GameResult#winner() winner} attribute.
     * @param winner The value for winner 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder winner(PlayerId winner) {
      this.winner = Objects.requireNonNull(winner, "winner");
      initBits &= ~INIT_BIT_WINNER;
      return this;
    }

    /**
     * Put one entry to the {@link GameResult#scores() scores} map.
     * @param key The key in the scores map
     * @param value The associated value in the scores map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putScores(PlayerId key, int value) {
      this.scores.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link GameResult#scores() scores} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putScores(Map.Entry<? extends PlayerId, ? extends Integer> entry) {
      this.scores.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link GameResult#scores() scores} map. Nulls are not permitted
     * @param entries The entries that will be added to the scores map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder scores(Map<? extends PlayerId, ? extends Integer> entries) {
      this.scores = ImmutableMap.builder();
      return putAllScores(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link GameResult#scores() scores} map. Nulls are not permitted
     * @param entries The entries that will be added to the scores map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllScores(Map<? extends PlayerId, ? extends Integer> entries) {
      this.scores.putAll(entries);
      return this;
    }

    /**
     * Builds a new {@link ImmutableGameResult ImmutableGameResult}.
     * @return An immutable instance of GameResult
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGameResult build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGameResult(winner, scores.build());
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_WINNER) != 0) attributes.add("winner");
      return "Cannot build GameResult, some of required attributes are not set " + attributes;
    }
  }
}
