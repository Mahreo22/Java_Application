import java.util.Scanner;
import java.lang.Math;

public class HypotenuseCalculations_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();

        double hypotenuse = calculateHypotenuse(side1, side2);
        System.out.println("The length of the hypotenuse is " + hypotenuse);
    }

    public static double calculateHypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
