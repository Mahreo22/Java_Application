public class LargestFibonacciDouble_32 {
    public static void main(String[] args) {
        double maxDouble = Double.MAX_VALUE;
        double a = 0;
        double b = 1;

        while (true) {
            double temp = a;
            a = b;
            b = temp + b;

            if (Double.isInfinite(b)) {
                System.out.println("The largest Fibonacci number is: " + a);
                break;
            }
        }
    }
}
