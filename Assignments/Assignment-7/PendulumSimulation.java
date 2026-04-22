import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PendulumSimulation extends JPanel implements ActionListener {
    
    // Physics variables
    private double angle = Math.PI / 4; // Start at a 45-degree angle
    private double angularVelocity = 0.0;
    private double angularAcceleration = 0.0;

    // Pendulum physical properties
    private final int originX = 300;
    private final int originY = 50;
    private final int length = 250;     // Length of the string
    private final double gravity = 1.5; // Gravity constant adjusted for visual speed

    private Timer timer;

    public PendulumSimulation() {
        // Set up the panel
        setPreferredSize(new Dimension(600, 400));
        setBackground(new Color(30, 30, 30)); // Dark sleek background
        
        // The Timer triggers the actionPerformed method every 16ms (~60 FPS)
        timer = new Timer(16, this); 
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Use Graphics2D for smoother, anti-aliased drawing
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Calculate the X and Y coordinates of the pendulum bob using trigonometry
        int bobX = originX + (int) (Math.sin(angle) * length);
        int bobY = originY + (int) (Math.cos(angle) * length);

        // 1. Draw the string
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(3)); // Thicker string
        g2d.drawLine(originX, originY, bobX, bobY);

        // 2. Draw the anchor point (top)
        g2d.setColor(Color.RED);
        g2d.fillOval(originX - 6, originY - 6, 12, 12);

        // 3. Draw the swinging bob (bottom)
        g2d.setColor(new Color(0, 200, 255)); // Cyan color
        g2d.fillOval(bobX - 25, bobY - 25, 50, 50);
        
        // Add a little highlight to the bob for a 3D effect
        g2d.setColor(new Color(255, 255, 255, 100));
        g2d.fillOval(bobX - 15, bobY - 15, 15, 15);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // The physics engine: calculating the pendulum's motion
        angularAcceleration = (-gravity / length) * Math.sin(angle);
        angularVelocity += angularAcceleration;
        
        // Apply a tiny bit of air resistance (damping) so it eventually slows down
        angularVelocity *= 0.995; 
        
        angle += angularVelocity;

        // Tell Swing to redraw the panel with the new coordinates
        repaint();
    }

    public static void main(String[] args) {
        // Run the GUI creation on the Event Dispatch Thread (best practice)
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Amazing Java Swing Pendulum");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Add our custom simulation panel to the window
            frame.add(new PendulumSimulation());
            
            frame.pack();
            frame.setLocationRelativeTo(null); // Center the window on screen
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}