// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, numDice: Int = 1) {
    var total = 0
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        for (i in 1..numDice) {
            val result = Random.nextInt(1, sides + 1)
            total += result
        }
        println("You rolled $numDice d$sides for a total of $total")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}