import java.util.Random;

public class DiceRolling_17 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] frequency = new int[11]; // 11 possible sums (2-12)

        // Roll the dice 36,000,000 times
        for (int i = 0; i < 36000000; i++) {
            int sum = random.nextInt(6) + 1 + random.nextInt(6) + 1;
            frequency[sum - 2]++; // Increment the frequency of the sum
        }

        // Display the results in tabular format
        System.out.println("Sum\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println((i + 2) + "\t" + frequency[i]);
        }
    }
}
