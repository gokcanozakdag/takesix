package takesix.api;

import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    Map<Integer, List<Card>> rows;

    private Table(List<Card> initialCards) {
        rows = new HashMap<>();
        for (int i = 0; i < initialCards.size(); i++) {
            Card card = initialCards.get(i);
            List<Card> curRow = new ArrayList<>();
            curRow.add(card);
            rows.put(i, curRow);
        }
    }

    public int tryAppendCard(Card card) {
        int closestIndex = -1;
        int closestValue = -1;

        for (Map.Entry<Integer, List<Card>> row : rows.entrySet()) {
            int rowIndex = row.getKey();
            Card lastCard = row.getValue().get(row.getValue().size() - 1);

            if (lastCard.value() < card.value()) {
                if (closestValue == -1 || closestValue < lastCard.value()) {
                    closestIndex = rowIndex;
                    closestValue = card.value();
                }
            }
        }

        if (closestIndex == - 1) {
            return -1;
        }

        List<Card> rowToAppend = new ArrayList<>(rows.get(closestIndex));

        if (rowToAppend.size() < 5) {
            rowToAppend.add(card);
            rows.put(closestIndex, rowToAppend);
            return 0;
        } else {
            return replaceRow(card, closestIndex);
        }
    }

    public int replaceRow(Card card, int rowIndex) {
        List<Card> existingRow = rows.get(rowIndex);
        int score = existingRow.stream().map(Card::bulls).reduce(0, (c1, c2) -> c1 + c2);

        rows.put(rowIndex, ImmutableList.of(card));
        return score;
    }

    public static Table withInitialCards(List<Card> cards) {
        if (cards.size() != 4) {
            throw new IllegalArgumentException("number of row should be equal to 4");
        }
        return new Table(cards);
    }

    public static Table withInitialCards(Card row1, Card row2, Card row3, Card row4) {
        return new Table(ImmutableList.of(row1, row2, row3, row4));
    }

    List<Card> getRow(int index) {
        return rows.get(index);
    }

    @Override
    public String toString() {
        return "Table:" + "\n" +
                rows.get(0) + "\n" +
                rows.get(1) + "\n" +
                rows.get(2) + "\n" +
                rows.get(3) + "\n";
    }
}
