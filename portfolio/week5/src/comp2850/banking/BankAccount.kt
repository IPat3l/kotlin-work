// COMP2850 Portfolio: Week 5
// BankAccount class

package comp2850.banking

abstract class BankAccount(val holder: String) {
    init {
        require(holder.isNotBlank()) { "Account holder must not be blank" }
    }

    // Initial balance is 0, use protected setter so that balance cannot be manually assigned,
    // only modifiable by depositing and withdrawing
    var balance = 0
        protected set(value) {
            field = value
        }

    fun deposit(amount: Int) {
        require(amount > 0) { "Deposit amount must be greater than 0" }
        balance += amount
    }

    abstract fun withdraw(amount: Int)
}

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft = 0
        set(value) {
            require(value >= 0 && value <= 100) {"Overdraft must be between £0 and £100"}
            field = value
        }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= 0 - overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    fun withdrawalsAllowed(): Boolean {
        return (balance > 0 - overdraft)
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}