package how.tdd.poker.patterns

import how.tdd.poker.core.Card

class OnePair {
    fun detect(cards: List<Card>): List<Card> {
        val result = mutableSetOf<Card>()
        cards.forEach { card ->
            cards.forEach { cardInner ->
                if (card.symbol != cardInner.symbol && card.value == cardInner.value) {
                    result.add(card)
                    result.add(cardInner)
                }
            }
        }
        return result.sortedByDescending { it -> it.symbolRank() }.toList()
    }
}
