
package chapter_9.inheritance;

public class Employee {
    private final String employeeId;
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber;
    
    public Employee(String employeeId,String firstName,String lastName,
            String socialSecurityNumber){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber =  socialSecurityNumber;       
    }
    public String getEmployeeId(){
        return employeeId;
    }
    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    @Override public String toString(){
        return String.format("%s: %s %s %s\n%s: %s","Employee Details"
                ,employeeId,firstName,lastName,
                "Social Security Number",socialSecurityNumber);
    }
}
