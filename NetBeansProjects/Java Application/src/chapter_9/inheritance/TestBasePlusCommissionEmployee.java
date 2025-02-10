
package chapter_9.inheritance;

public class TestBasePlusCommissionEmployee {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee
        ("10334","Becca","Abdulaazeez",
                "1117-89-6576",10000.0,0.05
                ,500.0);
        
        System.out.println("Employee Information: ");
        System.out.println(employee.toString());
        
        System.out.printf("%n%s: $%,.2f%n","Earnings",employee.earnings());
    }
    
}
