import java.util.Scanner;

public class Multiples_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        boolean isMultiple = isMultiple(num1, num2);
        System.out.println(num2 + " is " + (isMultiple ? "" : "not ") + "a multiple of " + num1);
    }

    public static boolean isMultiple(int num1, int num2) {
        return num2 % num1 == 0;
    }
}
