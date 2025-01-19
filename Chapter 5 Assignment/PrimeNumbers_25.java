public class PrimeNumbers_25 {
    public static void main(String[] args) {
        System.out.println("Prime numbers less than 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
