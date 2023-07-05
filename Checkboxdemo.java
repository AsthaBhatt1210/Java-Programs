import java.awt.*;
import java.applet.*;
//<applet code="Checkboxdemo.class" height=500 width=500></applet>
public class Checkboxdemo extends Applet
{
	Checkbox c1 = new Checkbox();
	Checkbox c2 = new Checkbox("Male");
	Checkbox c3 = new Checkbox("Female",true);
	Checkbox c4 = new Checkbox("Other",null,true);
	public void init()
	{
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
}