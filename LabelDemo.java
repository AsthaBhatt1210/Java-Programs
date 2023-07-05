//Label Demo
import java.awt.*;
import java.applet.*;
/*<applet code="LabelDemo.class" height=500 width=500></applet>*/
public class LabelDemo extends Applet
{
	Label l1 = new Label("one");
	Label l2 = new Label("two",Label.CENTER);
	Label l3 = new Label("three",Label.RIGHT);
	Label l4 = new Label("four");
	
	public void init()
	{
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
}