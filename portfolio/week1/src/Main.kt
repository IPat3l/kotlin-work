// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble()

    // Semiperimeter s = 1/2(a + b + c)
    val s = (a + b + c)/2

    // Area = sqrt(s(s-a)(s-b)(s-c))
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    println("Area is %.5f".format(area))
}