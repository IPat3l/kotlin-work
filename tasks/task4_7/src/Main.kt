// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import kotlin.io.path.*

fun main(args: Array<String>) {
    // Check if single argument is passed on command line
    if (args.size != 1) {
        println("Error: Expecting a single filepath argument on command line")
        exitProcess(1)
    }

    // create Path object & other relevant variables
    val filePath = Path(args[0])
    var LLNum = 1
    var longestLine = 0

    // Run through each line
    filePath.useLines {
        var currentLine = 1
        for (line in it) {
            if (line.length > longestLine) {
                LLNum = currentLine
                longestLine = line.length
            }
            currentLine += 1
        }
    }

    println("Line $LLNum is the longest (length = $longestLine)")
}