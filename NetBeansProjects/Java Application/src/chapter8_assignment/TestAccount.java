
package chapter8_assignment;
import java.math.BigDecimal;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("12345", "Max David", new BigDecimal("1000.00"));

        System.out.println(account.toString());

        account.deposit(new BigDecimal("500.00"));
        System.out.println(account.toString());

        account.withdraw(new BigDecimal("200.00"));
        System.out.println(account.toString());

        account.withdraw(new BigDecimal("1500.00")); // insufficient funds
        System.out.println(account.toString());
    }

}
