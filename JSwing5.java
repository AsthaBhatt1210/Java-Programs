import javax.swing.*;
import java.awt.*;
public class JSwing5
{
 String names[] = {"Arpit","Ketaki","Astha","Sakshi"};
 
 public JSwing5()
 {
	 JFrame f = new JFrame();
	 JButton b = new JButton("Click"); //Button 
	  b.setBounds(20,20,200,40);
	  
	 JComboBox c = new JComboBox(); //Combobox
	 for(int i=0;i<4;i++)
	 {
		 c.addItem(names[i]);
	 }
	 c.setBounds(20,80,100,40);
	 
	 JList l = new JList(names); //Listbox
	 l.setSelectedIndex(2);
	 l.setBounds(140,80,100,100);
	 
	 f.add(b);
	 f.add(c);
	 f.add(l);
	 f.setSize(350,400);
	 f.setLayout(null);
	 f.setVisible(true);
 }
 public static void main(String args[])
 {
	 JSwing5 o = new JSwing5();
 }
}