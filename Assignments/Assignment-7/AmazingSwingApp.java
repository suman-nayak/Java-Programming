import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.AdjustmentEvent;

public class AmazingSwingApp extends JFrame {

    // Components that need to be accessed by listeners
    private JPanel colorDisplayPanel;
    private JLabel hexLabel;
    private JScrollBar redScroll, greenScroll, blueScroll;

    public AmazingSwingApp() {
        // 1. Frame Setup
        setTitle("Amazing Swing Color Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 400);
        setLocationRelativeTo(null); // Center on screen
        setLayout(new BorderLayout(10, 10));

        // 2. Initialize Components
        colorDisplayPanel = new JPanel();
        colorDisplayPanel.setBorder(new TitledBorder("Color Preview"));
        colorDisplayPanel.setBackground(Color.BLACK);

        hexLabel = new JLabel("#000000", SwingConstants.CENTER);
        hexLabel.setFont(new Font("Monospaced", Font.BOLD, 24));
        
        // Setup Sliders
        redScroll = createScrollBar(Color.RED);
        greenScroll = createScrollBar(Color.GREEN);
        blueScroll = createScrollBar(Color.BLUE);

        // 3. Layout Layouts
        JPanel controlPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        controlPanel.setBorder(new TitledBorder("RGB Controls"));
        controlPanel.add(new JLabel("Red:"));
        controlPanel.add(redScroll);
        controlPanel.add(new JLabel("Green:"));
        controlPanel.add(greenScroll);
        controlPanel.add(new JLabel("Blue:"));
        controlPanel.add(blueScroll);

        // 4. Add Components to Frame
        add(colorDisplayPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.WEST);
        add(hexLabel, BorderLayout.SOUTH);

        // 5. Add Listeners
        updateColor();
    }

    // Helper to create styled scrollbars
    private JScrollBar createScrollBar(Color color) {
        JScrollBar sb = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 265);
        sb.setForeground(color);
        sb.addAdjustmentListener(e -> updateColor());
        return sb;
    }

    // Main logic: Update color based on slider values
    private void updateColor() {
        int r = redScroll.getValue();
        int g = greenScroll.getValue();
        int b = blueScroll.getValue();

        Color newColor = new Color(r, g, b);
        colorDisplayPanel.setBackground(newColor);
        
        // Update Label
        String hex = String.format("#%02X%02X%02X", r, g, b);
        hexLabel.setText(hex);
        hexLabel.setForeground(newColor);
    }

    public static void main(String[] args) {
        // Run GUI codes on the Event-Dispatching Thread for thread-safety
        SwingUtilities.invokeLater(() -> {
            new AmazingSwingApp().setVisible(true);
        });
    }
}
