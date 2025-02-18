
package chapter8_assignment;

public class TestDate {
   public static void main(String[] args) {
        Date date = new Date(12, 31, 2020);

        System.out.println("Initial Date:");
        System.out.println(date);

        // Test nextDay method
        for (int i = 1; i <= 5; i++) {
            date.nextDay();
            System.out.println("Date after " + i + " day(s):");
            System.out.println(date);
        }
    }
 
}
