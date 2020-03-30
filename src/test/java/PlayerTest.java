import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;

    @Before
    public void before(){
        player = new Player("Gareth");
        deck = new Deck();
    }

    @Test
    public void playerHasName(){
        assertEquals("Gareth", player.getName());
    }

    @Test
    public void playerHasHand(){
        assertEquals(0, player.countCards());
    }

    @Test
    public void playerCanAddCard(){
        player.add(deck.getCard());
        assertEquals(1, player.countCards());
    }
}
