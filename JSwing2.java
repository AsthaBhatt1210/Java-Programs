import javax.swing.*;
public class JSwing2
{
 public JSwing2()
 {
	 JFrame f = new JFrame();
	 ImageIcon i = new ImageIcon("img.png");
	 JButton b = new JButton("Click",i);
	 b.setBounds(100,100,200,40);
	 
	 JTextField tf1 = new JTextField();
	 tf1.setBounds(130,200,100,40);
	 
	 JCheckBox c1 = new JCheckBox("Red");
	 JCheckBox c2 = new JCheckBox("Green");
	 c1.setBounds(250,200,100,40);
	 c2.setBounds(360,200,100,40);
	 
	 f.add(b);
	 f.add(tf1);
	 f.add(c1);
	 f.add(c2);
	 f.setSize(400,500);
	 f.setLayout(null);
	 f.setVisible(true);
 }
 public static void main(String args[])
 {
	 JSwing2 o = new JSwing2();
 }
}