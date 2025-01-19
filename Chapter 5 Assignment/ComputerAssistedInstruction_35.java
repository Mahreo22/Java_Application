import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_35 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            while (true) {
                System.out.print("How much is " + num1 + " times " + num2 + "? ");
                int answer = scanner.nextInt();

                if (answer == num1 * num2) {
                    System.out.println("Very good!");
                    break;
                } else {
                    System.out.println("No. Please try again.");
                }
            }
        }
    }
}
