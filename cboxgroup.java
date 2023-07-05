import java.awt.*;
import java.applet.*;
//<applet code="cboxgroup" height=500 width=500></applet>
public class cboxgroup extends Applet
{
	CheckboxGroup g = new CheckboxGroup();
	Checkbox c1 = new Checkbox("Female",g,false);
	Checkbox c2 = new Checkbox("Male",g,true);
	public void init()
	{
		add(c1);
		add(c2);
	}
	
}