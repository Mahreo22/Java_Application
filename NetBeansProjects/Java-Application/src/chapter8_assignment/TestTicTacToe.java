
package chapter8_assignment;
import java.util.Scanner;

public class TestTicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        Scanner scanner = new Scanner(System.in);

        Mark currentPlayer = Mark.X;

        while (true) {
            game.printBoard();
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.isValidMove(row, col)) {
                game.makeMove(row, col, currentPlayer);

                if (game.isWinner(currentPlayer)) {
                    game.printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (game.isDraw()) {
                    game.printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                currentPlayer = (currentPlayer == Mark.X) ? Mark.O : Mark.X;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

}
