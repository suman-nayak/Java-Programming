package pack10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment10Q3 implements ActionListener {
    JFrame frame;
    JLabel l1, l2, l3;
    JTextField tf1, tf2;
    JButton btn1, btn2, btn3, btn4;

    Assignment10Q3() {
        frame = new JFrame("Simple Calculator");
        frame.setSize(450, 350);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Enter First Number");
        l1.setBounds(50, 30, 200, 20);
        frame.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(50, 60, 250, 30);
        frame.add(tf1);

        l2 = new JLabel("Enter Second Number");
        l2.setBounds(50, 110, 200, 20);
        frame.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(50, 140, 250, 30);
        frame.add(tf2);

        btn1 = new JButton("+");
        btn1.setBounds(50, 190, 50, 30);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2 = new JButton("-");
        btn2.setBounds(110, 190, 50, 30);
        btn2.addActionListener(this);
        frame.add(btn2);

        btn3 = new JButton("*");
        btn3.setBounds(170, 190, 50, 30);
        btn3.addActionListener(this);
        frame.add(btn3);

        btn4 = new JButton("/");
        btn4.setBounds(230, 190, 50, 30);
        btn4.addActionListener(this);
        frame.add(btn4);

        l3 = new JLabel("Result");
        l3.setBounds(50, 240, 300, 20);
        frame.add(l3);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            int n1 = Integer.parseInt(tf1.getText());
            int n2 = Integer.parseInt(tf2.getText());
            int result = 0;

            if (ae.getSource() == btn1) {
                result = n1 + n2;
            } else if (ae.getSource() == btn2) {
                result = n1 - n2;
            } else if (ae.getSource() == btn3) {
                result = n1 * n2;
            } else if (ae.getSource() == btn4) {
                result = n1 / n2;
            }

            l3.setText("Result = " + result);
            l3.setForeground(Color.black);
        } catch (Exception e) {
            l3.setText("Please enter valid numbers");
            l3.setForeground(Color.red);
        }

        tf1.setText("");
        tf2.setText("");
    }

    public static void main(String[] args) {
        new Assignment10Q3();
    }
}