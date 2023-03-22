package how.tdd.poker.patterns

import how.tdd.poker.core.Card
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OnePairTest {
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
        val patternMatcher = OnePair()

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
}
