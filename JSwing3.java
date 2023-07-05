import javax.swing.*;
public class JSwing3
{
 public JSwing3()
 {
	 JFrame f = new JFrame();
	 JButton b = new JButton("Click");
	 b.setBounds(130,100,100,40);
	 
	 JTextField tf1 = new JTextField();
	 tf1.setBounds(130,200,100,40);
	 
	 ButtonGroup g = new ButtonGroup();
	 JRadioButton r1 = new JRadioButton("Boy");
	 JRadioButton r2 = new JRadioButton("Girl");
	 r1.setBounds(250,200,100,40);
	 r2.setBounds(360,200,100,40);
	 g.add(r1);
	 g.add(r2);
	 f.add(b);
	 f.add(tf1);
	 f.add(r1);
	 f.add(r2);
	 f.setSize(400,500);
	 f.setLayout(null);
	 f.setVisible(true);
 }
 public static void main(String args[])
 {
	 JSwing3 o = new JSwing3();
 }
}