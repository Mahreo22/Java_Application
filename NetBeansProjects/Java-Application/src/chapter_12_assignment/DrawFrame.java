
package chapter_12_assignment;
import chapter8_assignment.DrawPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawFrame extends JFrame {
    private DrawPanel drawPanel;

    public DrawFrame() {
        drawPanel = new DrawPanel(new JLabel(""));

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create a "File" menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create "Clear Last Shape" and "Clear Drawing" menu items
        JMenuItem clearLastShapeItem = new JMenuItem("Clear Last Shape");
        clearLastShapeItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.clearLastShape();
            }
        });
        fileMenu.add(clearLastShapeItem);

        JMenuItem clearDrawingItem = new JMenuItem("Clear Drawing");
        clearDrawingItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.clearDrawing();
            }
        });
        fileMenu.add(clearDrawingItem);

        // Create a "Shape" menu
        JMenu shapeMenu = new JMenu("Shape");
        menuBar.add(shapeMenu);

        // Create radio buttons for shape types
        ButtonGroup shapeButtonGroup = new ButtonGroup();

        JRadioButtonMenuItem lineItem = new JRadioButtonMenuItem("Line");
        lineItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setShapeType(0);
            }
        });
        shapeButtonGroup.add(lineItem);
        shapeMenu.add(lineItem);

        JRadioButtonMenuItem rectangleItem = new JRadioButtonMenuItem("Rectangle");
        rectangleItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setShapeType(1);
            }
        });
        shapeButtonGroup.add(rectangleItem);
        shapeMenu.add(rectangleItem);

        JRadioButtonMenuItem ovalItem = new JRadioButtonMenuItem("Oval");
        ovalItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setShapeType(2);
            }
        });
        shapeButtonGroup.add(ovalItem);
        shapeMenu.add(ovalItem);

        // Create a "Color" menu
        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);

        // Create menu items for colors
        JMenuItem blackColorItem = new JMenuItem("Black");
        blackColorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setCurrentColor(Color.BLACK);
            }
        });
        colorMenu.add(blackColorItem);

        JMenuItem redColorItem = new JMenuItem("Red");
        redColorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setCurrentColor(Color.RED);
            }
        });
        colorMenu.add(redColorItem);

        JMenuItem blueColorItem = new JMenuItem("Blue");
        blueColorItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setCurrentColor(Color.BLUE);
            }
        });
        colorMenu.add(blueColorItem);

        // Create a "Filled" checkbox
        JCheckBoxMenuItem filledCheckBox = new JCheckBoxMenuItem("Filled");
        filledCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPanel.setFilledShape(filledCheckBox.isSelected());
            }
        });
        shapeMenu.add(filledCheckBox);

        // Add the draw panel to the frame
        add(drawPanel, BorderLayout.CENTER);
        add(drawPanel.getStatusLabel(), BorderLayout.SOUTH);

        // Set up the frame
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Draw Application");
        setVisible(true);
    }

    public static void main(String[] args) {
        new DrawFrame();
    }
}
