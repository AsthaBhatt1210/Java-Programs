//Scrollbar Demo

import java.awt.*;
import java.applet.*;
/*<applet code="Scrollbardemo.class" height=500 width=500></applet>*/
public class Scrollbardemo extends Applet
{
	Scrollbar sc = new Scrollbar();
	
	public void init()
	{
		add(sc);
	}
}