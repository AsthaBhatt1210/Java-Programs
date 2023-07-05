//Draw five red circles and five blue circles alternatively in a vertical column in the centre of the applet. 

import java.applet.Applet;
import java.awt.*;
public class pra2e1 extends Applet
{
   public void paint(Graphics g)
   {      
      g.fillOval(200,50,50,50);
	  g.setColor(Color.red);
	   for(int i=0;i<10;i++)
	   {
		 if(i%2==0)
		 {
		   g.fillOval(200,i*50,50,50);
		   g.setColor(Color.blue);
		 }
		 else
		 {
		   g.fillOval(200,i*50,50,50);
		   g.setColor(Color.red);
		 }
	   }
	}
}
/*
<applet code="pra2e1.class" width="500" height="300">
</applet>
*/