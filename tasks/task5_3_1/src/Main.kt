// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String> = emptyArray()) {
    if (args.size == 0) {
        for (i in 1..10) {
            rollDie()
        }
    } else {
        for (i in 1..10) {
            rollDie(args[0].toInt())
        }
    }
}