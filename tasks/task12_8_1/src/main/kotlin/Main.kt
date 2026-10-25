// Task 12.8.1: demo program for Day enum class
import kotlin.system.exitProcess

fun main() {
    print("Please enter a day: ")
    var input = readln()
    try {
        val day = Day.valueOf(input)
    }
    catch (Error: IllegalArgumentException) {
        println("Error: Day Class contains capitalised days of the week")
    }
}