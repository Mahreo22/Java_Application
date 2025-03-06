
package chapter_12_assignment;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessTheNumberGame extends JFrame {
    private JTextField guessField;
    private JLabel hintLabel;
    private int numberToGuess;
    private int previousGuess;

    public GuessTheNumberGame() {
        setLayout(new FlowLayout());

        // Generate a random number between 1 and 1000
        numberToGuess = new Random().nextInt(1000) + 1;

        // Create a label to display the game's instructions
        add(new JLabel("I have a number between 1 and 1000. Can you guess my number?"));

        // Create a text field to input the guess
        guessField = new JTextField(10);
        add(guessField);

        // Create a label to display hints
        hintLabel = new JLabel("Please enter your first guess.");
        add(hintLabel);

        // Create a button to submit the guess
        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        add(guessButton);

        // Create a button to play the game again
        JButton playAgainButton = new JButton("Play Again");
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playAgain();
            }
        });
        add(playAgainButton);

        // Set up the frame
        setSize(400, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Guess-the-Number Game");
        setVisible(true);
    }

    private void checkGuess() {
        try {
            int guess = Integer.parseInt(guessField.getText());

            if (guess < 1 || guess > 1000) {
                hintLabel.setText("Please enter a number between 1 and 1000.");
                return;
            }

            if (guess == numberToGuess) {
                hintLabel.setText("Correct!");
                guessField.setEditable(false);
            } else {
                if (guess < numberToGuess) {
                    hintLabel.setText("Too Low");
                } else {
                    hintLabel.setText("Too High");
                }

                if (previousGuess != 0) {
                    if (Math.abs(guess - numberToGuess) < Math.abs(previousGuess - numberToGuess)) {
                        guessField.setBackground(Color.RED);
                    } else {
                        guessField.setBackground(Color.BLUE);
                    }
                }

                previousGuess = guess;
            }
        } catch (NumberFormatException e) {
            hintLabel.setText("Invalid input");
        }
    }

    private void playAgain() {
        numberToGuess = new Random().nextInt(1000) + 1;
        guessField.setEditable(true);
        guessField.setBackground(Color.WHITE);
        hintLabel.setText("Please enter your first guess.");
        previousGuess = 0;
    }

    public static void main(String[] args) {
        new GuessTheNumberGame();
    }
}
