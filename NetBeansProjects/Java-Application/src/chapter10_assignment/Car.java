
package chapter10_assignment;

public class Car implements CarbonFootprint{
    private String make;
    private String model;
    private int year;
    private int mileage;

    public Car(String make, String model, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public double getCarbonFootprint() {
        // Calculate carbon footprint based on mileage
        return mileage * 0.01;
    }

    @Override
    public String toString() {
        return "Car with " + make + " " + model + " " + year + " and " + mileage + " mileage";
    }

}
