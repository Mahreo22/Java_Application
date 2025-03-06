
package composition;
import java.util.List;

public class Company {
    String companyName;
    List<Department> departments;
    
    public Company(String companyName,List<Department>departments){
        this.companyName = companyName;
        this.departments = departments;
    }
    
    public void displayCompanyDetails(){
        System.out.printf("%s company has %n", companyName);
        for(Department department: departments){
            System.out.printf("%s%n", department.displayDepartment());
        }
    }
}
