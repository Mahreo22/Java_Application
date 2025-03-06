
package chapter10_assignment;

import java.util.ArrayList;

public class CarbonFootprintTest {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

        carbonFootprints.add(new Building(1000, 5, "Natural Gas"));
        carbonFootprints.add(new Car("Toyota", "Camry", 2015, 50000));
        carbonFootprints.add(new Bicycle("Mountain Bike", 1000));

        for (CarbonFootprint carbonFootprint : carbonFootprints) {
            System.out.println(carbonFootprint.toString());
            System.out.println("Carbon Footprint: " + carbonFootprint.getCarbonFootprint());
            System.out.println();
        }
    }

}
