package takesix.api;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    public void creates104Cards() {
        Deck deck = Deck.create();
        assertTrue(deck.size() == 104);
    }

}