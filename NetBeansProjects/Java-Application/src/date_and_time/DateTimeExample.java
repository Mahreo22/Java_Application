
package date_and_time;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime todayDateTime = LocalDateTime.now();
        System.out.printf("%s%n",todayDateTime);
        
        LocalDateTime appointmentDateTime = LocalDateTime.of(2005, Month.MARCH, 3, 12, 30);
        System.out.println(appointmentDateTime);
        
        String userDateTime = "2014-12-20";
        System.out.printf("%s%n",userDateTime);
        
    }
}
