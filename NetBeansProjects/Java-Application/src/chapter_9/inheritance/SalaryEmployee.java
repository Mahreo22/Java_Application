
package chapter_9.inheritance;

public class SalaryEmployee extends Employee {
   private double dailyWage = 5000.0;
   
   public SalaryEmployee(String employeeId,String firstName,String lastName
            ,String socialSecurityNumber){
       super(employeeId,firstName,lastName,socialSecurityNumber);
   }
   
   public double getDailyWage(){
       return dailyWage;
   }
   public void setBasicSalary(double dailyWage){
       this.dailyWage = dailyWage;
   }
   public double earnings(){
       return dailyWage * 28;
   }
   @Override public String toString(){
       return super.toString() + String.format("\n%-15s: %.2f", "Basic Salary",dailyWage);
   }
}
