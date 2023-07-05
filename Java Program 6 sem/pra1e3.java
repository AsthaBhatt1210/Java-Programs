//Draw the following ouput using drawLine function

import java.applet.Applet;
import java.awt.*;
public class pra1e3 extends Applet
{
 public void paint(Graphics g)
 {
  g.drawLine(10,10,100,10); 
  g.drawLine(10,10,100,90);
  g.drawLine(10,90,10,200);
 }
}

/*
<applet code="pra1e3.class" width="300" height="300">
</applet>
*/