
package chapter8_assignment;
import java.math.BigDecimal;

public class Account {
   private String accountNumber;
   private String accountName;
   private BigDecimal balance;

    public Account(String accountNumber, String accountName, BigDecimal initialBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            if (amount.compareTo(balance) <= 0) {
                balance = balance.subtract(amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("%s account %s: %s", accountName, accountNumber, balance);
    }

}
