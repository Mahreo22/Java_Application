import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction_39 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter difficulty level (1-5): ");
        int difficultyLevel = scanner.nextInt();

        System.out.print("Enter problem type (1-5): ");
        int problemType = scanner.nextInt();

        int correctCount = 0;
        int incorrectCount = 0;

        while (correctCount + incorrectCount < 10) {
            int num1 = getRandomNumber(difficultyLevel);
            int num2 = getRandomNumber(difficultyLevel);

            String problem = "";
            int answer = 0;

            switch (problemType) {
                case 1:
                    problem = "How much is " + num1 + " + " + num2 + "? ";
                    answer = num1 + num2;
                    break;
                case 2:
                    problem = "How much is " + num1 + " - " + num2 + "? ";
                    answer = num1 - num2;
                    break;
                case 3:
                    problem = "How much is " + num1 + " * " + num2 + "? ";
                    answer = num1 * num2;
                    break;
                case 4:
                    problem = "How much is " + num1 + " / " + num2 + "? ";
                    answer = num1 / num2;
                    break;
                case 5:
                    int operation = random.nextInt(4) + 1;
                    switch (operation) {
                        case 1:
                            problem = "How much is " + num1 + " + " + num2 + "? ";
                            answer = num1 + num2;
                            break;
                        case 2:
                            problem = "How much is " + num1 + " - " + num2 + "? ";
                            answer = num1 - num2;
                            break;
                        case 3:
                            problem = "How much is " + num1 + " * " + num2 + "? ";
                            answer = num1 * num2;
                            break;
                        case 4:
                            problem = "How much is " + num1 + " / " + num2 + "? ";
                            answer = num1 / num2;
                            break;
                    }
                    break;
            }

            System.out.print(problem);
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                correctCount++;
                System.out.println("Correct!");
            } else {
                incorrectCount++;
                System.out.println("Incorrect. The correct answer is " + answer);
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

    public static int getRandomNumber(int difficultyLevel) {
        int max = (int) Math.pow(10, difficultyLevel);
        Random random = new Random();
        return random.nextInt(max);
    }
}
