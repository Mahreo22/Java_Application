
package chaprter_12.swing;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Demo");
        JTextField textField = new JTextField("Laycon",50);
        textField.setFont(new Font("Times New Roman", Font.PLAIN, 16)); // Set font size and style
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(textField);
    }
}
