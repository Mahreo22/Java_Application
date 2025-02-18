
package date_and_time;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss:a");
        
        String formattedDate = LocalDateTime.now().format(formatter);
        System.out.println(formattedDate);
    }
}
