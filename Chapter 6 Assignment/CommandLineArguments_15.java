public class CommandLineArguments_15 {
    public static void main(String[] args) {
        int arraySize = args.length == 0 ? 10 : Integer.parseInt(args[0]);
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        System.out.println("Array values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
