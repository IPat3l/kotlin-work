// Task 8.5: example of using a higher-order function

fun main() {
    val test = "This is a test of a special function, aieou, wasdf, 1234567890, 0987654321, ,./:;'@#~[{]}"
    val vowelCount = test.howMany { it.lowercase() in "aeiou" }
    println(vowelCount)
    val randomCount = test.howMany { it.lowercase() in ",.:" }
    println(randomCount)
}
