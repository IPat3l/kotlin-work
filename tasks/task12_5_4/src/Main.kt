// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val me = Person("ish", LocalDate(2005, 12, 24))
    println(me.age)
}