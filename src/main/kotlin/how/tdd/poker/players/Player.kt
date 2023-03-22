package how.tdd.poker.players

import how.tdd.poker.core.Card

class Player(val name:String) {
    private val cards = mutableListOf<Card>()

    fun receiveCard(card: Card) {
        cards.add(card)
    }

    fun getCards() = cards
    fun peek() = cards.last()
}
