//Draw a circle and square near circle in centre of the applet 

import java.applet.Applet;
import java.awt.*;
public class pra1e1 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawOval(100,100,150,100); 
  g.drawRect(300,100,150,100);
 }
}

/*
<applet code="pra1e1.class" width="500" height="300">
</applet>
*/