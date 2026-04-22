package prac;
import javax.swing.JFrame;

public class ExS1 {
    JFrame frame;

    ExS1(){
        frame = new JFrame("First Window");
        frame.setSize(500, 300);
        frame.setLocation(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new ExS1();
    }
}
