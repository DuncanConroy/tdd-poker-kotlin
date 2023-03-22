package how.tdd.poker.core

class Deck {
    private val cards = mutableListOf<Card>()
    init {
        (2..10).forEach { i ->
            cards.add(Card(i.toString(), "Spades"))
            cards.add(Card(i.toString(), "Hearts"))
            cards.add(Card(i.toString(), "Clubs"))
            cards.add(Card(i.toString(), "Diamonds"))
        }
        listOf("J", "Q", "K", "A").forEach { i ->
            cards.add(Card(i, "Spades"))
            cards.add(Card(i, "Hearts"))
            cards.add(Card(i, "Clubs"))
            cards.add(Card(i, "Diamonds"))
        }
    }

    fun draw(): Card {
        return cards.removeAt(cards.size - 1)
    }

    fun shuffle() {
        cards.shuffle()
    }

    fun numCards(): Int {
        return cards.size
    }

    fun peek(): Card {
        return cards.last()
    }

    fun contains(card: Card): Boolean {
        return cards.contains(card)
    }
}
