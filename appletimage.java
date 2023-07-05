import java.applet.*;
import java.awt.*;
/*<applet code="appletimage" height="500" width="500"></applet>*/

public class appletimage extends Applet
{
  Image i;
  MediaTracker t;
  
  public void paint(Graphics g)
  {
    //t = new MediaTracker(this);
	i = getImage(getCodeBase(), "img.png");
	//t.addImage(i,0);
	g.drawImage(i,0,0,this);
  }
}