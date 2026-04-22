package pack10;

import javax.swing.*;
import java.awt.event.*;

public class Assignment10Q5 implements ActionListener {
    JFrame frame;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JTextArea ta1;
    JRadioButton rb1, rb2;
    JButton btn1;
    ButtonGroup bg1;

    Assignment10Q5() {
        frame = new JFrame("Student Form");
        frame.setSize(450, 550);
        frame.setLocation(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        l1 = new JLabel("Name");
        l1.setBounds(30, 30, 100, 20);
        frame.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(150, 30, 200, 30);
        frame.add(tf1);

        l2 = new JLabel("Roll No");
        l2.setBounds(30, 80, 100, 20);
        frame.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(150, 80, 200, 30);
        frame.add(tf2);

        l3 = new JLabel("Mobile");
        l3.setBounds(30, 130, 100, 20);
        frame.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(150, 130, 200, 30);
        frame.add(tf3);

        l4 = new JLabel("Email");
        l4.setBounds(30, 180, 100, 20);
        frame.add(l4);

        tf4 = new JTextField();
        tf4.setBounds(150, 180, 200, 30);
        frame.add(tf4);

        l5 = new JLabel("CGPA");
        l5.setBounds(30, 230, 100, 20);
        frame.add(l5);

        tf5 = new JTextField();
        tf5.setBounds(150, 230, 200, 30);
        frame.add(tf5);

        l6 = new JLabel("Gender");
        l6.setBounds(30, 280, 100, 20);
        frame.add(l6);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(150, 280, 80, 20);
        frame.add(rb1);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(240, 280, 100, 20);
        frame.add(rb2);

        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        l7 = new JLabel("Address");
        l7.setBounds(30, 320, 100, 20);
        frame.add(l7);

        ta1 = new JTextArea();
        ta1.setBounds(150, 320, 200, 80);
        frame.add(ta1);

        btn1 = new JButton("Add");
        btn1.setBounds(150, 420, 100, 30);
        btn1.addActionListener(this);
        frame.add(btn1);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {
            String name = tf1.getText();
            String roll = tf2.getText();
            String mobile = tf3.getText();
            String email = tf4.getText();
            String cgpa = tf5.getText();
            String gender = "";
            String address = ta1.getText();

            if (rb1.isSelected()) {
                gender = "Male";
            } else if (rb2.isSelected()) {
                gender = "Female";
            }

            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("Mobile: " + mobile);
            System.out.println("Email: " + email);
            System.out.println("CGPA: " + cgpa);
            System.out.println("Gender: " + gender);
            System.out.println("Address: " + address);

            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            tf4.setText("");
            tf5.setText("");
            ta1.setText("");
            bg1.clearSelection();
        }
    }

    public static void main(String[] args) {
        new Assignment10Q5();
    }
}