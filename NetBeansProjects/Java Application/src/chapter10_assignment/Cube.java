
package chapter10_assignment;

public class Cube extends ThreeDimensionalShape{
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public String toString() {
        return "Cube with side length " + sideLength;
    }

}
