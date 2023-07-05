import java.awt.Graphics; 
import java.awt.event.*; 
import java.awt.*; 
import java.applet.*; 
public class pr3e1 extends Applet 
{ 
 public void paint(Graphics g) 
 { 
    g.setColor(Color.RED);
	g.drawOval(145,100,150,140);
	g.setColor(Color.MAGENTA);
	g.drawOval(175,100,90,140);
	g.setColor(Color.YELLOW);
	g.drawOval(205,100,30,140);
 }
}
/* 
<applet code="pr3e1.class" width=600 height=400> 
</applet> 
*/