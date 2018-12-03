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

    public boolean isPair() {
        return false;
    }

    public boolean isThreeOfAKind() {
        return false;
    }

    public boolean isTwoPairs() {
        return false;
    }

    public boolean isFourOfAKind() {
        return false;
    }

    public boolean isFullHouse() {
        return false;
    }

    public boolean isFlush() {
        return false;
    }

    public boolean isStraight() {
        return false;
    }

    public boolean isRoyalFlush() {
        return false;
    }

    public boolean isStraightFlush() {
        return false;
    }
}
