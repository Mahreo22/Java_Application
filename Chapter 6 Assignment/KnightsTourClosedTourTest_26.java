public class KnightsTourClosedTourTest_26 {
    private static final int BOARD_SIZE = 8;
    private static final int[][] MOVES = {
        {2, -1}, {1, -2}, {-1, -2}, {-2, -1},
        {-2, 1}, {-1, 2}, {1, 2}, {2, 1}
    };

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        int currentRow = 0;
        int currentColumn = 0;
        int moveNumber = 1;

        board[currentRow][currentColumn] = moveNumber;

        while (moveNumber < BOARD_SIZE * BOARD_SIZE) {
            int nextRow = -1;
            int nextColumn = -1;
            int bestMove = -1;

            for (int i = 0; i < MOVES.length; i++) {
                int newRow = currentRow + MOVES[i][0];
                int newColumn = currentColumn + MOVES[i][1];

                if (isValidMove(board, newRow, newColumn)) {
                    if (bestMove == -1 || getDegree(board, newRow, newColumn) < getDegree(board, nextRow, nextColumn)) {
                        bestMove = i;
                        nextRow = newRow;
                        nextColumn = newColumn;
                    }
                }
            }

            if (bestMove == -1) {
                break;
            }

            moveNumber++;
            board[nextRow][nextColumn] = moveNumber;
            currentRow = nextRow;
            currentColumn = nextColumn;
        }

        if (moveNumber == BOARD_SIZE * BOARD_SIZE) {
            System.out.println("Full tour found!");
            printBoard(board);

            if (isClosedTour(board, currentRow, currentColumn)) {
                System.out.println("Closed tour found!");
            } else {
                System.out.println("Not a closed tour.");
            }
        }
    }

    private static boolean isValidMove(int[][] board, int row, int column) {
        return row >= 0 && row < BOARD_SIZE && column >= 0 && column < BOARD_SIZE && board[row][column] == 0;
    }

    private static int getDegree(int[][] board, int row, int column) {
        int degree = 0;

        for (int[] move : MOVES) {
            int newRow = row + move[0];
            int newColumn = column + move[1];

            if (isValidMove(board, newRow, newColumn)) {
                degree++;
            }
        }

        return degree;
    }

    private static boolean isClosedTour(int[][] board, int row, int column) {
        for (int[] move : MOVES) {
            int newRow = row + move[0];
            int newColumn = column + move[1];

            if (newRow == 0 && newColumn == 0) {
                return true;
            }
        }

        return false;
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
