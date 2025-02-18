
package chapter8_assignment;

public class Date2 {
    private int month; // 1-12
    private int day; // 1-31
    private int year; // any year

    // No-argument constructor
    public Date() {
        this(1, 1, 1900);
    }

    // Constructor with three integer values
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month must be 1-12");
        }
        if (day <= 0 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Day is out of range for the specified month and year");
        }
        if (year < 1) {
            throw new IllegalArgumentException("Year must be greater than 0");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor with a String and two integer values
    public Date(String month, int day, int year) {
        this(monthToNumber(month), day, year);
    }

    // Constructor with two integer values
    public Date(int dayOfYear, int year) {
        this(dayOfYearToMonth(dayOfYear, year), dayOfYearToDay(dayOfYear, year), year);
    }

    // Method to convert month name to number
    private int monthToNumber(String month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < 12; i++) {
            if (months[i].equals(month)) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException("Invalid month name");
    }

    // Method to convert day of year to month and day
    private int dayOfYearToMonth(int dayOfYear, int year) {
        int month = 1;
        while (dayOfYear > daysInMonth(month, year)) {
            dayOfYear -= daysInMonth(month, year);
            month++;
        }
        return month;
    }

    private int dayOfYearToDay(int dayOfYear, int year) {
        int month = 1;
        while (dayOfYear > daysInMonth(month, year)) {
            dayOfYear -= daysInMonth(month, year);
            month++;
        }
        return dayOfYear;
    }

    // Method to get the number of days in a month
    private int daysInMonth(int month, int year) {
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    // Method to output the date in multiple formats
    public void printDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
        System.out.printf("%s %d, %d%n", getMonthName(month), day, year);
        System.out.printf("%03d %04d%n", dayOfYear(), year);
    }

    // Method to get the month name
    private String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the day of the year
    private int dayOfYear() {
        int dayOfYear = day;
        for (int i = 1; i < month; i++) {
            dayOfYear += daysInMonth(i, year);
        }
        return dayOfYear;
    }

}
