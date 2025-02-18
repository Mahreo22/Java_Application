
package chapter10_assignment;

public class SalaryEmployee extends Employee{
   private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, Date birthDate, double weeklySalary) {
        super(firstName, lastName, birthDate);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }
 
}
