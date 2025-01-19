import java.util.Scanner;

public class EvenOrOdd_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        boolean isEven = isEven(number);
        System.out.println(number + " is " + (isEven ? "even" : "odd"));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
