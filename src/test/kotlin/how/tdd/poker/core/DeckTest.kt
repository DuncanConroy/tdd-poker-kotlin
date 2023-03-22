package how.tdd.poker.core

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DeckTest {

    @Test
    fun `should create a deck with 52 cards`() {
        // given: nothing

        // when: a new deck is created
        val deck = Deck()

        // then: the deck should have 52 cards
        assertEquals(52, deck.numCards())
    }

    @Test
    fun `draw returns topmost card and removes it from the deck`() {
        // given: a deck with 52 cards
        val deck = Deck()
        val expectedCard = deck.peek()

        // when: a card is drawn
        val result = deck.draw()

        // then: the card should be the topmost card
        assertEquals(expectedCard, result)

        // and: the deck should have 51 cards
        assertEquals(51, deck.numCards())

        // and: the card must not be in the deck
        assertFalse(deck.contains(result))
    }

    @Test
    fun `shuffle randomizes the order of cards in the deck`() {
        // given: a deck with 52 cards
        val suffledDeck = Deck()
        val originalDeck = Deck()

        // when: the deck is shuffled
        suffledDeck.shuffle()

        // then: the shuffled deck has a different order than the original deck
        while (suffledDeck.numCards() > 0) {
            assertNotEquals(originalDeck.draw(), suffledDeck.draw())
        }
    }
}
