import java.util.Random;

public class TortoiseAndHare_28 {
    public static void main(String[] args) {
        Random random = new Random();
        int tortoisePosition = 1;
        int harePosition = 1;
        boolean isTie = false;

        System.out.println("BANG !!!!! AND THEY'RE OFF !!!!!");

        while (tortoisePosition < 70 && harePosition < 70) {
            // Move the tortoise
            int tortoiseMove = random.nextInt(10) + 1;

            if (tortoiseMove >= 1 && tortoiseMove <= 5) {
                // Fast plod
                tortoisePosition += 3;
            } else if (tortoiseMove >= 6 && tortoiseMove <= 7) {
                // Slip
                tortoisePosition -= 6;
            } else {
                // Slow plod
                tortoisePosition += 1;
            }

            // Ensure the tortoise doesn't move before the starting line
            if (tortoisePosition < 1) {
                tortoisePosition = 1;
            }

            // Move the hare
            int hareMove = random.nextInt(10) + 1;

            if (hareMove >= 1 && hareMove <= 2) {
                // Sleep
                harePosition += 0;
            } else if (hareMove >= 3 && hareMove <= 4) {
                // Big hop
                harePosition += 9;
            } else {
                // Small hop
                harePosition += 1;
            }

            // Ensure the hare doesn't move before the starting line
            if (harePosition < 1) {
                harePosition = 1;
            }

            // Display the current positions
            displayPositions(tortoisePosition, harePosition);

            // Check for a tie
            if (tortoisePosition == harePosition && tortoisePosition >= 70) {
                isTie = true;
            }
        }

        // Display the winner
        if (isTie) {
            System.out.println("It's a tie.");
        } else if (tortoisePosition >= 70) {
            System.out.println("TORTOISE WINS!!! YAY!!!");
        } else {
            System.out.println("Hare wins. Yuch.");
        }
    }

    private static void displayPositions(int tortoisePosition, int harePosition) {
        for (int i = 1; i <= 70; i++) {
            if (i == tortoisePosition && i == harePosition) {
                System.out.print("OUCH!!! ");
            } else if (i == tortoisePosition) {
                System.out.print("T ");
            } else if (i == harePosition) {
                System.out.print("H ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
