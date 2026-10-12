// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    var phoneData = createDatabase()
    phoneData.load(CSV_FILENAME)
    var inputRecieved = false

    while (inputRecieved == false) {
        print("Please enter a name: ")
        val name = readln()
        if (name in phoneData.keys) {
            println("$name has phone number ${phoneData[name]}")
            inputRecieved = true
        } else {
            println("$name does not exist in database")
            print("Please enter a new phone number for $name: ")
            val number = readln()
            phoneData[name] = number
            phoneData.save(CSV_FILENAME)
        }
    }
}
