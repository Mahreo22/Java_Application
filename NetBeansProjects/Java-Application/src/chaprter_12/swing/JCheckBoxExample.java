
package chapter_12.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxExample{

    public static void main(String[] args) {
        // Create the frame for the application window
        JFrame frame = new JFrame("Course Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Create a panel to hold the checkboxes
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // Vertically align the checkboxes
        
        // Create the checkboxes for different courses
        JCheckBox pythonCheckbox = new JCheckBox("Python");
        JCheckBox javaCheckbox = new JCheckBox("Java");
        JCheckBox sqlCheckbox = new JCheckBox("SQL");
        JCheckBox htmlCssCheckbox = new JCheckBox("HTML & CSS");
        JCheckBox javascriptCheckbox = new JCheckBox("JavaScript");
        
        // Add checkboxes to the panel
        panel.add(pythonCheckbox);
        panel.add(javaCheckbox);
        panel.add(sqlCheckbox);
        panel.add(htmlCssCheckbox);
        panel.add(javascriptCheckbox);
        
        // Create a button to display the selected courses
        JButton submitButton = new JButton("Submit");
        
        // Create a label to show the selected courses
        JLabel resultLabel = new JLabel("Selected Courses: None");
        
        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Gather the selected courses
                StringBuilder selectedCourses = new StringBuilder("Selected Courses: ");
                
                if (pythonCheckbox.isSelected()) {
                    selectedCourses.append("Python, ");
                }
                if (javaCheckbox.isSelected()) {
                    selectedCourses.append("Java, ");
                }
                if (sqlCheckbox.isSelected()) {
                    selectedCourses.append("SQL, ");
                }
                if (htmlCssCheckbox.isSelected()) {
                    selectedCourses.append("HTML & CSS, ");
                }
                if (javascriptCheckbox.isSelected()) {
                    selectedCourses.append("JavaScript, ");
                }
                
                // Remove the trailing comma and space if any courses were selected
                if (selectedCourses.length() > 16) {
                    selectedCourses.setLength(selectedCourses.length() - 2);  // Remove last comma and space
                } else {
                    selectedCourses.append("None");
                }
                
                // Update the label with the selected courses
                resultLabel.setText(selectedCourses.toString());
            }
        });
        
        // Add components to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(submitButton, BorderLayout.SOUTH);
        frame.add(resultLabel, BorderLayout.NORTH);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}