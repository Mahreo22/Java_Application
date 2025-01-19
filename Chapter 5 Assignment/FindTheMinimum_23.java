import java.util.Scanner;

public class FindTheMinimum_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three floating-point numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double min = minimum3(num1, num2, num3);
        System.out.printf("The smallest number is %.2f%n", min);
    }

    public static double minimum3(double num1, double num2, double num3) {
        return Math.min(num1, Math.min(num2, num3));
    }
}
