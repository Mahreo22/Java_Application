import java.util.Scanner;

public class QualityPoints_28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's average: ");
        double average = scanner.nextDouble();

        int qualityPoints = calculateQualityPoints(average);
        System.out.println("Quality points: " + qualityPoints);
    }

    public static int calculateQualityPoints(double average) {
        if (average >= 90) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        }
    }
}
