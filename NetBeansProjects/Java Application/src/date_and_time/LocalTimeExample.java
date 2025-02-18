
package date_and_time;
import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        //prints the current time of the laptop
        LocalTime todaysTime = LocalTime.now();
        System.out.println(todaysTime);
        
        //prints a specified time
        LocalTime appointmentTime = LocalTime.of(3, 30, 50, 747474);
        System.out.println(appointmentTime);
        
        //passes a string representating a time to ISO format
        LocalTime userTime = LocalTime.parse("14:30:45");
        System.out.println(userTime);
        
        int hour = userTime.getHour();
        System.out.println(hour);
        
        int minutes = userTime.getMinute();
        System.out.println(minutes);
        
        int seconds = userTime.getSecond();
        System.out.println(seconds);
        
        LocalTime addHours = userTime.plusHours(2);
        System.out.println(addHours);
        
        boolean isBefore = LocalTime.now().isBefore(LocalTime.of(12, 0));
        System.out.println(isBefore);
        
        boolean isAfter = LocalTime.now().isAfter(LocalTime.of(12, 0));
        System.out.println(isAfter);
        
        String meetingTime1 = "04:30:56";
        String meetingTime2 = "07:30:56";
        
        LocalTime time1 = LocalTime.parse(meetingTime1);
        LocalTime time2 = LocalTime.parse(meetingTime2);
        
        boolean isTimeEqual = time1.equals(time2);
        System.out.println(isTimeEqual);
                
    }
}
