
package chapter_12.swing;
import javax.swing.*;
import java.awt.event.*;

public class JTextFieldExample {
    public static void main(String[] args) {
        try {
            // Create frame
            JFrame frame = new JFrame("Login Example");
            
            // Create UI components
            JLabel usernameLabel = new JLabel("Username: ");
            JTextField usernameField = new JTextField(20);
            
            JLabel passwordLabel = new JLabel("Password: ");
            JPasswordField passwordField = new JPasswordField(20);
            
            JButton loginButton = new JButton("Login");

            // Define valid username and password
            String validUsername = "admin";
            String validPassword = "password123";
            
            // Add action listener for the login button
            loginButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Get entered username and password
                    String username = usernameField.getText();
                    char[] passwordChars = passwordField.getPassword();  // Get password as char[]
                    
                    // Convert char[] to String for comparison
                    String password = new String(passwordChars);

                    // Validate username and password
                    if (username.equals(validUsername) && password.equals(validPassword)) {
                        JOptionPane.showMessageDialog(frame, "Login Successful!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                    }
                }
            });

            // Layout setup
            JPanel panel = new JPanel();
            panel.add(usernameLabel);
            panel.add(usernameField);
            panel.add(passwordLabel);
            panel.add(passwordField);
            panel.add(loginButton);

            // Frame setup
            frame.add(panel);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}