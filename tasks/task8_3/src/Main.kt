// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expecting a single command line argument")
        exitProcess(1)
    }

    val data = fetchData(args[0])
    println("Average Temp: ${data.map { it.second }.average()}")
    // or println("Average Temp: ${data.sumOf { it.second } / data.size}")
    println("Min Temp: ${data.minBy { it.second }}")
    println("Max Temp: ${data.maxBy { it.second }}")
}
