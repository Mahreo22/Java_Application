import java.util.Scanner;

public class SquareOfAsterisks_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        squareOfAsterisks(side);
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
