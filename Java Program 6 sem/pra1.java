/* Develop an applet that draws a circle. The dimension of the applet should be 500 x 300 
pixels. The circle should be centered in the applet and have a radius of 100 pixels. Display 
your name centered in a circle. (Using drawOval() method) */

import java.applet.Applet;
import java.awt.*;
public class pra1 extends Applet
{
  public void paint(Graphics g)
  {
    g.drawOval(200,100,100,100);
	g.drawString("Astha",238,150);
  }
}

/*
<applet code="pra1.class" width="500" height="300">
</applet>
*/