// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle

    var isValid: Boolean = true
    if (a >= b+c || b >= a+c || c >= a+b) {
        isValid = false
    }
    return isValid
}

fun triangleArea(triangle: Triangle): Double {
    val (a, b, c) = triangle

    // Semiperimeter s = 1/2(a + b + c)
    val s = (a + b + c)/2

    // Area = sqrt(s(s-a)(s-b)(s-c))
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    return area
}