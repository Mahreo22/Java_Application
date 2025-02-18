
package chapter8_assignment;

public class TestRectangle {
   public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);

        System.out.println("Rectangle dimensions:");
        System.out.printf("Length: %.2f%n", rectangle.getLength());
        System.out.printf("Width: %.2f%n", rectangle.getWidth());

        System.out.printf("%nPerimeter: %.2f%n", rectangle.getPerimeter());
        System.out.printf("Area: %.2f%n", rectangle.getArea());

        // Attempt to set invalid dimensions
        try {
            rectangle.setLength(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            rectangle.setWidth(21.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
 
}
