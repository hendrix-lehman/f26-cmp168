import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Component;


class LayoutManagerDemo extends JFrame {

  public LayoutManagerDemo() {
    setTitle("Layout Manager Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(650, 450);

    // add your components and layout manager here

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.setFont(new Font("SansSerif", Font.BOLD, 14));

    tabbedPane.addTab("1. BorderLayout", createBorderLayoutDemo());
    tabbedPane.addTab("2. FlowLayout", createFlowLayoutDemo());
    tabbedPane.addTab("3. GridLayout", createGridLayoutDemo());
    tabbedPane.addTab("4. BoxLayout", createBoxLayoutDemo());

    add(tabbedPane);

    setLocationRelativeTo(null);
    setVisible(true);
  }

  private JPanel createBorderLayoutDemo() {
    JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
    mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

    JButton northBtn = new JButton("NORTH (Header - stretches horizontally)");
    JButton southBtn = new JButton("SOUTH (Footer - stretches horizontally)");
    JButton eastBtn = new JButton("EAST (Sidebar - stretches vertically)");
    JButton westBtn = new JButton("WEST (Sidebar - stretches vertically)");
    JButton centerBtn = new JButton("CENTER (Main Content - stretches both ways)");

    northBtn.setBackground(new Color(220, 235, 252));
    southBtn.setBackground(new Color(220, 235, 252));
    eastBtn.setBackground(new Color(252, 235, 220));
    westBtn.setBackground(new Color(252, 235, 220));
    centerBtn.setBackground(new Color(225, 248, 220));

    mainPanel.add(northBtn, BorderLayout.NORTH);
    mainPanel.add(southBtn, BorderLayout.SOUTH);
    mainPanel.add(eastBtn, BorderLayout.EAST);
    mainPanel.add(westBtn, BorderLayout.WEST);
    mainPanel.add(centerBtn, BorderLayout.CENTER);

    return wrapWithHeader(mainPanel, "BorderLayout: Places components in 5 compass regions. Center gets priority for extra space.");
  }

  private JPanel createFlowLayoutDemo() {
    JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
    mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

    mainPanel.add(new JButton("Button 1"));
    mainPanel.add(new JButton("Wide Button 2"));
    mainPanel.add(new JButton("Btn 3"));
    mainPanel.add(new JButton("Extra Wide Button Number 4"));
    mainPanel.add(new JButton("Button 5"));
    mainPanel.add(new JButton("Button 6"));
    mainPanel.add(new JButton("Button 7 (Drag window width to watch me wrap!)"));

    return wrapWithHeader(mainPanel, "FlowLayout: Arranges components in a row at their preferred size, wrapping to new lines as needed.");
  }

  private JPanel createGridLayoutDemo() {
    JPanel mainPanel = new JPanel(new GridLayout(3, 3, 10, 10));
    mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));

    for (int i = 1; i <= 9; i++) {
      JButton btn = new JButton("Cell " + i);
      btn.setFont(new Font("SansSerif", Font.PLAIN, 16));
      mainPanel.add(btn);
    }

    return wrapWithHeader(mainPanel, "GridLayout (3x3): Ignores preferred sizes and forces all cells into equal-sized rectangles.");
  }

  private JPanel createBoxLayoutDemo() {
    JPanel mainPanel = new JPanel();

    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setBorder(new EmptyBorder(20, 40, 20, 20));

    JButton btn1 = new JButton("Left Aligned Component");
    btn1.setAlignmentX(Component.LEFT_ALIGNMENT);

    JButton btn2 = new JButton("Center Aligned Component");
    btn2.setAlignmentX(Component.CENTER_ALIGNMENT);

    JButton btn3 = new JButton("Right Aligned Component");
    btn3.setAlignmentX(Component.RIGHT_ALIGNMENT);

    JButton btn4 = new JButton("Center Aligned + Rigid Area Spacer Above");
    btn4.setAlignmentX(Component.CENTER_ALIGNMENT);

    mainPanel.add(btn1);
    mainPanel.add(Box.createVerticalStrut(15)); // Fixed 15px vertical space
    mainPanel.add(btn2);
    mainPanel.add(Box.createVerticalStrut(15)); // Fixed 15px vertical space
    mainPanel.add(btn3);
    mainPanel.add(Box.createVerticalStrut(30)); // Larger 30px vertical space
    mainPanel.add(btn4);

    return wrapWithHeader(mainPanel, "BoxLayout (Y_AXIS): Stacks components vertically in a single column without wrapping.");
  }

  private JPanel wrapWithHeader(JPanel demoContent, String description) {
    JPanel wrapper = new JPanel(new BorderLayout());
  
    JLabel infoLabel = new JLabel(description, SwingConstants.CENTER);
    infoLabel.setFont(new Font("SansSerif", Font.ITALIC, 13));
    infoLabel.setOpaque(true);
    infoLabel.setBackground(new Color(240, 240, 240));
    infoLabel.setBorder(BorderFactory.createCompoundBorder(
           BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY),
           new EmptyBorder(10, 10, 10, 10)
    ));

    wrapper.add(infoLabel, BorderLayout.NORTH);
    wrapper.add(demoContent, BorderLayout.CENTER);
    return wrapper;
  }

  public static void main(String[] args) {

    SwingUtilities.invokeLater(() -> new LayoutManagerDemo());
    
  }
}

