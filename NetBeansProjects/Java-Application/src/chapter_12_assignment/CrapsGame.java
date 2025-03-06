
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CrapsGame extends JFrame {
    private JTextField die1Field;
    private JTextField die2Field;
    private JTextField sumField;
    private JTextField pointField;
    private int point;
    private boolean firstRoll;

    public CrapsGame() {
        setLayout(new FlowLayout());

        // Create labels and text fields to display the dice and sum
        add(new JLabel("Die 1:"));
        die1Field = new JTextField(5);
        die1Field.setEditable(false);
        add(die1Field);

        add(new JLabel("Die 2:"));
        die2Field = new JTextField(5);
        die2Field.setEditable(false);
        add(die2Field);

        add(new JLabel("Sum:"));
        sumField = new JTextField(5);
        sumField.setEditable(false);
        add(sumField);

        add(new JLabel("Point:"));
        pointField = new JTextField(5);
        pointField.setEditable(false);
        add(pointField);

        // Create a button to roll the dice
        JButton rollButton = new JButton("Roll Dice");
        rollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rollDice();
            }
        });
        add(rollButton);

        // Initialize the game state
        point = 0;
        firstRoll = true;

        // Set up the frame
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Craps Game");
        setVisible(true);
    }

    private void rollDice() {
        // Roll the dice
        Random random = new Random();
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int sum = die1 + die2;

        // Update the GUI
        die1Field.setText(String.valueOf(die1));
        die2Field.setText(String.valueOf(die2));
        sumField.setText(String.valueOf(sum));

        // Determine the game outcome
        if (firstRoll) {
            firstRoll = false;
            if (sum == 7 || sum == 11) {
                JOptionPane.showMessageDialog(this, "You win!");
                System.exit(0);
            } else if (sum == 2 || sum == 3 || sum == 12) {
                JOptionPane.showMessageDialog(this, "You lose!");
                System.exit(0);
            } else {
                point = sum;
                pointField.setText(String.valueOf(point));
            }
        } else {
            if (sum == point) {
                JOptionPane.showMessageDialog(this, "You win!");
                System.exit(0);
            } else if (sum == 7) {
                JOptionPane.showMessageDialog(this, "You lose!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new CrapsGame();
    }
}
