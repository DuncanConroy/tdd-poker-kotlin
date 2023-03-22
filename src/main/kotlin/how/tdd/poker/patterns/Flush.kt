package how.tdd.poker.patterns

import how.tdd.poker.core.Card

class Flush {
    fun detect(cards: List<Card>) = cards
        .groupBy(Card::symbol)
        .filter { (_, list) -> list.size == 5 }
        .flatMap { (_, list) -> list }
        .sortedByDescending(Card::valueRank)
}
