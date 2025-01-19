import java.util.Random;
import java.util.Scanner;

public class CrapsGameModification_33 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int bankBalance = 1000;

        while (true) {
            System.out.print("Your current balance is $" + bankBalance + ". Enter your wager: ");
            int wager = scanner.nextInt();

            while (wager > bankBalance) {
                System.out.print("You cannot wager more than your current balance. Enter a new wager: ");
                wager = scanner.nextInt();
            }

            displayChatter();

            int roll = rollDice();
            System.out.println("You rolled a " + roll);

            if (roll == 7 || roll == 11) {
                System.out.println("You win!");
                bankBalance += wager;
            } else if (roll == 2 || roll == 3 || roll == 12) {
                System.out.println("You lose!");
                bankBalance -= wager;
            } else {
                int point = roll;
                System.out.println("The point is " + point);

                while (true) {
                    roll = rollDice();
                    System.out.println("You rolled a " + roll);

                    if (roll == point) {
                        System.out.println("You win!");
                        bankBalance += wager;
                        break;
                    } else if (roll == 7) {
                        System.out.println("You lose!");
                        bankBalance -= wager;
                        break;
                    }
                }
            }

            System.out.println("Your new balance is $" + bankBalance);
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
                break;
            }
        }
    }

    public static void displayChatter() {
        Random random = new Random();
        String[] chatter = {"Oh, you're going for broke, huh?", "Aw c'mon, take a chance!", "You're up big. Now's the time to cash in your chips!"};
        System.out.println(chatter[random.nextInt(chatter.length)]);
    }

    public static int rollDice() {
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }
}
