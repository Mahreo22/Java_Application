
package composition;
import java.util.List;
import java.util.ArrayList;

public class Course {
    public String courseName;
    public List<Student>students;
    
    public Course(String courseName){
       this.courseName = courseName;
        this.students = new ArrayList<>();
    } 
    
}
