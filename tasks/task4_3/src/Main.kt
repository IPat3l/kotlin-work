// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Check if 3 command line arguments have been supplied
    if (args.size != 3 ) {
        println("Error: 3 integer arguments required on command line")
        exitProcess(1)
    }

    // Convert said 3 arguments to integers.
    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()

    // Calculate & print rounded average mark
    val average_mark = ((mark1 + mark2 + mark3) / 3)
    println("Average mark is ${average_mark.toDouble().roundToInt()}")

    // Find & print corresponding grade
    val grade = when (average_mark) {
        in 0..39   -> "Fail"
        in 40..69  -> "Pass"
        in 70..100 -> "Distinction"
        else       -> "?"
    }
    println("Grade: $grade")
}