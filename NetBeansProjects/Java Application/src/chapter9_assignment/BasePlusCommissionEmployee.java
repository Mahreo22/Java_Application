
package chapter9_assignment;

public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return commissionEmployee.earnings() + baseSalary;
    }

    public String toString() {
        return "Base Plus Commission Employee: " + commissionEmployee.toString() + "\nBase Salary: " + baseSalary;
    }

}
