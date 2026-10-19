// Task 12.1: Point class
import kotlin.math.hypot
import kotlin.math.sqrt

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = sqrt( (p.x - x)*(p.x - x) + (p.y - y)*(p.y - y) )
    override fun toString() = "($x, $y)"
}