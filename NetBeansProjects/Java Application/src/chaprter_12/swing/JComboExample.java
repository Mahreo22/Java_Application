
package chaprter_12.swing;
import javax.swing.JFrame;
import javax.swing.JComboBox;
public class JComboExample {
    public static void main(String[] args) {
        String [] countries = {"Nigeria","Ghana","Norway","Belgium","Ethopia",
            "China","South Korea","USA"};
        JFrame frame = new JFrame("Combo box Demo");
        JComboBox<String> comboBox = new JComboBox<>(countries);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(comboBox);
    }
}
