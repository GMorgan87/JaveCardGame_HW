import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()){
            for (Value value : Value.values()){
                cards.add(new Card(suit, value));
            }
        }
        Collections.shuffle(cards);
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public int countCards() {
        return this.cards.size();
    }

    public Card getCard() {
        return cards.remove(0);
    }
}
