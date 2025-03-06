
package chapter8_assignment;

public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    // Constructor
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // Method to calculate monthly interest
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }

    // Static method to modify annual interest rate
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    // Method to get savings balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

}
