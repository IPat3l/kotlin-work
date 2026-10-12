// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expecting a single command line argument")
        exitProcess(1)
    }

    val data = readData(args[0])
    stats(data)
}