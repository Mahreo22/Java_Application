
package chaprter_12.swing;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class JCheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Demo");
        JCheckBox checkBox = new JCheckBox("Accept Terms and Conditions");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(checkBox);
    }
}
