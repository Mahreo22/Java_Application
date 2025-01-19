import java.util.Scanner;

public class SeparatingDigits_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        displayDigits(number);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }

    public static int remainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        if (number >= 1 && number <= 99999) {
            String digits = Integer.toString(number);
            for (int i = 0; i < digits.length(); i += 2) {
                if (i + 1 < digits.length()) {
                    System.out.print(digits.substring(i, i + 2) + " ");
                } else {
                    System.out.print(digits.substring(i));
                }
            }
            System.out.println();
        } else {
            System.out.println("Invalid input. Please enter an integer between 1 and 99999.");
        }
    }
}
