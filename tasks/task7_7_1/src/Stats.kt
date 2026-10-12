// Task 7.7.1: statistics functions
fun median(list: List<Float>): Float {
    val n = list.size
    val sortedList = list.sorted()
    var median = 0.0f
    if (n % 2 == 0) {
        median = (sortedList[(n/2)] + sortedList[(n-1)/2]) / 2
    } else {
        median = sortedList[(n-1)/2]
    }
    return median
}

fun stats(list: List<Float>) {
    println("Maximum is ${list.max()}")
    println("Minimum is ${list.min()}")
    println("Mean is ${list.average()}")
    println("Median is ${median(list)}")
}