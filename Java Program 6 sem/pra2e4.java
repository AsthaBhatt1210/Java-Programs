// Draw the following applet
import java.applet.Applet;
import java.awt.*;
public class pra2e4 extends Applet
{
   public void paint(Graphics g)
   {
	   g.drawString("Applet Lifecycle",240,90);
	   g.setColor(Color.pink);
	   g.fillOval(230,110,100,100);
	   g.drawString("1",320,120);
	   g.setColor(Color.white);
	   g.drawString("Applet is",250,150);
	   g.drawString("initialized",250,170);
	   
	   g.setColor(Color.red);
	   g.fillOval(140,190,100,100);
	   g.drawString("5",150,190);
	   g.setColor(Color.white);
	   g.drawString("Applet is",160,230);
	   g.drawString("destroyed",160,250);
	   
	   g.setColor(Color.blue);
	   g.fillOval(320,190,100,100);
	   g.drawString("2",430,240);
	   g.setColor(Color.white);
	   g.drawString("Applet is",340,230);
	   g.drawString("started",340,250);
	   
	   g.setColor(Color.orange);
	   g.fillOval(170,300,100,100);
	   g.drawString("4",160,320);
	   g.setColor(Color.white);
	   g.drawString("Applet is",190,340);
	   g.drawString("stopped",190,360);
	   
	   g.setColor(Color.cyan);
	   g.fillOval(290,300,100,100);
	   g.drawString("3",280,390);
	   g.setColor(Color.white);
	   g.drawString("Applet is",310,340);
	   g.drawString("painted",310,360);
	   
	}
}
/*
<applet code="pra2e4.class" width="600" height="500">
</applet>
*/