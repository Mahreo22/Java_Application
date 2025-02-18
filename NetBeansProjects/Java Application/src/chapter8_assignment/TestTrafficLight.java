
package chapter8_assignment;

public class TestTrafficLight {
    public static void main(String[] args) {
        // display enum constants and their durations
        for (TrafficLight light : TrafficLight.values()) {
            System.out.printf("%s: %d seconds%n", light, light.getDuration());
        }
    }

}
