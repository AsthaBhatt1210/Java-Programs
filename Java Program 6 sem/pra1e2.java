//Draw a rectangle inside an oval in top left corner of the applet.

import java.applet.Applet;
import java.awt.*;
public class pra1e2 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawOval(0,0,170,120); 
  g.drawRect(33,25,100,70);
 }
}

/*
<applet code="pra1e2.class" width="300" height="300">
</applet>
*/