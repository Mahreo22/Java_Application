
package chapter10_assignment;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Sphere(3.0);
        shapes[3] = new Cube(4.0);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());

            if (shape instanceof TwoDimensionalShape) {
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea());
            } else if (shape instanceof ThreeDimensionalShape) {
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Surface Area: " + threeDShape.getArea());
                System.out.println("Volume: " + threeDShape.getVolume());
            }

            System.out.println();
        }
    }

}
