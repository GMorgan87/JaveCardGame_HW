import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Deck deck;
    Dealer dealer;
    Player player1;
    Player player2;
    ArrayList<Player> players;

    @Before
    public void before(){
        dealer = new Dealer();
        game = new Game(dealer);
        deck = new Deck();
        player1 = new Player("Gareth");
        player2 = new Player("Aga");
        players = new ArrayList<Player>();
    }

    @Test
    public void canCountPlayers(){
        assertEquals(0, game.countPlayers());
    }

    @Test
    public void canAddPlayer(){
        game.addPlayer(player1);
        assertEquals(1, game.countPlayers());
    }

    @Test
    public void canDealToPlayersAndSelf(){
        game.addPlayer(player1);
        game.deal();
        assertEquals(1, player1.countCards());
        assertEquals(1, dealer.countCards());
    }

    @Test
    public void getGetWinner(){
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.deal();
        game.deal();
        System.out.println(game.findWinner());
    }
}
