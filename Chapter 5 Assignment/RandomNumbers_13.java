import java.util.Random;

public class RandomNumbers_13 {
    public static void main(String[] args) {
        Random random = new Random();

        // a) 2, 4, 6, 8, 10
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.println("a) " + numbers[random.nextInt(numbers.length)]);

        // b) 3, 5, 7, 9, 11
        numbers = new int[] {3, 5, 7, 9, 11};
        System.out.println("b) " + numbers[random.nextInt(numbers.length)]);

        // c) 6, 10, 14, 18, 22
        numbers = new int[] {6, 10, 14, 18, 22};
        System.out.println("c) " + numbers[random.nextInt(numbers.length)]);
    }
}
