
package chapter_9.inheritance;


public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String employeeId,String firstName,String lastName
            ,String socialSecurityNumber,double grossSales, double commissionRate){
        super(employeeId,firstName,lastName,socialSecurityNumber);
        
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
        
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        
        
    }
    public double getGrossSales(){
        return grossSales;
    }
    public void setGetGrossSales(double grossSales){
        if (grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        this.grossSales = grossSales;
    }
    
    public double getCommissionRate(){
        return commissionRate;
    }
    public void setCommissionRate(double commisionRate){
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
            throw new IllegalArgumentException("Commission rate must be >= 0.0 and < 1.0");
        this.commissionRate = commissionRate;
    }
    public double earnings(){
        return grossSales * commissionRate;
    }
    @Override  public String toString(){
            return super.toString() + String.format("%n%-15s: %-10.2f%n%-15s: %-10.2f",
                    "Gross Sales",grossSales,"Commission Rate",commissionRate);
    }
}
