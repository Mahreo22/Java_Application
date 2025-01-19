import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_36 {
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
                    int response = random.nextInt(4) + 1;
                    switch (response) {
                        case 1:
                            System.out.println("Very good!");
                            break;
                        case 2:
                            System.out.println("Excellent!");
                            break;
                        case 3:
                            System.out.println("Nice work!");
                            break;
                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    break;
                } else {
                    int response = random.nextInt(4) + 1;
                    switch (response) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;
                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;
                        case 3:
                            System.out.println("Don't give up!");
                            break;
                        case 4:
                            System.out.println("No. Keep trying.");
                            break;
                    }
                }
            }
        }
    }
}
