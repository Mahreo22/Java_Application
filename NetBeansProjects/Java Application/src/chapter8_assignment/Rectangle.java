
package chapter8_assignment;

public class Rectangle {
    private double length;
    private double width;

    // Constructor with default values
    public Rectangle() {
        this(1.0, 1.0);
    }

    // Constructor with length and width
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Set length
    public void setLength(double length) {
        if (length <= 0.0 || length >= 20.0) {
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        }
        this.length = length;
    }

    // Set width
    public void setWidth(double width) {
        if (width <= 0.0 || width >= 20.0) {
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        }
        this.width = width;
    }

    // Get length
    public double getLength() {
        return length;
    }

    // Get width
    public double getWidth() {
        return width;
    }

    // Calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Calculate area
    public double getArea() {
        return length * width;
    }

}
