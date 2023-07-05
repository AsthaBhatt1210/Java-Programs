//Display name using Jswing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Jname implements ActionListener
{
   JFrame f = new JFrame();
   JTextField t1 = new JTextField(10);
   JButton b1 = new JButton("Submit");
   public Jname()
   {
	  t1.setBounds(130,200,100,40);
      b1.setBounds(100,100,200,40);
      f.add(t1);
	  f.add(b1);
      b1.addActionListener(this);
      f.setSize(400,500);
      f.setLayout(null);
      f.setVisible(true);
    }
    public void actionPerformed(ActionEvent o)
    {
       t1.setText("Astha");
    }
    public static void main(String args[])
    {
      Jname o = new Jname();
    }
}