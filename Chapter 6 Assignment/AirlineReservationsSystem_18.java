import java.util.Scanner;
public class AirlineReservationsSystem_18 {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; // 10 seats on the plane
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Assign a seat in the first-class section (seats 1-5)
                for (int i = 0; i < 5; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Your seat number is " + (i + 1) + " in First Class.");
                        break;
                    } else if (i == 4) {
                        System.out.println("First Class is full. Is it acceptable to be placed in Economy? (yes/no)");
                        String response = scanner.next();
                        if (response.equalsIgnoreCase("yes")) {
                            // Assign a seat in the economy section (seats 6-10)
                            for (int j = 5; j < 10; j++) {
                                if (!seats[j]) {
                                    seats[j] = true;
                                    System.out.println("Your seat number is " + (j + 1) + " in Economy.");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                }
            } else if (choice == 2) {
                // Assign a seat in the economy section (seats 6-10)
                for (int i = 5; i < 10; i++) {
                    if (!seats[i]) {
                        seats[i] = true;
                        System.out.println("Your seat number is " + (i + 1) + " in Economy.");
                        break;
                    } else if (i == 9) {
                        System.out.println("Economy is full. Is it acceptable to be placed in First Class? (yes/no)");
                        String response = scanner.next();
                        if (response.equalsIgnoreCase("yes")) {
                            // Assign a seat in the first-class section (seats 1-5)
                            for (int j = 0; j < 5; j++) {
                                if (!seats[j]) {
                                    seats[j] = true;
                                    System.out.println("Your seat number is " + (j + 1) + " in First Class.");
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Next flight leaves in 3 hours.");
                        }
                    }
                }
            }
        }
    }
}
