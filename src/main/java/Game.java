import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Dealer dealer;
    private Deck deck;

    public Game (Dealer dealer){
        players = new ArrayList<Player>();
        this.dealer = dealer;
        deck = new Deck();

    }

    public int countPlayers(){
        return players.size();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void deal() {
        for (Player player : players) this.dealer.deal(deck, player);
        dealer.dealSelf(deck);
    }

    public Player topPlayer(){
        Player topPlayer = players.get(0);
        for (Player player: players) {
            if (player.getHandValue() > topPlayer.getHandValue()) {
                topPlayer = player;
            }
        }
        return topPlayer;
    }

    public String findWinner(){
        String winnerName;
        if (topPlayer().getHandValue() > dealer.getHandValue()){
            return topPlayer().getName() + " wins with " + topPlayer().getHandValue() + " points!";
        } else {
            return dealer.getName() + " wins with " + dealer.getHandValue() + " points!";
        }
    }

}
