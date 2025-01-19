import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_37 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;
        int incorrectCount = 0;

        while (correctCount + incorrectCount < 10) {
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
                    correctCount++;
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
                    incorrectCount++;
                }
            }
        }

        double percentage = (double) correctCount / (correctCount + incorrectCount) * 100;
        System.out.printf("Your percentage is %.2f%%%n", percentage);

        if (percentage < 75) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}
