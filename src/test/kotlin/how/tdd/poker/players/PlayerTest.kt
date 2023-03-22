package how.tdd.poker.players

import how.tdd.poker.core.Card
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    fun `receiveCard saves it to the player's CardCollection`() {
        // given: a Player and an unrelated card
        val player = Player("Daniel")
        val card = Card("Spades", "4")

        // when: a card is received
        player.receiveCard(card)

        // then: the card is present in the Player's card collection
        assertEquals(card, player.peek())
    }

    @Test
    fun `getCards returns all owned cards`() {
        // given: a Player with two cards
        val player = Player("Daniel")
        val cardsList = listOf(Card("Diamonds", "4"), Card("Clubs", "Q"))
        cardsList.forEach(player::receiveCard)

        // when: getCards is called
        val result = player.getCards()

        // then: all the Player's cards are returned
        assertEquals(cardsList, result)
    }
}
