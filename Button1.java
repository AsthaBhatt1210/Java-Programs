//Button 
import java.awt.*;
import java.applet.*;
/*<applet code="Button1.class" height=500 width=500></applet>*/
public class Button1 extends Applet
{
	Button b1 = new Button();
	Button b2 = new Button("Submit");
	
	public void init()
	{
		add(b1);
		add(b2);
	}
}