package pack11;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Assignment11Q6 implements ActionListener {

    JFrame frame;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JTextField tf1, tf2, tf3, tf4, tf5;
    JTextArea ta1;
    JRadioButton rb1, rb2;
    JButton btn1;
    ButtonGroup bg;

    Assignment11Q6() {
        frame = new JFrame("Student Form");
        frame.setSize(450, 550);
        frame.setLocation(400, 100);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Roll");
        l1.setBounds(30, 30, 100, 20);
        frame.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(150, 30, 200, 30);
        frame.add(tf1);

        l2 = new JLabel("Name");
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

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            try {
                int roll = Integer.parseInt(tf1.getText());
                String name = tf2.getText();
                long mobile = Long.parseLong(tf3.getText());
                String email = tf4.getText();
                String address = ta1.getText();
                double cgpa = Double.parseDouble(tf5.getText());

                String gender = "";
                if (rb1.isSelected()) gender = "Male";
                else if (rb2.isSelected()) gender = "Female";

                String url = "jdbc:postgresql://192.168.1.17/mca_25_db";
                String user = "25mmca01";
                String pass = "25mmca01";

                Class.forName("org.postgresql.Driver");
                Connection con = DriverManager.getConnection(url, user, pass);

                String qry = "INSERT INTO student VALUES(" + roll + ",'" + name + "'," + mobile + ",'" + email + "','" + address + "','" + gender + "'," + cgpa + ")";

                Statement smt = con.createStatement();
                int i = smt.executeUpdate(qry);

                if (i == 1) {
                    JOptionPane.showMessageDialog(frame, "Data Inserted");
                }

                con.close();

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Assignment11Q6();
    }
}