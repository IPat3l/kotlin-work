// Task 5.4.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: expecting a single command line argument")
        exitProcess(1)
    }

    if (args[0].isTooLong()) {
        println("${args[0]} is too long")
    } else {
        println("${args[0]} is ok")
    }

}