package how.tdd.poker.patterns

import how.tdd.poker.core.Card
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FlushTest {
    @Test
    fun `Flush is detected from 7 cards` () {
        // given: 7 specific cards with a flush
        val cards = listOf(
            Card("Diamonds", "9"),
            Card("Diamonds", "J"),
            Card("Diamonds", "8"),
            Card("Diamonds", "3"),
            Card("Clubs", "8"),
            Card("Diamonds", "4"),
            Card("Hearts", "3"),
        )
        val patternMatcher = Flush()

        // when: the pattern detection is run
        val result = patternMatcher.detect(cards)

        // then: the pattern should contain 5 cards
        assertEquals(5, result.size)

        // and: the result is correctly ordered
        assertEquals(cards[1], result[0])
        assertEquals(cards[0], result[1])
        assertEquals(cards[2], result[2])
        assertEquals(cards[5], result[3])
        assertEquals(cards[3], result[4])
    }

    @Test
    fun `No Flush is detected from 7 cards` () {
        // given: 7 specific cards with no flush pattern
        val cards = listOf(
            Card("Diamonds", "9"),
            Card("Clubs", "J"),
            Card("Hearts", "8"),
            Card("Diamonds", "3"),
            Card("Clubs", "8"),
            Card("Diamonds", "4"),
            Card("Hearts", "3"),
        )
        val patternMatcher = Flush()

        // when: the pattern detection is run
        val result = patternMatcher.detect(cards)

        // then: the pattern should be empty
        assertTrue(result.isEmpty())
    }
}
