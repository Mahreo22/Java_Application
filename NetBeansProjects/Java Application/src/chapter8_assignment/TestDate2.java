
package chapter8_assignment;

public class TestDate2 {
    public static void main(String[] args) {
        Date date1 = new Date(6, 14, 1992);
        date1.printDate();

        Date date2 = new Date("June", 14, 1992);
        date2.printDate();

        Date date3 = new Date(165, 1992);
        date3.printDate();
    }

}
