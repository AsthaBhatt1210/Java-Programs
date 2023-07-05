import java.awt.*;
import java.applet.*;

/*<applet code="FlowLayoutex.class" height=500 width=500></applet>*/

public class FlowLayoutex extends Applet
{
	public void init()
	{
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		Button b5 = new Button("5");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		setLayout(new FlowLayout(FlowLayout.CENTER));
	}
}