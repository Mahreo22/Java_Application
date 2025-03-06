
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcofontViewer extends JFrame {
    private JTextArea textArea;
    private JButton increaseFontSizeButton;
    private JButton decreaseFontSizeButton;
    private int fontSize = 9;

    public EcofontViewer() {
        // Create text area
        textArea = new JTextArea(20, 40);
        textArea.setFont(new Font("Spranq Eco Sans", Font.PLAIN, fontSize));

        // Create buttons
        increaseFontSizeButton = new JButton("Increase Font Size");
        increaseFontSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                increaseFontSize();
            }
        });

        decreaseFontSizeButton = new JButton("Decrease Font Size");
        decreaseFontSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decreaseFontSize();
            }
        });

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(increaseFontSizeButton);
        buttonPanel.add(decreaseFontSizeButton);

        // Add components to frame
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set up frame
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ecofont Viewer");
        setVisible(true);
    }

    private void increaseFontSize() {
        fontSize++;
        textArea.setFont(new Font("Spranq Eco Sans", Font.PLAIN, fontSize));
    }

    private void decreaseFontSize() {
        if (fontSize > 1) {
            fontSize--;
            textArea.setFont(new Font("Spranq Eco Sans", Font.PLAIN, fontSize));
        }
    }

    public static void main(String[] args) {
        new EcofontViewer();
    }
}
