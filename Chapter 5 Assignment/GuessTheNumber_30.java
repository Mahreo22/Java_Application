import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber_30 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(1000) + 1;
        int numberOfTries = 0;

        while (true) {
            System.out.print("Guess a number between 1 and 1000: ");
            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                System.out.println("Congratulations. You guessed the number!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        System.out.println("Do you want to play again? (yes/no)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("yes")) {
            main(args);
        }
    }
}
