import java.util.Scanner;

public class TotalSales_19 {
    public static void main(String[] args) {
        int[][] sales = new int[5][4]; // 5 products, 4 salespeople
        Scanner scanner = new Scanner(System.in);

        // Read sales data
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter salesperson number (1-4): ");
            int salesperson = scanner.nextInt() - 1;
            System.out.print("Enter product number (1-5): ");
            int product = scanner.nextInt() - 1;
            System.out.print("Enter total sales: ");
            int totalSales = scanner.nextInt();
            sales[product][salesperson] += totalSales;
        }

        // Display sales data
        System.out.println("Total Sales by Product and Salesperson:");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Product " + (i + 1) + ": ");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate cross-totals
        int[] productTotals = new int[sales.length];
        int[] salespersonTotals = new int[sales[0].length];
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                productTotals[i] += sales[i][j];
                salespersonTotals[j] += sales[i][j];
            }
        }

        // Display cross-totals
        System.out.println("Cross-Totals:");
        System.out.print("Product Totals: ");
        for (int i = 0; i < productTotals.length; i++) {
            System.out.print(productTotals[i] + " ");
        }
        System.out.println();
        System.out.print("Salesperson Totals: ");
        for (int i = 0; i < salespersonTotals.length; i++) {
            System.out.print(salespersonTotals[i] + " ");
        }
        System.out.println();
    }
}
