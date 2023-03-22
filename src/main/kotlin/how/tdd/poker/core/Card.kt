package how.tdd.poker.core

class Card(val symbol: String, val value: String) {
    fun symbolRank(): Int {
        return when(symbol) {
            "Diamonds" -> 0
            "Hearts" -> 1
            "Spades" -> 2
            "Clubs" -> 3
            else -> -1
        }
    }
}
