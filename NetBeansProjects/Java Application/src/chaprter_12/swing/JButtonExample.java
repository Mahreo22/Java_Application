
package chaprter_12.swing;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Demo");
        JButton button = new JButton("Click me");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(button);
    }
}
