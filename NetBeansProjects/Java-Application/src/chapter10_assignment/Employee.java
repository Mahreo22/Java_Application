
package chapter10_assignment;

public abstract class Employee {
   private String firstName;
    private String lastName;
    private Date birthDate;

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public abstract double earnings();

    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }

    public Date getBirthDate() {
        return birthDate;
    }
 
}
