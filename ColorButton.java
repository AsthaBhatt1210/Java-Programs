import java.awt.*;
import java.awt.event.*;
public class ColorButton implements ActionListener
{
  Frame f;
  Button b;
  public ColorButton()
    {
	  f = new Frame("ColorButton_Demo");
	  b = new Button("Click");
	  b.setBackground(Color.RED);
	  f.setBackground(Color.RED);
	  b.addActionListener(this);
	  f.setLayout(new FlowLayout());
	  f.add(b);
	  f.setSize(300,300);
	  f.setVisible(true);
  }
  public void actionPerformed(ActionEvent o)
  {
      if(f.getBackground() == Color.BLUE)
	  {
		  b.setBackground(Color.RED);
		  f.setBackground(Color.RED);
	  }
	  else if(f.getBackground() == Color.RED)
	  {
		  b.setBackground(Color.GREEN);
		  f.setBackground(Color.GREEN);
	  }
	  else if(f.getBackground() == Color.GREEN)
	  {
		 b.setBackground(Color.BLUE);
         f.setBackground(Color.BLUE);		 
	  }
  }
  public static void main(String args[])
  {
	  ColorButton o = new ColorButton();
  }
}