//TextArea Demo
import java.awt.*;
import java.applet.*;
/*<applet code="TextAreademo.class" height=500 width=500></applet>*/
public class TextAreademo extends Applet
{
	TextArea t1 = new TextArea();
	TextArea t2 = new TextArea(1,2);
	TextArea t3 = new TextArea("Hello");
	TextArea t4 = new TextArea("Hello",1,2);
	public void init()
	{
		add(t1);
		add(t2);
		add(t3);
		add(t4);
	}
}