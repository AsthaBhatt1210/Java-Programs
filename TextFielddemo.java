//TextField Demo
import java.awt.*;
import java.applet.*;
/*<applet code="TextFielddemo.class" height=500 width=500></applet>*/
public class TextFielddemo extends Applet
{
	TextField t1 = new TextField("Hello");
	TextField t2 = new TextField("Hello",15);
	TextField t3 = new TextField();
	public void init()
	{
		add(t1);
		add(t2);
		add(t3);
	}
}