
package chapter8_assignment;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {
   private SecureRandom randomNumbers = new SecureRandom();
    private MyLine[] lines; // array of lines

    // constructor, creates a panel with random shapes
    public DrawPanel(JLabel jLabel) {
        setBackground(Color.WHITE);
        lines = new MyLine[5 + randomNumbers.nextInt(5)]; // create lines

        for (int count = 0; count < lines.length; count++) {
            // generate random coordinates
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);

            // generate a random color
            Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

            // add the line to the list of lines to be displayed
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        }
    }

    private DrawPanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // for each shape array, draw the individual shapes
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // draw the lines
        for (MyLine line : lines) {
            line.draw(g);
        }
    }

    public void clearLastShape() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void clearDrawing() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setShapeType(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCurrentColor(Color BLACK) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setFilledShape(boolean selected) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Component getStatusLabel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static void main(String[] args) {
        new DrawPanel();
    }
 
}
