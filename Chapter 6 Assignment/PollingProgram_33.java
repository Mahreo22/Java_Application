import java.util.Scanner;

public class PollingProgram_33 {
    public static void main(String[] args) {
        String[] topics = {"Climate Change", "Social Inequality", "Mental Health", "Education", "Poverty"};
        int[][] responses = new int[5][10];
        Scanner scanner = new Scanner(System.in);

        // Ask users to rate each issue
        for (int i = 0; i < topics.length; i++) {
            System.out.println("Rate the importance of " + topics[i] + " (1-10):");
            int rating = scanner.nextInt();
            responses[i][rating - 1]++;
        }

        // Display summary of results
        System.out.println("\nSummary of Results:");
        System.out.println("------------------------");
        System.out.println("  | 1 2 3 4 5 6 7 8 9 10 | Average");
        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + " | ");
            for (int j = 0; j < 10; j++) {
                System.out.print(responses[i][j] + " ");
            }
            double average = calculateAverage(responses[i]);
            System.out.printf("| %.2f%n", average);
        }

        // Find issue with highest and lowest point total
        int maxIndex = findMaxIndex(responses);
        int minIndex = findMinIndex(responses);

        System.out.println("\nIssue with highest point total: " + topics[maxIndex]);
        System.out.println("Issue with lowest point total: " + topics[minIndex]);
    }

    private static double calculateAverage(int[] ratings) {
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return (double) sum / ratings.length;
    }

    private static int findMaxIndex(int[][] responses) {
        int maxIndex = 0;
        int maxSum = 0;
        for (int i = 0; i < responses.length; i++) {
            int sum = 0;
            for (int rating : responses[i]) {
                sum += rating;
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int findMinIndex(int[][] responses) {
        int minIndex = 0;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < responses.length; i++) {
            int sum = 0;
            for (int rating : responses[i]) {
                sum += rating;
            }
            if (sum < minSum) {
                minSum = sum;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
