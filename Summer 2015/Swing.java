import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Swing implements ActionListener
{
	JFrame f = new JFrame("Demo");
	JButton b1 = new JButton("Hello");
	JTextField t1 = new JTextField(10);
    void Swing()
     {
		 b1.setBounds(100,100,200,40);
         t1.setBounds(100,200,100,40);
         f.add(b1);
         f.add(t1);
         b1.addActionListener(this);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
     }
 public void actionPerformed(ActionEvent o)
 {
   t1.setText("Hello");
 }
 public static void main(String args[])
 {
	 Swing ob = new Swing();
 }
}