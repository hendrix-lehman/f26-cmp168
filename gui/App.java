import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.Color;

class App {

  public static void main(String[] args) {

    // top-level container
    JFrame frame = new JFrame("My First GUI");

    // panel is a container that can hold other components
    JPanel panel = new JPanel();

    // components are the building blocks of a GUI
    // creating them here to add them to the panel container
    JButton button = new JButton("Click Me!");
    JTextField textField = new JTextField();

    // components can be customized with methods like setBackground, setForeground, setFont, etc.
    panel.setBackground(Color.YELLOW);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLUE, 8));
    textField.setText("Enter text here");

    // components are added to the panel container
    // the order in which they are added determines their layout
    // based on the layout manager of the panel (default is FlowLayout)
    panel.add(textField);
    panel.add(button);

    // we use the JPanel as the content container for the application window (JFrame)
    // the JFrame is the top-level container that holds the panel and other components
    frame.add(panel);

    // EXIT_ON_CLOSE is a constant that tells the JFrame to exit the application when the user closes the window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // set the size of the window
    // note that this is a suggestion, the underlying windowing system may choose to ignore it
    frame.setSize(400, 300);

    // make the window visible
    frame.setVisible(true);
    
  }
}

