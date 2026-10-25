// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main() {
    var per = Person.create("name", LocalDate(2023, 4, 3))
    var per2 = Person.create("name", LocalDate(2023, 4, 3))
}