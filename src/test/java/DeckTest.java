import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void hasCards(){
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canDeal(){
        deck.getCard();
        assertEquals(51, deck.countCards());
    }
}
