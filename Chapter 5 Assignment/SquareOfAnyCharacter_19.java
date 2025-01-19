import java.util.Scanner;

public class SquareOfAnyCharacter_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        int side = scanner.nextInt();

        System.out.print("Enter the fill character: ");
        char fillCharacter = scanner.next().charAt(0);

        squareOfAnyCharacter(side, fillCharacter);
    }

    public static void squareOfAnyCharacter(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
