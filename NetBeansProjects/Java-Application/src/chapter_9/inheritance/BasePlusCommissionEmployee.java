
package chapter_9.inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String employeeId,String firstName,String lastName
            ,String socialSecurityNumber,double grossSales, double commissionRate,double baseSalary){
        super(employeeId,firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
       
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }
    @Override public double earnings(){
        return baseSalary + super.earnings();
    }
    @Override public String toString(){
        return super.toString() + String.format("\n%-15s: %.2f","Base Salary",baseSalary);
    }
}
