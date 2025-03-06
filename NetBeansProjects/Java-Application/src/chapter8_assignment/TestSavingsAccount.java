
package chapter8_assignment;

public class TestSavingsAccount {
  public static void main(String[] args) {
        // Instantiate two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and print monthly interest for 12 months
        System.out.println("Monthly Interest for 12 Months at 4% Interest Rate:");
        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("Month %d - Saver 1 Balance: $%.2f, Saver 2 Balance: $%.2f%n", i, saver1.getSavingsBalance(), saver2.getSavingsBalance());
        }

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and print next month's interest
        System.out.println("%nNext Month's Interest at 5% Interest Rate:");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("Saver 1 Balance: $%.2f, Saver 2 Balance: $%.2f%n", saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
  
}
