package takesix.players;

import takesix.api.Card;
import takesix.api.Player;
import takesix.api.PlayerContext;
import takesix.api.Table;

import java.util.List;
import java.util.Random;

public class RandomPlayer implements Player {
    private Random random = new Random();

    @Override
    public int discardCard(PlayerContext playerContext) {
        System.out.println("I am " + playerContext.playerId() + ", discarding");
        System.out.println("Has cards: " + playerContext.cards());
        int pickedCard = random.nextInt(playerContext.cards().size());
        System.out.println("Picking card: " + playerContext.cards().get(pickedCard));
        return pickedCard;
    }

    @Override
    public int selectRow(PlayerContext playerContext, List<Card> remainingCards) {
        System.out.println("I am " + playerContext.playerId());
        System.out.println("Asked to pick a row, table:");
        System.out.println(playerContext.table());

        int pickedRow = random.nextInt(4);
        System.out.println("Picking row: " + pickedRow);
        return pickedRow;
    }
}
