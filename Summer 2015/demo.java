import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="demo" width=500 height=500></applet>*/
public class demo extends Applet implements ActionListener
{
   TextField tf1;
   TextField tf2;
   TextField tf3;
   Button b1;
   int a,b,c;
   static double ans;
   public void paint(Graphics g)
   {
	   g.drawString("Average"+ans,10,10);
   }
   public void init()
   {
	   tf1=new TextField(10);
	   tf2=new TextField(10);
	   tf3=new TextField(10);
	   b1=new Button("Average");
	   b1.addActionListener(this);
	   add(tf1);
	   add(tf2);
	   add(tf3);
	   add(b1);
   }
   public void actionPerformed(ActionEvent ae)
   {
	    a=Integer.parseInt(tf1.getText());
	    b=Integer.parseInt(tf2.getText());
	    c=Integer.parseInt(tf3.getText());
	    ans=(a+b+c)/3.0;
	    repaint();
   }
}