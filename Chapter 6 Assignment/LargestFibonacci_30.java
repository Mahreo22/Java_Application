public class LargestFibonacci_30 {
    public static void main(String[] args) {
        long maxInteger = Long.MAX_VALUE;
        long a = 0;
        long b = 1;

        while (true) {
            long temp = a;
            a = b;
            b = temp + b;

            if (b > maxInteger) {
                System.out.println("The largest Fibonacci number is: " + a);
                break;
            }
        }
    }
}
