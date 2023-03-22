package how.tdd.poker.patterns

import how.tdd.poker.core.Card
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class NOfAKindTest {
    @Test
    fun `One Pair is detected from 7 cards` () {
        // given: 7 specific cards with a pair
        val cards = listOf(
            Card("Diamonds", "8"),
            Card("Clubs", "K"),
            Card("Spades", "A"),
            Card("Spades", "2"),
            Card("Clubs", "8"),
            Card("Spades", "4"),
            Card("Hearts", "3"),
        )
        val patternMatcher = NOfAKind()

        // when: the pattern detection is run
        val result = patternMatcher.detect(cards)

        // then: the pattern should match and return the matching cards
        assertEquals(2, result.size)
        assertTrue(result.contains(cards[0]))
        assertTrue(result.contains(cards[4]))

        // and: the result is correctly ordered
        assertEquals(cards[4], result[0])
        assertEquals(cards[0], result[1])
    }

    @Test
    fun `Three of a kind is detected from 7 cards` () {
        // given: 7 specific cards with a pair
        val cards = listOf(
            Card("Diamonds", "8"),
            Card("Clubs", "K"),
            Card("Spades", "A"),
            Card("Spades", "2"),
            Card("Clubs", "8"),
            Card("Spades", "4"),
            Card("Hearts", "8"),
        )
        val patternMatcher = NOfAKind()

        // when: the pattern detection is run
        val result = patternMatcher.detect(cards)

        // then: the pattern should match and return the matching cards
        assertEquals(3, result.size)
        assertTrue(result.contains(cards[0]))
        assertTrue(result.contains(cards[6]))
        assertTrue(result.contains(cards[4]))

        // and: the result is correctly ordered
        assertEquals(cards[4], result[0])
        assertEquals(cards[6], result[1])
        assertEquals(cards[0], result[2])
    }

    @Test
    fun `Four of a kind is detected from 7 cards` () {
        // given: 7 specific cards with a pair
        val cards = listOf(
            Card("Diamonds", "8"),
            Card("Clubs", "K"),
            Card("Spades", "8"),
            Card("Spades", "2"),
            Card("Clubs", "8"),
            Card("Spades", "4"),
            Card("Hearts", "8"),
        )
        val patternMatcher = NOfAKind()

        // when: the pattern detection is run
        val result = patternMatcher.detect(cards)

        // then: the pattern should match and return the matching cards
        assertEquals(4, result.size)
        assertTrue(result.contains(cards[0]))
        assertTrue(result.contains(cards[2]))
        assertTrue(result.contains(cards[4]))
        assertTrue(result.contains(cards[6]))

        // and: the result is correctly ordered
        assertEquals(cards[4], result[0])
        assertEquals(cards[2], result[1])
        assertEquals(cards[6], result[2])
        assertEquals(cards[0], result[3])
    }
}
