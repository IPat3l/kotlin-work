// Task 5.3.2: main program

fun main(args: Array<String> = emptyArray()) {
    if (args.size == 0) {
        for (i in 1..5) {
            rollDice()
        }
    } else {
        val numToRoll = args[0].substringBefore('d').toInt()
        val dieSides = args[0].substringAfter('d').toInt()
        rollDice(dieSides, numToRoll)
    }
}