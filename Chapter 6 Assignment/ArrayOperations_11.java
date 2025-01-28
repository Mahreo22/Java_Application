public class ArrayOperations_11 {
    public static void main(String[] args) {
        // a) Set the 10 elements of integer array counts to zero.
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // b) Add one to each of the 15 elements of integer array bonus.
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }

        // c) Display the five values of integer array bestScores in column format.
        int[] bestScores = {10, 20, 30, 40, 50};
        for (int i = 0; i < bestScores.length; i++) {
            System.out.println(bestScores[i]);
        }
    }
}
