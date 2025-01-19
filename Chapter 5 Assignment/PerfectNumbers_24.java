public class PerfectNumbers_24 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " is a perfect number: ");
                displayFactors(i);
                System.out.println();
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void displayFactors(int number) {
        System.out.print("1");
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
