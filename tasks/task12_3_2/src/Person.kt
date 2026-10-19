// Task 12.3.2: Person class with secondary constructor

import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String): this(name, LocalDate.parse(birth))
    var isMarried = false
    override fun toString(): String {
        return "$name, born on $birth, and ${if (isMarried){"is"} else {"is not"} } married"
    }
}