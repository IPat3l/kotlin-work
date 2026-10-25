// Task 12.8.2: program to manipulate playing cards
import Card.Rank
import Card.Suit

fun main() {
    var deck = mutableListOf<Card>()

    for (suit in Suit.entries) {
        for (rank in Rank.entries) {
            deck.add(Card(rank, suit))
        }
    }

    deck.shuffle()
    deck.forEach {
        println("${it.fullName}")
    }
}