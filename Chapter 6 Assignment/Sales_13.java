public class Sales_13 {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = row * sales[row].length + col + 1;
            }
        }

        System.out.println("Initial array:");
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
            }
        }

        System.out.println("Array after setting elements to zero:");
        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                System.out.print(sales[row][col] + " ");
            }
            System.out.println();
        }
    }
}
