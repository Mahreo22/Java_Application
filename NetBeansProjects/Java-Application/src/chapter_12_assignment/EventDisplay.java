
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EventDisplay extends JFrame {
    private JTextArea displayArea;

    public EventDisplay() {
        setLayout(new BorderLayout());

        // Create a text area to display events
        displayArea = new JTextArea(10, 20);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        // Create a button to generate action events
        JButton actionButton = new JButton("Action");
        actionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayEvent("Action Event", e);
            }
        });
        add(actionButton, BorderLayout.NORTH);

        // Create a combo box to generate item events
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> itemComboBox = new JComboBox<>(items);
        itemComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                displayEvent("Item Event", e);
            }
        });
        add(itemComboBox, BorderLayout.WEST);

        // Create a list to generate list selection events
        String[] listItems = {"List Item 1", "List Item 2", "List Item 3"};
        JList<String> list = new JList<>(listItems);
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                displayEvent("List Selection Event", e);
            }
        });
        add(new JScrollPane(list), BorderLayout.EAST);

        // Create a mouse listener to generate mouse events
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                displayEvent("Mouse Clicked", e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                displayEvent("Mouse Pressed", e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                displayEvent("Mouse Released", e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                displayEvent("Mouse Entered", e);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                displayEvent("Mouse Exited", e);
            }
        });

        // Create a mouse motion listener to generate mouse motion events
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                displayEvent("Mouse Dragged", e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                displayEvent("Mouse Moved", e);
            }
        });

        // Create a key listener to generate key events
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                displayEvent("Key Typed", e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                displayEvent("Key Pressed", e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                displayEvent("Key Released", e);
            }
        });

        // Set up the frame
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Event Display");
        setVisible(true);
    }

    private void displayEvent(String eventType, Object event) {
        displayArea.append(eventType + ": " + event.toString() + "\n");
    }

    public static void main(String[] args) {
        new EventDisplay();
    }
}
