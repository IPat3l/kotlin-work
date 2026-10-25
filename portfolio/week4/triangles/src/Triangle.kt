// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    init {
        require(sideA < sideB+sideC && sideB < sideA+sideC && sideC < sideA+sideB) { "Invalid Triangle" }
    }

    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = (sideA + sideB + sideC)/2
    val area = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}