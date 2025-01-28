import java.util.Scanner;

public class FibonacciSeriesDouble_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        double fibonacciNumber = fibonacci(n);

        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }

    private static double fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
