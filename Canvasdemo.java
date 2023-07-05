import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Canvasdemo" width=500 height=500></applet>*/

public class Canvasdemo extends Applet
{
	Canvas c;
	
	public void init()
	{
		c = new Canvas();
		c.setBackground(Color.blue);
		c.setSize(50,60);
		add(c);
	}
}