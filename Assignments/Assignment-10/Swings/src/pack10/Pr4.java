package pack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Pr4 implements ActionListener{
	JFrame f;
	JLabel l1,l2;
	JTextField tf1;
	JComboBox<String> cb;
	JButton b1;

	Pr4(){
		f = new JFrame("calculator");
		f.setSize(300,400);
		f.setLocation(300,400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		l1 = new JLabel("Enter money");
		l1.setBounds(20,20,100,20);
		f.add(l1);
		
		tf1 = new JTextField();
		tf1.setBounds(20,50,200,30);
		f.add(tf1);
		
		String op[] = {"usa","china"};
		cb = new JComboBox<>(op);
		cb.setBounds(20,100,100,30);
		f.add(cb);
		
		b1 = new JButton("Result");
		b1.setBounds(20,150,100,30);
		b1.addActionListener(this);
		f.add(b1);
		
		l2 = new JLabel();
		l2.setBounds(20,200,100,30);
		f.add(l2);
		
		f.setVisible(true);
		
	}
	 public void actionPerformed(ActionEvent ae) {
	        try {
	            double n = Double.parseDouble(tf1.getText());
	            String op = (String) cb.getSelectedItem();

	            if (ae.getSource() == b1) {
	                switch (op) {
	                    case "usa":
	                        double usd = n * 0.012; // example rate
	                        l2.setText("USD: " + usd);
	                        break;

	                    case "china":
	                        double yuan = n * 0.087; // example rate
	                        l2.setText("Yuan: " + yuan);
	                        break;
	                }
	                l2.setForeground(Color.BLUE);
	            }

	        } catch (NumberFormatException e) {
	            l2.setText("Enter valid number!");
	            l2.setForeground(Color.RED);
	        }
	    }
	
	public static void main(String[] args) {
		new Pr4();

	}

}
