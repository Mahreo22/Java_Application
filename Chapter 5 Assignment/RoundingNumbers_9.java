import java.util.Scanner;

public class RoundingNumbers_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a double value (or -1 to quit): ");
            double number = scanner.nextDouble();

            if (number == -1) {
                break;
            }

            int roundedNumber = (int) Math.floor(number + 0.5);

            System.out.printf("Original number: %.2f%n", number);
            System.out.printf("Rounded number: %d%n%n", roundedNumber);
        }

        scanner.close();
    }
}
