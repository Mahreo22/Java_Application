import java.util.Scanner;

public class ReversingDigits_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}
