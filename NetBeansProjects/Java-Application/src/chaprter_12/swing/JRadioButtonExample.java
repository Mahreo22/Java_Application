
package chaprter_12.swing;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Demo");
        JRadioButton radioButton1 = new JRadioButton("Male");
        JRadioButton radioButton2 = new JRadioButton("Female");
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel panel = new JPanel();
        
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        
        panel.add(radioButton1);
        panel.add(radioButton2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(panel);
    }
}
