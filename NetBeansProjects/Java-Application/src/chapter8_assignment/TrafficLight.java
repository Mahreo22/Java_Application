/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package chapter8_assignment;

/**
 *
 * @author LENOVO
 */
public enum TrafficLight {
    RED(30), // red light duration in seconds
    GREEN(60), // green light duration in seconds
    YELLOW(10); // yellow light duration in seconds

    private final int duration; // duration of the light

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}
