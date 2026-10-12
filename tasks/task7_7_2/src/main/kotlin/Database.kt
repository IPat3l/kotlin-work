// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map
    val filePath = Path(filename)
    var nameNumber: List<String>
    filePath.forEachLine() {
        nameNumber = it.split(',')
        this[nameNumber[0]]=nameNumber[1]
    }
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    val filePath = Path(filename)
    filePath.writer().use {
        for ((key, value) in this) {
            it.write("$key,$value\n")
        }
    }
}
