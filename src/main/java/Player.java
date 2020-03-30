import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player (String name){
        this.name = name;
        hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int countCards(){
        return this.hand.size();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public int getHandValue(){
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
    }
}
