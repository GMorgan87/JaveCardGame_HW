public class Card {

    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;

    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValue(){
        return this. value.getValue();
    }
}
