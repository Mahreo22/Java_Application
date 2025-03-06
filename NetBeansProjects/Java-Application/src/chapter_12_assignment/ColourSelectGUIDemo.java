
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;

public class ColourSelectGUIDemo extends JDialog {

    public ColourSelectGUIDemo(JFrame parent) {
        super(parent, "ColorSelect", true); // Modal dialog
        setSize(300, 200); // Set an appropriate size
        setLayout(new FlowLayout()); // Use FlowLayout for simplicity

        // Combo Box
        String[] colors = {"RED"}; // Array of color options
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        add(colorComboBox);

        // Checkboxes
        JCheckBox backgroundCheckBox = new JCheckBox("Background");
        JCheckBox foregroundCheckBox = new JCheckBox("Foreground");
        add(backgroundCheckBox);
        add(foregroundCheckBox);

        // Buttons
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");
        add(okButton);
        add(cancelButton);

        setLocationRelativeTo(parent); // Center relative to parent
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame(); // Create a parent frame
                frame.setSize(400, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                new ColourSelectGUIDemo(frame); // Create the dialog
            }
        });
    }
}
