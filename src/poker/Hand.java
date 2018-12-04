package poker;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards = new ArrayList<>();

    public Hand(Card... cards) {
        for (Card c : cards) {
            this.cards.add(c);
        }
    }

    /**
     * Any five cards of the same suit.
     */
    public boolean isFlush() {
        return false;
    }

    /**
     * Two cards of the same rank.
     */
    public boolean isPair() {
        return false;
    }

    /**
     * Three cards of the same rank.
     */
    public boolean isThreeOfAKind() {
        return false;
    }

    /**
     * Two different pairs.
     */
    public boolean isTwoPairs() {
        return false;
    }

    /**
     * Four cards of the same rank.
     */
    public boolean isFourOfAKind() {
        return false;
    }

    /**
     * Three of a kind with a pair.
     */
    public boolean isFullHouse() {
        return false;
    }

    /**
     * Five cards in a sequence.
     */
    public boolean isStraight() {
        return false;
    }

    /**
     * Five cards in a sequence, all in the same suit.
     */
    public boolean isStraightFlush() {
        return false;
    }

    /**
     * A, K, Q, J, 10, all the same suit.
     */
    public boolean isRoyalFlush() {
        return false;
    }
}
