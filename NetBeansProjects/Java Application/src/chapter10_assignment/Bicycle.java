
package chapter10_assignment;

public class Bicycle implements CarbonFootprint{
    private String type;
    private int milesRidden;

    public Bicycle(String type, int milesRidden) {
        this.type = type;
        this.milesRidden = milesRidden;
    }

    @Override
    public double getCarbonFootprint() {
        // Calculate carbon footprint based on miles ridden (assuming 0 carbon footprint for bicycles)
        return 0.0;
    }

    @Override
    public String toString() {
        return "Bicycle with " + type + " type and " + milesRidden + " miles ridden";
    }

}
