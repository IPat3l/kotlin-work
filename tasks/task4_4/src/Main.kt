// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Check if 3 command line arguments have been supplied
    if (args.size != 3 ) {
        println("Error: 3 float type arguments required on command line")
        exitProcess(1)
    }

    // Convert said 3 arguments to floats.
    val initTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val tempInc = args[2].toFloat()

    // Incremented temperatures in C & F
    var tempC = initTemp
    var tempF = 0.0f

    println("Temp in Celcius | Temp in Farenheit")
    println("-----------------------------------")
    // Loop to generate rows
    while (tempC <= maxTemp) {
        // Convert celcius to farenheit
        // Need to use 9.0 and .toFloat() to get the correct value -- or use 1.8
        tempF = ((tempC * (9.0/5).toFloat()) + 32)
        println("%3.1f | %.1f".format(tempC, tempF))
        // increment temperature
        tempC += tempInc
    }
}