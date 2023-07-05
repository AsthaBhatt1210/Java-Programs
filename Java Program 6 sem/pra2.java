//Draw ten red circles in a vertical column in the center of the applet.
import java.applet.Applet;
import java.awt.*;

public class pra2 extends Applet
{
    public void paint(Graphics g)
    {
      for(int i=0;i<10;i++)
      {
       g.setColor(Color.red);
       g.fillOval(200, i*50, 50, 50);
      }
    }
}
/*
<applet code="pra2.class" width="500" height="300">
</applet>
*/