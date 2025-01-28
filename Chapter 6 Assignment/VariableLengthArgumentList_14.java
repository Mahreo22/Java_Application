public class VariableLengthArgumentList_14 {
    public static void main(String[] args) {
        System.out.println("Product of 1, 2, 3, 4, 5: " + product(1, 2, 3, 4, 5));
        System.out.println("Product of 10, 20, 30: " + product(10, 20, 30));
        System.out.println("Product of 1, 2: " + product(1, 2));
    }

    public static int product(int... numbers) {
        int result = 1;
        for (int number : numbers) {
            result *= number;
        }
        return result;
    }
}
