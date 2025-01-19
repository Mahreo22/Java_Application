import java.util.Scanner;

public class Exponentiation_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = scanner.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();

        int result = integerPower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }

    public static int integerPower(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}
