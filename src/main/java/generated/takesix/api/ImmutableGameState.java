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
 * Immutable implementation of {@link GameState}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGameState.builder()}.
 */
@Generated(from = "GameState", generator = "Immutables")
@SuppressWarnings({"all"})
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@CheckReturnValue
public final class ImmutableGameState extends GameState {
  private final ImmutableMap<PlayerId, Player> players;
  private final ImmutableMap<PlayerId, PlayerState> playerStates;
  private final Table table;
  private final int remainingTurns;

  private ImmutableGameState(
      ImmutableMap<PlayerId, Player> players,
      ImmutableMap<PlayerId, PlayerState> playerStates,
      Table table,
      int remainingTurns) {
    this.players = players;
    this.playerStates = playerStates;
    this.table = table;
    this.remainingTurns = remainingTurns;
  }

  /**
   * @return The value of the {@code players} attribute
   */
  @Override
  public ImmutableMap<PlayerId, Player> getPlayers() {
    return players;
  }

  /**
   * @return The value of the {@code playerStates} attribute
   */
  @Override
  public ImmutableMap<PlayerId, PlayerState> getPlayerStates() {
    return playerStates;
  }

  /**
   * @return The value of the {@code table} attribute
   */
  @Override
  public Table table() {
    return table;
  }

  /**
   * @return The value of the {@code remainingTurns} attribute
   */
  @Override
  public int remainingTurns() {
    return remainingTurns;
  }

  /**
   * Copy the current immutable object by replacing the {@link GameState#getPlayers() players} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the players map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGameState withPlayers(Map<? extends PlayerId, ? extends Player> entries) {
    if (this.players == entries) return this;
    ImmutableMap<PlayerId, Player> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableGameState(newValue, this.playerStates, this.table, this.remainingTurns);
  }

  /**
   * Copy the current immutable object by replacing the {@link GameState#getPlayerStates() playerStates} map with the specified map.
   * Nulls are not permitted as keys or values.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param entries The entries to be added to the playerStates map
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGameState withPlayerStates(Map<? extends PlayerId, ? extends PlayerState> entries) {
    if (this.playerStates == entries) return this;
    ImmutableMap<PlayerId, PlayerState> newValue = ImmutableMap.copyOf(entries);
    return new ImmutableGameState(this.players, newValue, this.table, this.remainingTurns);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GameState#table() table} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for table
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGameState withTable(Table value) {
    if (this.table == value) return this;
    Table newValue = Objects.requireNonNull(value, "table");
    return new ImmutableGameState(this.players, this.playerStates, newValue, this.remainingTurns);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GameState#remainingTurns() remainingTurns} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for remainingTurns
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGameState withRemainingTurns(int value) {
    if (this.remainingTurns == value) return this;
    return new ImmutableGameState(this.players, this.playerStates, this.table, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGameState} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGameState
        && equalTo((ImmutableGameState) another);
  }

  private boolean equalTo(ImmutableGameState another) {
    return players.equals(another.players)
        && playerStates.equals(another.playerStates)
        && table.equals(another.table)
        && remainingTurns == another.remainingTurns;
  }

  /**
   * Computes a hash code from attributes: {@code players}, {@code playerStates}, {@code table}, {@code remainingTurns}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    @Var int h = 5381;
    h += (h << 5) + players.hashCode();
    h += (h << 5) + playerStates.hashCode();
    h += (h << 5) + table.hashCode();
    h += (h << 5) + remainingTurns;
    return h;
  }

  /**
   * Prints the immutable value {@code GameState} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("GameState")
        .omitNullValues()
        .add("players", players)
        .add("playerStates", playerStates)
        .add("table", table)
        .add("remainingTurns", remainingTurns)
        .toString();
  }

  /**
   * Creates an immutable copy of a {@link GameState} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GameState instance
   */
  public static ImmutableGameState copyOf(GameState instance) {
    if (instance instanceof ImmutableGameState) {
      return (ImmutableGameState) instance;
    }
    return ImmutableGameState.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableGameState ImmutableGameState}.
   * <pre>
   * ImmutableGameState.builder()
   *    .putPlayers|putAllPlayers(takesix.api.PlayerId => takesix.api.Player) // {@link GameState#getPlayers() players} mappings
   *    .putPlayerStates|putAllPlayerStates(takesix.api.PlayerId => takesix.api.PlayerState) // {@link GameState#getPlayerStates() playerStates} mappings
   *    .table(takesix.api.Table) // required {@link GameState#table() table}
   *    .remainingTurns(int) // required {@link GameState#remainingTurns() remainingTurns}
   *    .build();
   * </pre>
   * @return A new ImmutableGameState builder
   */
  public static ImmutableGameState.Builder builder() {
    return new ImmutableGameState.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableGameState ImmutableGameState}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GameState", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_TABLE = 0x1L;
    private static final long INIT_BIT_REMAINING_TURNS = 0x2L;
    private long initBits = 0x3L;

