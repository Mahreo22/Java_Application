/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;

public class PrinterGUIDemo extends JDialog {
    public PrinterGUIDemo(JFrame parent) {
        super(parent, "Printer", true); // Modal dialog
        setSize(400, 300); // Set an appropriate size
        setLayout(new GridBagLayout()); // Use GridBagLayout for flexibility

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding

        // Printer Label
        JLabel printerLabel = new JLabel("Printer: MyPrinter");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2; // Span two columns
        gbc.anchor = GridBagConstraints.WEST;
        add(printerLabel, gbc);

        // Checkboxes
        JCheckBox imageCheckBox = new JCheckBox("Image");
        JCheckBox textCheckBox = new JCheckBox("Text");
        JCheckBox codeCheckBox = new JCheckBox("Code");
        JCheckBox printToFileCheckBox = new JCheckBox("Print to File");

        gbc.gridwidth = 1; // Reset gridwidth
        gbc.gridy = 1;
        add(imageCheckBox, gbc);

        gbc.gridy = 2;
        add(textCheckBox, gbc);

        gbc.gridy = 3;
        add(codeCheckBox, gbc);

        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2; // Span two columns
        add(printToFileCheckBox, gbc);

        // Radio Buttons (Group 1)
        JRadioButton selectionRadioButton = new JRadioButton("Selection");
        JRadioButton allRadioButton = new JRadioButton("All");
        JRadioButton appletRadioButton = new JRadioButton("Applet");

        ButtonGroup radioButtonGroup1 = new ButtonGroup();
        radioButtonGroup1.add(selectionRadioButton);
        radioButtonGroup1.add(allRadioButton);
        radioButtonGroup1.add(appletRadioButton);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1; // Reset gridwidth
        add(selectionRadioButton, gbc);

        gbc.gridy = 2;
        add(allRadioButton, gbc);

        gbc.gridy = 3;
        add(appletRadioButton, gbc);

        // Print Quality Combo Box
        JLabel printQualityLabel = new JLabel("Print Quality:");
        String[] printQualityOptions = {"High"};
        JComboBox<String> printQualityComboBox = new JComboBox<>(printQualityOptions);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(printQualityLabel, gbc);

        gbc.gridx = 1;
        add(printQualityComboBox, gbc);

        // Buttons
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        JButton setupButton = new JButton("Setup...");
        JButton helpButton = new JButton("Help");

        gbc.gridx = 3;
        gbc.gridy = 1;
        add(okButton, gbc);

        gbc.gridy = 2;
        add(cancelButton, gbc);

        gbc.gridy = 3;
        add(setupButton, gbc);

        gbc.gridy = 4;
        add(helpButton, gbc);

        setLocationRelativeTo(parent); // Center relative to parent
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame(); // Create a parent frame
                frame.setSize(500, 400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                new PrinterGUIDemo(frame); // Create the dialog
            }
        });
    }
}
