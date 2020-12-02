package takesix.players.strategy;

import takesix.api.Card;
import takesix.api.PlayerContext;
import takesix.api.Table;

import java.util.List;

public class LowestRowSelect implements RowSelectStrategy{
    @Override
    public int selectRow(PlayerContext playerContext, List<Card> remainingCards) {
        Table table = playerContext.table();

        int lowestRowIndex = 0;
        int lowestRowValue = Integer.MAX_VALUE;

        for (int i = 0; i < 4; i++) {
            int rowValue = table.getRow(i).stream().map(Card::value).reduce((a, b) -> a + b).get();

            if (rowValue < lowestRowValue) {
                lowestRowIndex = i;
                lowestRowValue = rowValue;
            }
        }

        return lowestRowIndex;
    }
}
