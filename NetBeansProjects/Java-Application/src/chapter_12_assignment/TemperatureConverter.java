
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField fahrenheitField;
    private JLabel celsiusLabel;

    public TemperatureConverter() {
        setLayout(new FlowLayout());

        // Create a label and text field for Fahrenheit input
        add(new JLabel("Fahrenheit:"));
        fahrenheitField = new JTextField(10);
        add(fahrenheitField);

        // Create a button to trigger the conversion
        JButton convertButton = new JButton("Convert to Celsius");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFahrenheitToCelsius();
            }
        });
        add(convertButton);

        // Create a label to display the converted Celsius temperature
        celsiusLabel = new JLabel("Celsius: ");
        add(celsiusLabel);

        // Set up the frame
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperature Converter");
        setVisible(true);
    }

    private void convertFahrenheitToCelsius() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = 5 / 9.0 * (fahrenheit - 32);
            celsiusLabel.setText("Celsius: " + String.format("%.2f", celsius));
        } catch (NumberFormatException e) {
            celsiusLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}

