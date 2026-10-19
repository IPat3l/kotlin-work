// Task 12.4.1: main program
fun main() {
    val centre = Point(2.0, 2.0)
    val circle = Circle(centre, 2.0)

    val point = Point(0.0, 1.0)
    println(circle.area())
    println(circle.perimeter())
    println(circle contains point)
}