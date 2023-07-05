import java.awt.Graphics; 
import java.awt.event.*; 
import java.awt.*; 
import java.applet.*;
public class pra3e2 extends Applet
{
 public void paint(Graphics g) 
 {
	g.drawOval(20,20,200,120);
	g.setColor(Color.pink);
	g.fillOval(20,20,200,120);
 }
}

/* 
<applet code="pra3e2.class" width=600 height=400> 
</applet> 
*/ 