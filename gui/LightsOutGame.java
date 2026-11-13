import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

class LightsOutGame extends JFrame {

  // 5x5 grid size
  private static final int SIZE = 5;

  // Two-dimensional array of buttons representing the game board
  private JButton[][] board = new JButton[SIZE][SIZE];

  // Colors for ON (lit) and OFF (unlit) states of the lights
  private final Color LIGHT_ON = new Color(255, 223, 70); // Bright yellow color for light on
  private final Color LIGHT_OFF = new Color(45, 52, 54); // Dark gray color for light off

  private int moveCount = 0;
  private JLabel moveLabel;

  public LightsOutGame() {
    setTitle("Lights Out Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(450, 520);
    setLayout(new BorderLayout());

    // Top Panel: Move Counter & Reset Button
    JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
    moveLabel = new JLabel("Moves: 0");
    moveLabel.setFont(new Font("Arial", Font.BOLD, 16));

    JButton newGameBtn = new JButton("New Game");
    newGameBtn.addActionListener(e -> resetBoard());

    topPanel.add(moveLabel);
    topPanel.add(newGameBtn);
    add(topPanel, BorderLayout.NORTH);

    // Center Panel: Game Board
    JPanel gridPanel = new JPanel(new GridLayout(SIZE, SIZE, 5, 5));
    gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    gridPanel.setBackground(Color.BLACK);

    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        JButton button = new JButton();
        button.setBackground(LIGHT_OFF);
        button.setOpaque(true);
        button.setBorderPainted(false);
        button.setFocusPainted(false);

        final int r = row;
        final int c = col;
        button.addActionListener(e -> handleButtonClick(r, c));

        board[row][col] = button;
        gridPanel.add(button);
      }
    }

    add(gridPanel, BorderLayout.CENTER);

    // Start with a randomize, solvable puzzle
    resetBoard();
    setLocationRelativeTo(null);
    setVisible(true);
  } 

  public void resetBoard() {

    // Turn off all lights
    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        board[row][col].setBackground(LIGHT_OFF);
      }
    }

    // Simulate 10 random moves to create a solvable puzzle
    Random rand = new Random();
    for (int i = 0; i < 10; i++) { 
      int row = rand.nextInt(SIZE);
      int col = rand.nextInt(SIZE);
      toggleWithNeighbors(row, col);
    }

    moveCount = 0;
    moveLabel.setText("Moves: 0");
  }

  public void handleButtonClick(int row, int col) {
    toggleWithNeighbors(row, col);
    moveCount++;
    moveLabel.setText("Moves: " + moveCount);

    if (checkWin()) {
      JOptionPane.showMessageDialog(
        this,
        "Congratulations! You've turned off all the lights in " + moveCount + " moves!",
        "You Win!",
        JOptionPane.INFORMATION_MESSAGE
      );
      resetBoard();
    }
  }

  public void toggleWithNeighbors(int row, int col) {
    toggleSingleCell(row, col); // Center
    toggleSingleCell(row - 1, col); // Up
    toggleSingleCell(row + 1, col); // Down
    toggleSingleCell(row, col - 1); // Left
    toggleSingleCell(row, col + 1); // Right
  }

  public void toggleSingleCell(int row, int col) {
    // safely toggle the cell if it's within bounds
    // to avoid ArrayIndexOutOfBoundsException
    if (row >= 0 && row < SIZE && col >= 0 && col < SIZE) {
      if (board[row][col].getBackground().equals(LIGHT_ON)) {
        board[row][col].setBackground(LIGHT_OFF);
      } else {
        board[row][col].setBackground(LIGHT_ON);
      }
    }
  }

  public boolean checkWin() {
    for (int row = 0; row < SIZE; row++) {
      for (int col = 0; col < SIZE; col++) {
        if (board[row][col].getBackground().equals(LIGHT_ON)) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // Use SwingUtilities.invokeLater to ensure that the GUI is created on the Event Dispatch Thread
    SwingUtilities.invokeLater(() -> new LightsOutGame());
  }
}

