// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: expected an argument")
        exitProcess(1)
    }

    try {
        var data = readData(args[0])
        println("Variance is ${variance(data)}")
    }
    catch (error: NoSuchFileException) {
        println("File does not exist")
        exitProcess(1)
    }
    catch (error: IllegalArgumentException) {
        println("Error: ${error.message}")
        exitProcess(1)
    }
    catch (error: NumberFormatException) {
        println("Invalid conversion to Double")
        exitProcess(1)
    }
    catch (error: Exception) {
        println("Some error has occured")
        exitProcess(1)
    }
}
