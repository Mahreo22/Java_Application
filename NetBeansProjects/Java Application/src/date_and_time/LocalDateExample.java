
package date_and_time;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        String dOB = "2025-05-06";
        
        //now function to get the current date
        LocalDate todayDate = LocalDate.now();
        System.out.println(todayDate);
        
        //using add
        LocalDate addDate = todayDate.plusDays(5);
        System.out.println(addDate);
        
        //of function
         LocalDate date = LocalDate.of(2025, 2, 6);
         System.out.printf("%s%n",date);
         
         //parse function for passing a string to date
         LocalDate birthDate = LocalDate.parse(dOB);
         System.out.printf("%s%n",birthDate);
         
         //using isYear
        boolean checkDate = birthDate.isLeapYear();
        System.out.printf("%b%n",checkDate);
         
         //getYear
         int birthYear = LocalDate.parse(dOB).getYear();
         System.out.printf("Your birth year is %d%n",birthYear);
         
         //getMonth
         Month birthMonth = LocalDate.parse(dOB).getMonth();
         System.out.printf("Your bitth month is %s%n",birthMonth);
         
         //getDate
         int birthDay = LocalDate.parse(dOB).getDayOfMonth();
         System.out.printf("Your birth day is %s%n",birthDay);
         
         String birthDay1 = "2013-09-17";
         String birthDay2 = "2015-03-17";
         LocalDate date1 = LocalDate.parse(birthDay1);
         LocalDate date2 = LocalDate.parse(birthDay2);
         
         boolean isEqual = date1.equals(date2);
         System.out.printf("Are the dates equal? %b%n",isEqual);
         
    }
}
