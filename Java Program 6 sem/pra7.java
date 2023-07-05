/*Develop a program that has only one button in the frame, clicking on the button cycles through the colors: red->green->blue and so on. One color changes per click.(use getBackGround() method to get the current color)*/

import java.awt.*;
import java.awt.event.*;
public class pra7 implements ActionListener
{
  Frame f;
  Button b;
  public pra7()
    {
	  f = new Frame("pra7");
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
	  pra7 o = new pra7();
  }
}