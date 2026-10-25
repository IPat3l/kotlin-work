// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val per = Person("aBcDeFGHijk", LocalDate(1997, 8, 23))
    per.name = ""
}