
package chapter_7;


public class Student {
    int studentId = 101;
    String firstName = "John";
    String lastName = "Williams";
    String gender = "MAle";
    int age = 25;
    
    public void study(){
        System.out.println("List of Courses");
         System.out.println("Java");
          System.out.println("Web Development");
           System.out.println("Mobile App");
        
    }
    public void display(){
        System.out.printf("StudentID: %d%n" ,studentId);
         System.out.printf("Student First name: %s%n" ,firstName);
          System.out.printf("Student First name: %s%n" ,lastName);
           System.out.printf("Student gender: %s%n" ,gender);
            System.out.printf("Student age: %d%n" ,age);
            study();
    }

    
}
