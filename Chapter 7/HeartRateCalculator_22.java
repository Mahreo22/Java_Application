import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

 class HeartRates {
    private String firstName;
    private String lastName;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    // Set and get methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // Method to calculate age
    public int calculateAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }

    // Method to calculate maximum heart rate
    public int calculateMaxHeartRate() {
        return 220 - calculateAge();
    }

    // Method to calculate target heart rate range
    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaxHeartRate();
        int targetHeartRateLow = (int) (maxHeartRate * 0.5);
        int targetHeartRateHigh = (int) (maxHeartRate * 0.85);
        return targetHeartRateLow + " - " + targetHeartRateHigh;
    }
}



public class HeartRateCalculator_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter birth day (1-31): ");
        int birthDay = scanner.nextInt();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        HeartRates heartRates = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

        System.out.println("\nName: " + heartRates.getFirstName() + " " + heartRates.getLastName());
        System.out.println("Date of Birth: " + heartRates.getBirthMonth() + "/" + heartRates.getBirthDay() + "/" + heartRates.getBirthYear());
        System.out.println("Age: " + heartRates.calculateAge() + " years");
        System.out.println("Maximum Heart Rate: " + heartRates.calculateMaxHeartRate() + " beats per minute");
        System.out.println("Target Heart Rate Range: " + heartRates.calculateTargetHeartRate() + " beats per minute");
    }
}
