
package chaprter_12.swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Demo");
        JLabel label = new JLabel("Learning java is fun!",SwingConstants.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
        
        
    }
}
