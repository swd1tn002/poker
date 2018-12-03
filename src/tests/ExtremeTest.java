package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.Hand;

public class ExtremeTest extends AdvancedTest {

    @Test
    public void testStraightWith6Cards() {
        Hand hand = new Hand(hearts[2], diamonds[3], diamonds[1], spades[4], clubs[5], clubs[6]);

        assertTrue(hand.isStraight());
    }

    @Test
    public void testFullHouseWith6Cards() {
        Hand hand = new Hand(hearts[2], diamonds[2], spades[2], clubs[2], diamonds[ACE], clubs[ACE]);

        assertTrue(hand.isFullHouse());
        assertTrue(hand.isPair());
        assertTrue(hand.isFourOfAKind());

        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void testRoyalFlushWith4Cards() {
        Hand hand = new Hand(spades[1], spades[KING], spades[JACK], spades[QUEEN]);

        assertTrue(hand.isFlush());
        assertTrue(hand.isStraight());
        assertTrue(hand.isStraightFlush());
        assertTrue(hand.isRoyalFlush());

        assertFalse(hand.isPair());
    }
}
