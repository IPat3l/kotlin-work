// Task 15.2.3: SavingsAccount class
import kotlin.math.round

class SavingsAccount(val rate: Double, holder: String, balance: Int) : BankAccount(holder) {
    init {
        require(rate > 0) { "Interest Rate must be greater than zero" }
    }

    fun applyInterest() {
        var interestMoney = round((rate/100) * balance).toInt()
        deposit(interestMoney)
    }
}