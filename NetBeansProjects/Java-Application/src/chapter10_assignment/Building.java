/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter10_assignment;

/**
 *
 * @author LENOVO
 */
public class Building implements CarbonFootprint{
    private int squareFootage;
    private int numberOfFloors;
    private String fuelType;

    public Building(int squareFootage, int numberOfFloors, String fuelType) {
        this.squareFootage = squareFootage;
        this.numberOfFloors = numberOfFloors;
        this.fuelType = fuelType;
    }

    @Override
    public double getCarbonFootprint() {
        // Calculate carbon footprint based on square footage, number of floors, and fuel type
        double carbonFootprint = 0.0;
        if (fuelType.equals("Natural Gas")) {
            carbonFootprint = squareFootage * numberOfFloors * 10.0;
        } else if (fuelType.equals("Electricity")) {
            carbonFootprint = squareFootage * numberOfFloors * 5.0;
        }
        return carbonFootprint;
    }

    @Override
    public String toString() {
        return "Building with " + squareFootage + " square footage, " + numberOfFloors + " floors, and " + fuelType + " fuel type";
    }

}
