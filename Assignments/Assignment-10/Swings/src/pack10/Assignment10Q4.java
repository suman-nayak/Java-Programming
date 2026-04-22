package pack10;

import javax.swing.*;
import java.awt.event.*;

public class Assignment10Q4 implements ActionListener {
    JFrame frame;
    JLabel l1;
    JTextField tf1;
    JButton btn1, btn2, btn3;
    int count = 0;

    Assignment10Q4() {
        frame = new JFrame("Counter Application");
        frame.setSize(400, 300);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Counter Application");
        l1.setBounds(50, 40, 200, 20);
        frame.add(l1);

        tf1 = new JTextField("0");
        tf1.setBounds(50, 70, 200, 30);
        tf1.setEditable(false);
        frame.add(tf1);

        btn1 = new JButton("Increment");
        btn1.setBounds(50, 120, 100, 30);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2 = new JButton("Decrement");
        btn2.setBounds(160, 120, 100, 30);
        btn2.addActionListener(this);
        frame.add(btn2);

        btn3 = new JButton("Reset");
        btn3.setBounds(270, 120, 80, 30);
        btn3.addActionListener(this);
        frame.add(btn3);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            count++;
        } else if (ae.getSource() == btn2) {
            count--;
        } else if (ae.getSource() == btn3) {
            count = 0;
        }

        tf1.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        new Assignment10Q4();
    }
}