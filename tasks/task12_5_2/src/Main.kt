// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val per = Person("aBcDeFGHijk", LocalDate(1997, 8, 23))
    println(per.name)
}