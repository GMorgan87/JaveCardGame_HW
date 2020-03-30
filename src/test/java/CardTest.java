import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Value.ACE);
    }

    @Test
    public void hasSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void hasValue(){
        assertEquals(Value.ACE, card.getValue());
    }

}
