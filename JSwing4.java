import javax.swing.*;
import java.awt.*;
public class JSwing4
{
  public JSwing4()
  {
	  JFrame f = new JFrame();
	  
	  Font fancyfont = new Font("serif",Font.BOLD | Font.ITALIC,28);
	  ImageIcon i = new ImageIcon("img.png");
	  JLabel l = new JLabel("Astha Bhatt");
	  l.setFont(fancyfont);
	  l.setIcon(i);
	  l.setBounds(10,50,500,100);
	  
	  f.add(l);
	  f.setSize(400,500);
	  f.setLayout(null);
	  f.setVisible(true);
  }
  public static void main(String args[])
  {
	  JSwing4 o = new JSwing4();
  }
}