package pack10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment10Q1 implements ActionListener {
    JFrame frame;
    JLabel l1;
    JButton btn1, btn2, btn3;

    Assignment10Q1() {
        frame = new JFrame("Change Color");
        frame.setSize(400, 300);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Click on a button to change the frame color");
        l1.setBounds(50, 30, 300, 20);
        frame.add(l1);

        btn1 = new JButton("Red");
        btn1.setBounds(50, 70, 80, 30);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2 = new JButton("Green");
        btn2.setBounds(150, 70, 80, 30);
        btn2.addActionListener(this);
        frame.add(btn2);

        btn3 = new JButton("Blue");
        btn3.setBounds(250, 70, 80, 30);
        btn3.addActionListener(this);
        frame.add(btn3);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            frame.getContentPane().setBackground(Color.red);
        } else if (ae.getSource() == btn2) {
            frame.getContentPane().setBackground(Color.green);
        } else if (ae.getSource() == btn3) {
            frame.getContentPane().setBackground(Color.blue);
        }
    }

    public static void main(String[] args) {
        new Assignment10Q1();
    }
}
