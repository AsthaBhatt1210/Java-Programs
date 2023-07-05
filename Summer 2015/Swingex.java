import javax.swing.*;
import java.applet.*;
public class Swingex extends Applet
{
  JFrame f = new JFrame("TextField component ex");
  JTextField t = new JTextField("Astha");
  
  public Swingex()
  {
    f.add(t);
	t.setBounds(100,200,100,40);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
  }
  public static void main(String args[])
  {
    Swingex o = new Swingex();
  }  
}