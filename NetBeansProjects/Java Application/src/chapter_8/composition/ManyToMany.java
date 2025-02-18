
package composition;


public class ManyToMany {
    public static void main(String[] args) {
        
        Course java = new Course("Java");
        Course python = new Course("Python");
        Course logic = new Course("Logic");
        Course sql = new Course("SQL");
        
        
        Student student1 = new Student("Mario");
        Student student2 = new Student("Delight");
        Student student3 = new Student("Laycon");
        
        student1.enroll(logic);
        student1.enroll(sql);
        student1.enroll(java);
        
        student2.enroll(java);
        
        student3.enroll(sql);
        student3.enroll(python);
        student3.enroll(logic);
        
        System.out.println(student3.name + " enrolled in: ");
        for(Course c : student3.courses){
            System.out.println("- " + c.courseName);
        }
        
        System.out.println("Students enrolled in Java: ");
        for(Student s : java.students){
            System.out.println("- " + s.name);
        }
        
    }            
}
