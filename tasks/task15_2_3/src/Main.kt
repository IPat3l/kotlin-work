// Task 15.2.3: demo program

fun main() {
    // Create account and deposit £1250
    var savingAccTest = SavingsAccount(1.8, "Self", balance = 1250)
    savingAccTest.deposit(1250)

    // Accrue interest 5 times, then withdraw £50
    for (i in 1..5) { savingAccTest.applyInterest() }
    savingAccTest.withdraw(50)
    println("Final balance is £${savingAccTest.balance}")
}
