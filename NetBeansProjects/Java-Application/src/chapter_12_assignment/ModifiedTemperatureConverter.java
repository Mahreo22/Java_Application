
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModifiedTemperatureConverter extends JFrame {
    private JTextField inputField;
    private JComboBox<String> inputUnitComboBox;
    private JComboBox<String> outputUnitComboBox;
    private JLabel resultLabel;

    public ModifiedTemperatureConverter() {
        setLayout(new FlowLayout());

        // Create a label and text field for input
        add(new JLabel("Input:"));
        inputField = new JTextField(10);
        add(inputField);

        // Create combo boxes for input and output units
        String[] units = {"Fahrenheit", "Celsius", "Kelvin"};
        inputUnitComboBox = new JComboBox<>(units);
        outputUnitComboBox = new JComboBox<>(units);
        add(new JLabel("Input Unit:"));
        add(inputUnitComboBox);
        add(new JLabel("Output Unit:"));
        add(outputUnitComboBox);

        // Create a button to trigger the conversion
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });
        add(convertButton);

        // Create a label to display the converted temperature
        resultLabel = new JLabel("Result: ");
        add(resultLabel);

        // Set up the frame
        setSize(400, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setVisible(true);
    }

    private void convertTemperature() {
        try {
            double inputTemperature = Double.parseDouble(inputField.getText());
            String inputUnit = (String) inputUnitComboBox.getSelectedItem();
            String outputUnit = (String) outputUnitComboBox.getSelectedItem();

            double result = 0;
            if (inputUnit.equals("Fahrenheit")) {
                if (outputUnit.equals("Celsius")) {
                    result = (inputTemperature - 32) * 5 / 9;
                } else if (outputUnit.equals("Kelvin")) {
                    result = (inputTemperature - 32) * 5 / 9 + 273.15;
                }
            } else if (inputUnit.equals("Celsius")) {
                if (outputUnit.equals("Fahrenheit")) {
                    result = inputTemperature * 9 / 5 + 32;
                } else if (outputUnit.equals("Kelvin")) {
                    result = inputTemperature + 273.15;
                }
            } else if (inputUnit.equals("Kelvin")) {
                if (outputUnit.equals("Fahrenheit")) {
                    result = (inputTemperature - 273.15) * 9 / 5 + 32;
                } else if (outputUnit.equals("Celsius")) {
                    result = inputTemperature - 273.15;
                }
            }

            resultLabel.setText("Result: " + String.format("%.2f", result) + " " + outputUnit);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
