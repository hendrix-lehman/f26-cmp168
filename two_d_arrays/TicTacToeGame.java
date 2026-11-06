import java.util.Scanner;

class TicTacToeGame {

  public static void main(String[] args) {

    TicTacToe game = new TicTacToe();

    System.out.println("Welcome to Tic Tac Toe!");
    game.displayBoard();

    // prompt user for input and place markers
    Scanner scanner = new Scanner(System.in);
    while (!game.isWinner() && !game.isDraw()) {
      System.out.println("Player " + game.getCurrentPlayer() + ", enter your move (row and column): ");
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      game.placeMarker(row, col);
      game.displayBoard();
      if (!game.isWinner() && !game.isDraw()) {
        game.changeTurn();
      }
    }


  }
}
