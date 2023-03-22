package how.tdd.poker.core

class Card(val symbol: String, val value: String) {
    fun symbolRank(): Int {
        return when (symbol) {
            "Diamonds" -> 0
            "Hearts" -> 1
            "Spades" -> 2
            "Clubs" -> 3
            else -> -1
        }
    }

    fun valueRank(): Int {
        return when (value) {
            "A" -> 14
            "K" -> 13
            "Q" -> 12
            "J" -> 11
            else -> value.toInt()
        }
    }
}
