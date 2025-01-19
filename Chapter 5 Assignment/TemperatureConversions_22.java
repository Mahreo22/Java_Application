import java.util.Scanner;

public class TemperatureConversions_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 to convert Fahrenheit to Celsius or 2 to convert Celsius to Fahrenheit: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter Fahrenheit temperature: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = celsius(fahrenheit);
            System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius%n", fahrenheit, celsius);
        } else if (choice == 2) {
            System.out.print("Enter Celsius temperature: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = fahrenheit(celsius);
            System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit%n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
