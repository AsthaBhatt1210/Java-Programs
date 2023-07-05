//Draw five red circles and five blue circles alternatively horizontally in the centre of the applet. 

import java.applet.Applet;
import java.awt.*;
public class pra2e2 extends Applet
{
    public void paint(Graphics g)
   {      
         g.setColor(Color.red);
		 g.fillOval(50,175,20,20);
		 g.fillOval(110,175,20,20);
		 g.fillOval(170,175,20,20);
		 g.fillOval(230,175,20,20);
		 g.fillOval(290,175,20,20);
		 
		  g.setColor(Color.blue);
		 g.fillOval(80,175,20,20);
		 g.fillOval(140,175,20,20);
		 g.fillOval(200,175,20,20);
		 g.fillOval(260,175,20,20);
		 g.fillOval(320,175,20,20);
   }
}
/* 
<applet code="pra2e2" width="400" height="500">
</applet> */