class TicTacToe implements BoardGameInterface {

  private char[][] board; // board for tic tac toe
  private char currentPlayer;

  public static final int NUM_ROWS = 3;
  public static final int NUM_COLS = 3;

  public TicTacToe() {
    board = new char[NUM_ROWS][NUM_COLS];
    currentPlayer = PLAYER_X;
    populateBoard();
  }

  // getter for current player
  public char getCurrentPlayer() {
    return currentPlayer;
  }

  @Override
  public void populateBoard() {
    for (int row = 0; row < NUM_ROWS; row++) {
      for (int col = 0; col < NUM_COLS; col++) {
        board[row][col] = EMPTY_CELL;
      }
    }
  }

  @Override
  public void displayBoard() {
    System.out.println("Current Board:");
    for (int row = 0; row < NUM_ROWS; row++) {
      for (int col = 0; col < NUM_COLS; col++) {
        System.out.print(board[row][col]);
        if (col < NUM_COLS - 1) {
          System.out.print("|");
        }
      }
      System.out.println();
      if (row < NUM_ROWS - 1) {
        System.out.println("-----");
      }
    }
  }

  @Override
  public void clearBoard() {
    populateBoard();
  }

  @Override
  public void placeMarker(int rowIndex, int colIndex) {
    if (rowIndex >= 0 && rowIndex < NUM_ROWS && colIndex >= 0 && colIndex < NUM_COLS) {
      if (board[rowIndex][colIndex] == EMPTY_CELL) {
        board[rowIndex][colIndex] = currentPlayer;
      } else {
        System.out.println("Cell is already occupied!");
      }
    } else {
      System.out.println("Invalid cell position!");
    }
  }

  @Override
  public boolean isWinner() {
    // Check rows and columns
    for (int i = 0; i < NUM_ROWS; i++) {
      if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
          (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
        return true;
      }
    }
    // Check diagonals
    if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
        (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
      return true;
    }
    return false;
  }

  @Override
  public boolean isDraw() {
    for (int row = 0; row < NUM_ROWS; row++) {
      for (int col = 0; col < NUM_COLS; col++) {
        if (board[row][col] == EMPTY_CELL) {
          return false;
        }
      }
    }
    return !isWinner();
  }

  @Override
  public boolean isEmpty() {
    for (int row = 0; row < NUM_ROWS; row++) {
      for (int col = 0; col < NUM_COLS; col++) {
        if (board[row][col] != EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public boolean isFull() {
    for (int row = 0; row < NUM_ROWS; row++) {
      for (int col = 0; col < NUM_COLS; col++) {
        if (board[row][col] == EMPTY_CELL) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public void changeTurn() {
    currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
  }

}
