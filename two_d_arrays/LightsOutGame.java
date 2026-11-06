import java.util.Scanner;
import java.util.Random;

class LightsOutGame {

  // 1. Declare the 2D array representing a 3x3 grid of lights
  // true = Light is ON ('O'), false = Light is OFF ('.')
  private static final int SIZE = 3;
  private static final boolean[][] board = new boolean[SIZE][SIZE];

  // 2. Initialize the board with a random configuration of lights
  private static void initializeBoard() {
    Random random = new Random();

    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        board[row][col] = random.nextBoolean();
      }
    }
  }

  // 2. Printing the 2D array using a nested for loop
  private static void printBoard() {
    System.out.println("\n  0 1 2");
    for (int row = 0; row < SIZE; row++) {
      System.out.print(row + " "); // Row headers
      for (int col = 0; col < SIZE; col++) {
        System.out.print((board[row][col] ? "O " : ". ") + " "); // Print 'O' for ON and '.' for OFF
      }
      System.out.println();
    }
  }

  // 3. Toggle to modify the state of a light and its adjacent lights
  private static void toggle(int row, int col) {
    // Toggle the selected light
    board[row][col] = !board[row][col];

    // Toggle adjacent lights (up, down, left, right)
    if (row > 0) board[row - 1][col] = !board[row - 1][col]; // Up
    //
    if (row < SIZE - 1) board[row + 1][col] = !board[row + 1][col]; // Down
    //
    if (col > 0) board[row][col - 1] = !board[row][col - 1]; // Left
    //
    if (col < SIZE - 1) board[row][col + 1] = !board[row][col + 1]; // Right
    //
  }

  private static boolean isGameWon() {
    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        if (board[row][col]) { // If any light is ON
          return false;
        }
      }
    }
    return true; // All lights are OFF
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    initializeBoard();

    // Game loop
    while (!isGameWon()) {
      printBoard();

      System.out.print("\nEnter row (0-2) and column (0-2) separated by space to toggle (or type 'exit' to quit): ");
      String input = scanner.nextLine();

      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Exiting the game. Goodbye!");
        break;
      }

      String[] parts = input.split(" ");
      if (parts.length != 2) {
        System.out.println("Invalid input. Please enter two numbers separated by space.");
        continue;
      }

      try {
        int row = Integer.parseInt(parts[0]);
        int col = Integer.parseInt(parts[1]);

        // validate player input bounds
        if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
          toggle(row, col);
        } else {
          System.out.println("Invalid input. Please enter numbers between 0 and 2.");
        }

      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter valid integers.");
      }
    }

    printBoard();
    System.out.println("Congratulations! You've turned off all the lights!");
    scanner.close();
    
  }
}

