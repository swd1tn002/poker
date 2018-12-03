package tests;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import poker.Card;
import poker.Hand;
import poker.Suit;

public class BasicTest {

    protected int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;

    protected Card[] hearts = createCards(Suit.HEARTS);
    protected Card[] diamonds = createCards(Suit.DIAMONDS);
    protected Card[] spades = createCards(Suit.SPADES);
    protected Card[] clubs = createCards(Suit.CLUBS);

    @Test
    public void testPairOfAces() {
        Hand hand = new Hand(hearts[ACE], diamonds[1], spades[4], clubs[6], clubs[8]);
        assertTrue(hand.isPair());

        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void testThreeOfAKind() {
        Hand hand = new Hand(hearts[10], spades[1], diamonds[10], diamonds[7], clubs[10]);
        assertTrue(hand.isThreeOfAKind());

        assertFalse(hand.isFullHouse());
        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isFourOfAKind());
    }

    @Test
    public void testFourOfAKind() {
        Hand hand = new Hand(hearts[10], spades[10], diamonds[10], diamonds[7], clubs[10]);
        assertTrue(hand.isFourOfAKind());

        assertFalse(hand.isFullHouse());
        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isThreeOfAKind());
    }

    @Test
    public void testFullHouse() {
        Hand hand = new Hand(hearts[10], spades[7], diamonds[10], diamonds[7], clubs[10]);
        assertTrue(hand.isFullHouse());
        assertTrue(hand.isPair());
        assertTrue(hand.isThreeOfAKind());

        assertFalse(hand.isTwoPairs());
        assertFalse(hand.isFourOfAKind());
    }

    @Test
    public void testFlush() {
        Hand hand = new Hand(hearts[10], hearts[8], hearts[6], hearts[4], hearts[2]);

        assertTrue(hand.isFlush());

        assertFalse(hand.isStraightFlush());
    }

    private Card[] createCards(Suit s) {
        Card[] cards = new Card[14];
        for (int i = 1; i <= 13; i++) {
            cards[i] = new Card(s, i);
        }
        return cards;
    }

}
