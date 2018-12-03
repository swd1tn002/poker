package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.Hand;

public class AdvancedTest extends BasicTest {

    @Test
    public void testStraight() {
        Hand hand = new Hand(clubs[6], hearts[2], diamonds[3], spades[4], clubs[5]);

        assertTrue(hand.isStraight());

        assertFalse(hand.isPair());
        assertFalse(hand.isStraightFlush());
        assertFalse(hand.isFlush());
    }

    @Test
    public void testStraightFlush() {
        Hand hand = new Hand(spades[6], spades[2], spades[3], spades[4], spades[5]);

        assertTrue(hand.isFlush());
        assertTrue(hand.isStraight());
        assertTrue(hand.isStraightFlush());

        assertFalse(hand.isRoyalFlush());
        assertFalse(hand.isPair());
    }

    @Test
    public void testStraightWithHighAce() {
        Hand hand = new Hand(hearts[1], spades[JACK], hearts[QUEEN], clubs[KING], hearts[10]);

        assertTrue(hand.isStraight());

        assertFalse(hand.isFlush());
        assertFalse(hand.isStraightFlush());
    }

    @Test
    public void testRoyalFlush() {
        Hand hand = new Hand(spades[10], spades[1], spades[KING], spades[JACK], spades[QUEEN]);

        assertTrue(hand.isFlush());
        assertTrue(hand.isStraight());
        assertTrue(hand.isStraightFlush());
        assertTrue(hand.isRoyalFlush());

        assertFalse(hand.isPair());
    }
}
