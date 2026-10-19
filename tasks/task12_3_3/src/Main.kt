// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1997, 8, 23)
    val notMarriedPerson = Person("Joe", birthDate).apply {
        isMarried = false
    }
    println(notMarriedPerson.toString())

    val birthDate2 = "1951-01-11"
    val marriedPerson = Person("Jebediah", birthDate).apply {
        isMarried = true
    }
    println(marriedPerson.toString())

    val birthDate3 = "2001-07-19"
    val emptyPerson = Person("Juan", birthDate3).apply { isMarried = false}
    println(emptyPerson.toString())
}