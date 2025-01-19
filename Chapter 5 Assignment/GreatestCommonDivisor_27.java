import java.util.Scanner;

public class GreatestCommonDivisor_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        System.out.println("GCD: " + gcd);
    }

    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return calculateGCD(num2, num1 % num2);
        }
    }
}
