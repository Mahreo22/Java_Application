import java.util.Scanner;

public class DuplicateElimination_12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Read five numbers from the user and store them in an array.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            // Check if each number is a duplicate of a number already read.
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Display the unique numbers read from the user.
            if (!isDuplicate) {
                System.out.println("Unique numbers read so far:");
                for (int k = 0; k <= i; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
