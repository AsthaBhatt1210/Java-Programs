/*Draw an applet page, where left column consist of square filled in blue colour, centre column consists 
  of oval in red colour and right column consists of rectangle filled with pink colour */
import java.applet.Applet;
import java.awt.*;
public class pra2e3 extends Applet
{
   public void paint(Graphics g)
   { 
       g.setColor(Color.blue);
	   g.drawRect(20,20,50,50);
	   g.fillRect(20,20,25,50);
	   g.setColor(Color.red);
	   g.drawOval(80,20,50,50);
	   g.fillOval(95,20,20,50);
	   g.setColor(Color.pink);
	   g.drawRect(140,20,50,50);
	   g.fillRect(165,20,25,50);

   }
}  
/*
<applet code="pra2e3.class" width="500" height="300">
</applet>
*/ 
  
