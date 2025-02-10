
package composition;


public class ManyToMany {
    public static void main(String[] args) {
        
        Course java = new Course("Java");
        Course python = new Course("Python");
        Course logic = new Course("Logic");
        Course sql = new Course("SQL");
        
        
        Student student1 = new Student("Mario");
        Student student2 = new Student("Delight");
        
        student1.enroll(logic);
        student1.enroll(sql);
        
        System.out.println(student1.name + " enrolled in: ");
        for(Course c : student1.courses){
            System.out.println("- " + c.courseName);
        }
        
        System.out.println("Students enrolled in Java: ");
        for(Student s : java.students){
            System.out.println("- " + s.name);
        }
        
    }            
}