    private ImmutableMap.Builder<PlayerId, Player> players = ImmutableMap.builder();
    private ImmutableMap.Builder<PlayerId, PlayerState> playerStates = ImmutableMap.builder();
    private @Nullable Table table;
    private int remainingTurns;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code GameState} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * Collection elements and entries will be added, not replaced.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder from(GameState instance) {
      Objects.requireNonNull(instance, "instance");
      putAllPlayers(instance.getPlayers());
      putAllPlayerStates(instance.getPlayerStates());
      table(instance.table());
      remainingTurns(instance.remainingTurns());
      return this;
    }

    /**
     * Put one entry to the {@link GameState#getPlayers() players} map.
     * @param key The key in the players map
     * @param value The associated value in the players map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putPlayers(PlayerId key, Player value) {
      this.players.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link GameState#getPlayers() players} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putPlayers(Map.Entry<? extends PlayerId, ? extends Player> entry) {
      this.players.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link GameState#getPlayers() players} map. Nulls are not permitted
     * @param entries The entries that will be added to the players map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder players(Map<? extends PlayerId, ? extends Player> entries) {
      this.players = ImmutableMap.builder();
      return putAllPlayers(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link GameState#getPlayers() players} map. Nulls are not permitted
     * @param entries The entries that will be added to the players map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllPlayers(Map<? extends PlayerId, ? extends Player> entries) {
      this.players.putAll(entries);
      return this;
    }

    /**
     * Put one entry to the {@link GameState#getPlayerStates() playerStates} map.
     * @param key The key in the playerStates map
     * @param value The associated value in the playerStates map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putPlayerStates(PlayerId key, PlayerState value) {
      this.playerStates.put(key, value);
      return this;
    }

    /**
     * Put one entry to the {@link GameState#getPlayerStates() playerStates} map. Nulls are not permitted
     * @param entry The key and value entry
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putPlayerStates(Map.Entry<? extends PlayerId, ? extends PlayerState> entry) {
      this.playerStates.put(entry);
      return this;
    }

    /**
     * Sets or replaces all mappings from the specified map as entries for the {@link GameState#getPlayerStates() playerStates} map. Nulls are not permitted
     * @param entries The entries that will be added to the playerStates map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder playerStates(Map<? extends PlayerId, ? extends PlayerState> entries) {
      this.playerStates = ImmutableMap.builder();
      return putAllPlayerStates(entries);
    }

    /**
     * Put all mappings from the specified map as entries to {@link GameState#getPlayerStates() playerStates} map. Nulls are not permitted
     * @param entries The entries that will be added to the playerStates map
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder putAllPlayerStates(Map<? extends PlayerId, ? extends PlayerState> entries) {
      this.playerStates.putAll(entries);
      return this;
    }

    /**
     * Initializes the value for the {@link GameState#table() table} attribute.
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
     * Initializes the value for the {@link GameState#remainingTurns() remainingTurns} attribute.
     * @param remainingTurns The value for remainingTurns 
     * @return {@code this} builder for use in a chained invocation
     */
    @CanIgnoreReturnValue 
    public final Builder remainingTurns(int remainingTurns) {
      this.remainingTurns = remainingTurns;
      initBits &= ~INIT_BIT_REMAINING_TURNS;
      return this;
    }

    /**
     * Builds a new {@link ImmutableGameState ImmutableGameState}.
     * @return An immutable instance of GameState
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableGameState build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableGameState(players.build(), playerStates.build(), table, remainingTurns);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_TABLE) != 0) attributes.add("table");
      if ((initBits & INIT_BIT_REMAINING_TURNS) != 0) attributes.add("remainingTurns");
      return "Cannot build GameState, some of required attributes are not set " + attributes;
    }
  }
}
