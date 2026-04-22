package pack10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment10Q2 implements ActionListener {
    JFrame frame;
    JLabel l1, l2;
    JTextField tf1;
    JButton btn1;

    Assignment10Q2() {
        frame = new JFrame("Welcome");
        frame.setSize(400, 300);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Enter your name");
        l1.setBounds(50, 40, 200, 20);
        frame.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(50, 70, 200, 30);
        frame.add(tf1);

        btn1 = new JButton("Click");
        btn1.setBounds(50, 120, 100, 30);
        btn1.addActionListener(this);
        frame.add(btn1);

        l2 = new JLabel("Message");
        l2.setBounds(50, 170, 300, 20);
        frame.add(l2);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            String name = tf1.getText();

            if (!name.equals("")) {
                l2.setText("Welcome " + name);
                l2.setForeground(Color.green);
            } else {
                l2.setText("Please enter your name");
                l2.setForeground(Color.red);
            }

            tf1.setText("");
        }
    }

    public static void main(String[] args) {
        new Assignment10Q2();
    }
}