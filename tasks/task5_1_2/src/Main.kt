// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expected a single command line argument")
        exitProcess(1)
    }

    for (i in 1..10) {
        rollDie(args[0].toInt())
    }
}