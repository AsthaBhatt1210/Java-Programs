import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JSwingAdd implements ActionListener
{
  JFrame f = new JFrame();
  JButton b = new JButton("Click");
  JTextField tf1 = new JTextField();
  JTextField tf2 = new JTextField();
  JTextField tf3 = new JTextField();
  
  public JSwingAdd()
  {
	  b.setBounds(130,300,100,40);
	  tf1.setBounds(130,200,80,40);
	  tf2.setBounds(230,200,80,40);
	  tf3.setBounds(330,200,80,40);
	  b.addActionListener(this);
	  
	  f.add(b);
	  f.add(tf1);
	  f.add(tf2);
	  f.add(tf3);
	  f.setSize(600,500);
	  f.setLayout(null);
	  f.setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
	  int n1 = Integer.parseInt(tf1.getText());
	  int n2 = Integer.parseInt(tf2.getText());
	  int n3 = n1 + n2;
	  tf3.setText(String.valueOf(n3));
  }
  public static void main(String args[])
  {
	  JSwingAdd o = new JSwingAdd();
  }
}