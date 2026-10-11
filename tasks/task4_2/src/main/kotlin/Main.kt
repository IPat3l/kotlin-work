// Task 4.2: use of if and ranges

fun main() {
    println("Pizza Menu")
    println("------------------------")
    println("(a) Margherita")
    println("(b) Pepperoni")
    println("(c) Hawaiian")
    println("(d) Seafood")

    print("\nPlease select a pizza (a-d): ")
    val pizza_choice = readln().lowercase()

    // Length is given by the property .length, as opposed to length()
    // Strings can be accessed with arrays like C & Python
    if (pizza_choice.length == 1 && pizza_choice[0] in 'a'..'d') {
        println("Order Accepted")
    }
    else {
        println("Invalid Choice!")
    }
}
