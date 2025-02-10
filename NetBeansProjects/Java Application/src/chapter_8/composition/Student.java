
package composition;
import java.util.List;
import java.util.ArrayList;

public class Student {
    public String name;
    public List<Course>courses;
    
    public Student(String name){
        this.name = name;
        this.courses = new ArrayList<>();
       
    }
    public void enroll(Course course){
        this.courses.add(course);
        course.students.add(this);
    }
}
