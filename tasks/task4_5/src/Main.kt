// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expecting one integer argument on command line")
        exitProcess(1)
    }

    val intLimit = args[0].toInt()
    var sum: Long = 0
    for (num in 1..intLimit step 2) {
        sum += num
    }
    println(sum)
}
