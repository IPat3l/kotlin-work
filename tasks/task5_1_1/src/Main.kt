// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: Expecting 2 command line arguments")
        exitProcess(1)
    }

    val isAnagram = anagrams(args[0], args[1])
    if (isAnagram) {
        println("${args[0]} and ${args[1]} are anagrams")
    }
    else {
        println("${args[0]} and ${args[1]} are not anagrams")
    }
}