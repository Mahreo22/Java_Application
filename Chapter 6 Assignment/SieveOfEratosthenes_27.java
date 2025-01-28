public class SieveOfEratosthenes_27 {
    public static void main(String[] args) {
        int n = 1000;
        boolean[] prime = new boolean[n + 1];

        // Initialize all values as true
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }

        // 0 and 1 are not prime numbers
        prime[0] = prime[1] = false;

        // Iterate from 2 to sqrt(n)
        for (int p = 2; p * p <= n; p++) {
            // If p is a prime, mark as composite all the multiples of p
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers between 2 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
