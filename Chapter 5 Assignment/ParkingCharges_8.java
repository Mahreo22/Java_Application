import java.util.Scanner;

public class ParkingCharges_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0;

        while (true) {
            System.out.print("Enter hours parked (or -1 to quit): ");
            double hoursParked = scanner.nextDouble();

            if (hoursParked == -1) {
                break;
            }

            double charge = calculateCharges(hoursParked);
            totalReceipts += charge;

            System.out.printf("Charge for current customer: $%.2f%n", charge);
            System.out.printf("Running total of yesterday's receipts: $%.2f%n%n", totalReceipts);
        }

        scanner.close();
    }

    public static double calculateCharges(double hoursParked) {
        double charge;

        if (hoursParked <= 3) {
            charge = 2.00;
        } else {
            charge = 2.00 + (hoursParked - 3) * 0.5;
            charge = Math.min(charge, 10.00);
        }

        return charge;
    }
}
