import java.util.Random;
import java.util.Scanner;

public class CoinTossing_29 {
    public enum Coin {
        HEADS, TAILS
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int headsCount = 0;
        int tailsCount = 0;

        while (true) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                Coin coin = flip();
                System.out.println(coin);

                if (coin == Coin.HEADS) {
                    headsCount++;
                } else {
                    tailsCount++;
                }

                System.out.println("Heads count: " + headsCount);
                System.out.println("Tails count: " + tailsCount);
            } else if (option == 2) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }
}
