package poker;

public class Card implements Comparable<Card> {

    private final Suit suit;
    private final int rank;

    public Card(Suit s, int rank) {
        this.suit = s;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getRank() {
        return rank;
    }

    public boolean isAce() {
        return getRank() == 1;
    }

    public boolean isKing() {
        return getRank() == 13;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.rank, other.rank);
    }

}
