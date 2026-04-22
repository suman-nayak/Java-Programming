import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class FractalTree extends JPanel {

    // The angle between branches, which will change based on mouse movement
    private double branchAngle = Math.PI / 6; // Default to 30 degrees
    // The ratio by which each subsequent branch shrinks
    private final double lengthReduction = 0.75; 

    public FractalTree() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(new Color(20, 20, 25)); // Deep midnight blue/black

        // Listen for mouse movements to make the tree interactive
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                // Map the mouse's X position to an angle between 0 and 90 degrees (PI/2)
                branchAngle = ((double) e.getX() / getWidth()) * (Math.PI / 2);
                
                // Repaint the screen every time the mouse moves
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        // Turn on anti-aliasing for smooth lines
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Start drawing the tree from the bottom center of the screen
        int startX = getWidth() / 2;
        int startY = getHeight() - 50;
        int initialLength = 140;

        // The trunk points straight up (which is -90 degrees, or -PI/2 in Java graphics)
        drawBranch(g2d, startX, startY, -Math.PI / 2, initialLength, 10);
    }

    /**
     * The recursive method that draws the tree.
     */
    private void drawBranch(Graphics2D g2d, int x, int y, double currentAngle, double length, int depth) {
        // Base case: If the depth reaches 0, stop drawing
        if (depth == 0) {
            return;
        }

        // Calculate the end point of this branch using trigonometry
        int endX = x + (int) (Math.cos(currentAngle) * length);
        int endY = y + (int) (Math.sin(currentAngle) * length);

        // Make the branches thinner and change color as they get smaller (closer to the leaves)
        g2d.setStroke(new BasicStroke(depth));
        
        if (depth < 4) {
            // Leaves are a bright cyan/green
            g2d.setColor(new Color(0, 255, 150, 200)); 
        } else {
            // Trunk and main branches are white with slight transparency
            g2d.setColor(new Color(255, 255, 255, 200)); 
        }

        // Draw the current branch
        g2d.drawLine(x, y, endX, endY);

        // Recursion: Draw the two smaller branches branching out from the end of this one
        drawBranch(g2d, endX, endY, currentAngle - branchAngle, length * lengthReduction, depth - 1); // Left branch
        drawBranch(g2d, endX, endY, currentAngle + branchAngle, length * lengthReduction, depth - 1); // Right branch
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Interactive Fractal Tree");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            frame.add(new FractalTree());
            
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setResizable(false);
            frame.setVisible(true);
        });
    }
}