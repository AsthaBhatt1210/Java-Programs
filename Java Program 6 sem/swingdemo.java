import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
class swingdemo implements ActionListener
{
   JFrame f;
   JButton b;
   JTextField tf;
   Container c;
   FlowLayout fl;
   public static void main(String args[])
   {
   
       f = new JFrame();
	   f.setSize(700,500);
	   f.setVisible(true);
	   
	   b = new JButton("Hello");
	   b.setSize(100,100);
	   b.setVisible(true);
	   //MyListener m1 = new MyListener();
	   b.addActionListener(this);
	   
	   tf = new JTextField("Hi",10);
	   tf.setSize(300,400);
	   tf.setVisible(true);
	   
	   //f.add(b);
	   // f.getContentPane().setLayout();
	   // f.getContentPane().add(b);
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   c = f.getContentPane();
	   fl = new FlowLayout();
	   c.setLayout(fl);
	   c.add(b);
	   c.add(tf);
	   
	   public void ActionPerformed(ActionEvent e)
	   {
	      System.out.println(e.getActionCommand() +"Button is clicked");
	   }
   }
 }
 /*class MyListener implements ActionListener
 {
	 
 }*/
 /*4.08 student class read information from file using GUI and which ever name of student name,roll, div ,"take info from student file and it will display in GUI components" or calculator  */
