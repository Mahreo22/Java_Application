import java.util.Scanner;

public class FibonacciSeries_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        long fibonacciNumber = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

    private static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
