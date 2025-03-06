
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;

public class CalculatorGUIDemo extends JFrame {
    public CalculatorGUIDemo() {
        setTitle("Calculator");
        setSize(300, 400); // Set an appropriate size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Use BorderLayout for organization

        // Display Area (JTextField)
        JTextField display = new JTextField();
        display.setHorizontalAlignment(JTextField.RIGHT); // Align text to the right
        add(display, BorderLayout.NORTH);

        // Button Panel (GridLayout)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4)); // 4 rows, 4 columns

        // Number Buttons
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "+",
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUIDemo();
            }
        });
    }
}
