package takesix.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;
    private Random random = new Random();

    private Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getRandomCards(int numCards) {
        if (numCards > cards.size()) {
            throw new IllegalArgumentException("not enough cards");
        }

        List<Card> result = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            int randomIndex = random.nextInt(cards.size());
            result.add(cards.remove(randomIndex));
        }
        return result;
    }

    public int size() {
        return cards.size();
    }

    public static Deck create() {
        List<Card> cards = new ArrayList<>();

        for (int i = 1; i <= 104; i++) {
            cards.add(takesix.api.ImmutableCard.builder()
                    .value(i)
                    .bulls(calculateBulls(i))
                    .build());
        }

        return new Deck(cards);
    }

    private static int calculateBulls(int value) {
        if (value % 55 == 0) {
            return 7;
        }

        if (value % 11 == 0) {
            return 5;
        }

        if (value % 10 == 0) {
            return 3;
        }

        if (value % 5 == 0) {
            return 2;
        }

        return 1;
    }
}
