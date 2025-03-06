
package chapter_12_assignment;
import chapter8_assignment.DrawPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class DrawFrame2 extends JFrame {
    private DrawPanel drawPanel;
    private JLabel statusBar;

    public DrawFrame2() {
        statusBar = new JLabel("Ready");

        drawPanel = new DrawPanel(statusBar);

        // Create top panel
        JPanel topPanel = new JPanel();

        // Create undo button
        JButton undoButton = new JButton("Undo");
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.clearLastShape();
            }
        });
        topPanel.add(undoButton);

        // Create clear button
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.clearDrawing();
            }
        });
        topPanel.add(clearButton);

        // Create color combo box
        String[] colors = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", "Pink", "Red", "White", "Yellow"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        colorComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String colorName = (String) e.getItem();
                Color color = getColor(colorName);
                drawPanel.setCurrentColor(color);
            }
        });
        topPanel.add(new JLabel("Color:"));
        topPanel.add(colorComboBox);

        // Create shape combo box
        String[] shapes = {"Line", "Rectangle", "Oval"};
        JComboBox<String> shapeComboBox = new JComboBox<>(shapes);
        shapeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String shapeName = (String) e.getItem();
                int shapeType = getShapeType(shapeName);
                drawPanel.setShapeType(shapeType);
            }
        });
        topPanel.add(new JLabel("Shape:"));
        topPanel.add(shapeComboBox);

        // Create filled checkbox
        JCheckBox filledCheckBox = new JCheckBox("Filled");
        filledCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setFilledShape(filledCheckBox.isSelected());
            }
        });
        topPanel.add(filledCheckBox);

        // Add top panel to frame
        add(topPanel, BorderLayout.NORTH);

        // Add draw panel to frame
        add(drawPanel, BorderLayout.CENTER);

        // Add status bar to frame
        add(statusBar, BorderLayout.SOUTH);

        // Set up frame
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Draw Application");
        setVisible(true);
    }

    private Color getColor(String colorName) {
        switch (colorName) {
            case "Black":
                return Color.BLACK;
            case "Blue":
                return Color.BLUE;
            case "Cyan":
                return Color.CYAN;
            case "Dark Gray":
                return Color.DARK_GRAY;
            case "Gray":
                return Color.GRAY;
            case "Green":
                return Color.GREEN;
            case "Light Gray":
                return Color.LIGHT_GRAY;
            case "Magenta":
                return Color.MAGENTA;
            case "Orange":
                return Color.ORANGE;
            case "Pink":
                return Color.PINK;
            case "Red":
                return Color.RED;
            case "White":
                return Color.WHITE;
            case "Yellow":
                return Color.YELLOW;
            default:
                return Color.BLACK;
        }
    }

    private int getShapeType(String shapeName) {
        switch (shapeName) {
            case "Line":
                return 0;
            case "Rectangle":
                return 1;
            case "Oval":
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        new DrawFrame2();
    }
}
