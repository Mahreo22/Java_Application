
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;

public class AlignGUIDemo extends JFrame {
    public AlignGUIDemo() {
        setTitle("Align");
        setSize(300, 200); // Set an appropriate size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // Use FlowLayout for simplicity

        // Checkboxes
        JCheckBox snapToGrid = new JCheckBox("Snap to Grid");
        JCheckBox showGrid = new JCheckBox("Show Grid");

        // Text Fields
        JTextField xField = new JTextField(5); // 5 columns wide
        JTextField yField = new JTextField(5);

        // Labels for Text Fields
        JLabel xLabel = new JLabel("X");
        JLabel yLabel = new JLabel("Y");

        // Buttons
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Cancel");
        JButton helpButton = new JButton("Help");

        // Add components to the frame
        add(snapToGrid);
        add(showGrid);
        add(xLabel);
        add(xField);
        add(yLabel);
        add(yField);
        add(okButton);
        add(cancelButton);
        add(helpButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AlignGUIDemo();
            }
        });
    }
}
