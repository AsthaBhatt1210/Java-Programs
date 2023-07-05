import java.applet.Applet;
import java.awt.*;
/*<applet code="Appletallcommands.class" height="500" width="700">
</applet>*/
public class Appletallcommands extends Applet
{
   public void paint(Graphics g)
   {
	  g.setColor(Color.blue);
      g.drawString("WELCOME",50,50);
	  g.drawLine(10,10,50,50);
	  g.setColor(Color.red);
	  g.drawOval(100,100,200,200);
	  g.fillOval(400,200,200,200);
	  g.setColor(Color.green);
	  g.drawRect(10,10,50,100);
	  g.drawRect(200,10,250,10);
	 
	}
}
