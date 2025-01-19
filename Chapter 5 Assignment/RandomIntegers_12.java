import java.util.Random;

public class RandomIntegers_12 {
    public static void main(String[] args) {
        Random random = new Random();

        // a) 1 ≤ n ≤ 2
        int n = random.nextInt(2) + 1;
        System.out.println("a) " + n);

        // b) 1 ≤ n ≤ 100
        n = random.nextInt(100) + 1;
        System.out.println("b) " + n);

        // c) 0 ≤ n ≤ 9
        n = random.nextInt(10);
        System.out.println("c) " + n);

        // d) 1000 ≤ n ≤ 1112
        n = random.nextInt(113) + 1000;
        System.out.println("d) " + n);

        // e) –1 ≤ n ≤ 1
        n = random.nextInt(3) - 1;
        System.out.println("e) " + n);

        // f) –3 ≤ n ≤ 11
        n = random.nextInt(15) - 3;
        System.out.println("f) " + n);
    }
}
