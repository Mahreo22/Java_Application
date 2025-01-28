public class TurtleGraphics_20 {
    private static final int FLOOR_SIZE = 20;
    private static final int PEN_UP = 0;
    private static final int PEN_DOWN = 1;

    public static void main(String[] args) {
        int[][] floor = new int[FLOOR_SIZE][FLOOR_SIZE];
        int x = 0;
        int y = 0;
        int penPosition = PEN_UP;

        // Read commands
        int[][] commands = {
            {2, 5, 12}, // Move forward 5 steps, turn right 12 degrees
            {3, 5, 12}, // Move backward 5 steps, turn left 12 degrees
            {1, 6}, // Pen up, move forward 6 steps
            {9} // Display floor
        };

        // Process commands
        for (int[] command : commands) {
            switch (command[0]) {
                case 1: // Pen up
                    penPosition = PEN_UP;
                    x += command[1];
                    break;
                case 2: // Move forward
                    if (penPosition == PEN_DOWN) {
                        for (int i = 0; i < command[1]; i++) {
                            floor[x][y] = 1;
                            x++;
                        }
                    } else {
                        x += command[1];
                    }
                    break;
                case 3: // Move backward
                    if (penPosition == PEN_DOWN) {
                        for (int i = 0; i < command[1]; i++) {
                            floor[x][y] = 1;
                            x--;
                        }
                    } else {
                        x -= command[1];
                    }
                    break;
                case 9: // Display floor
                    displayFloor(floor);
                    break;
            }
        }
    }

    private static void displayFloor(int[][] floor) {
        for (int i = 0; i < floor.length; i++) {
            for (int j = 0; j < floor[i].length; j++) {
                if (floor[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
