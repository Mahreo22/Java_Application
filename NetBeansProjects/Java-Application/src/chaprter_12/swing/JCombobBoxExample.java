
package chapter_12.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCombobBoxExample {
    public static void main(String[] args) {
        // Create the frame for the GUI
        JFrame frame = new JFrame("Date of Birth Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        
        // Create labels for the combo boxes
        JLabel dayLabel = new JLabel("Day: ");
        JLabel monthLabel = new JLabel("Month: ");
        JLabel yearLabel = new JLabel("Year: ");
        
        // Create the combo boxes for Day, Month, and Year
        String[] days = new String[31];
        for (int i = 0; i < 31; i++) {
            days[i] = String.format("%02d", i + 1);  // Days from 01 to 31
        }
        JComboBox<String> dayComboBox = new JComboBox<>(days);
        
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        
        // Populate the years from 1900 to the current year
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        String[] years = new String[currentYear - 1899];
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(currentYear - i);  // Years from current year back to 1900
        }
        JComboBox<String> yearComboBox = new JComboBox<>(years);
        
        // Create a button to show the selected date of birth
        JButton submitButton = new JButton("Submit");
        
        // Label to display the selected date of birth
        JLabel resultLabel = new JLabel("Selected Date of Birth: None");
        
        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected day, month, and year
                String selectedDay = (String) dayComboBox.getSelectedItem();
                String selectedMonth = (String) monthComboBox.getSelectedItem();
                String selectedYear = (String) yearComboBox.getSelectedItem();
                
                // Display the selected date of birth
                resultLabel.setText("Selected Date of Birth: " + selectedDay + " " + selectedMonth + " " + selectedYear);
            }
        });
        
        // Set up the layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2)); // 4 rows, 2 columns
        panel.add(dayLabel);
        panel.add(dayComboBox);
        panel.add(monthLabel);
        panel.add(monthComboBox);
        panel.add(yearLabel);
        panel.add(yearComboBox);
        panel.add(submitButton);
        
        // Add components to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.add(resultLabel, BorderLayout.SOUTH);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
