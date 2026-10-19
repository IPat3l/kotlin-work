// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(3.0, 4.0)

    println("${p.toString()}")
    println("${p.distance()}")

    val q = Point(5.0, -2.0)
    println("${p.distanceTo(q)}")
}
