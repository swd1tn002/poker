package poker;

public enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;

    public Card get(int rank) {
        return new Card(this, rank);
    }

    public final Card ACE = new Card(this, 1);
    public final Card TWO = new Card(this, 2);
    public final Card THREE = new Card(this, 3);
    public final Card FOUR = new Card(this, 4);
    public final Card FIVE = new Card(this, 5);
    public final Card SIX = new Card(this, 6);
    public final Card SEVEN = new Card(this, 7);
    public final Card EIGHT = new Card(this, 8);
    public final Card NINE = new Card(this, 9);
    public final Card TEN = new Card(this, 10);
    public final Card JACK = new Card(this, 11);
    public final Card QUEEN = new Card(this, 12);
    public final Card KING = new Card(this, 13);
}