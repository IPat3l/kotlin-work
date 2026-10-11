// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: Expecting a single command line argument")
        exitProcess(1)
    }

    val radius = args[0].toDouble()
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    println("Circle area is %.4f".format(area))
    println("Circle perimeter is %.4f".format(perimeter))
}