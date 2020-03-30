import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;


    public Dealer (){
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return "Dealer";
    }

    public int countCards(){
        return this.hand.size();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void deal(Deck deck, Player player) {
        player.add(deck.getCard());
    }

    public void dealSelf(Deck deck) {
        this.add(deck.getCard());
    }

    public int getHandValue(){
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }
}
