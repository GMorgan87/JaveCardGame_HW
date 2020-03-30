import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Player player;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
    }

    @Test
    public void dealerHasName(){
        assertEquals("Dealer", dealer.getName());
    }

    @Test
    public void dealerHasHand(){
        assertEquals(0, dealer.countCards());
    }

    @Test
    public void dealerCanAddCard(){
        dealer.add(deck.getCard());
        assertEquals(1, dealer.countCards());
    }

    @Test
    public void dealerCanDeal(){
        player = new Player("Gareth");
        dealer.deal(deck, player);
        assertEquals(1, player.countCards());
    }

    @Test
    public void dealerCanDealToSelf(){
        dealer.dealSelf(deck);
        assertEquals(1, dealer.countCards());
    }
}
