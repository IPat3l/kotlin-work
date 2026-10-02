// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText
import kotlin.io.path.readLines

fun main() {
    val filePath = Path("test.txt")
    // filePath.writeText("Hello World~")
    // filePath.writeText("Goodbye World :(")
    // filePath.appendText("\nIm back!")

    val fileContents = filePath.readText()
    // This reads the entire file contents as a single String object
    println("$fileContents")

    val fileContentsByLine = filePath.readLines()
    // This reads the entire file contents as a List<String> object
    println("${fileContentsByLine[0]}")
    println("${fileContentsByLine[1]}")
}
