import java.applet.*;
import java.awt.*;
/*<applet code="Circle.class" height=500 width=500></applet>*/
public class Circle extends Applet
{
 public void paint(Graphics g)
 {
  for(int i=0;i<10;i++)
  {
    g.setColor(Color.RED);
	g.fillOval(100,50*i,50,50);
  }
 }
}