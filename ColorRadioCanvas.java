import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="ColorRadioCanvas.class" height=500 width=500></applet>*/
public class ColorRadioCanvas extends Applet implements ItemListener
{
	CheckboxGroup g = new CheckboxGroup();
	Checkbox c1 = new Checkbox("RED",g,false);
	Checkbox c2 = new Checkbox("BLUE",g,false);
	Checkbox c3 = new Checkbox("GREEN",g,false);
	Canvas c = new Canvas();
	
	public void init()
	{
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c.setSize(50,50);
		c.setBackground(Color.WHITE);
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(c);
	}
	public void itemStateChanged(ItemEvent o)
	{
		if(c1.getState())
			c.setBackground(Color.RED);
		if(c2.getState())
			c.setBackground(Color.BLUE);
		if(c3.getState())
			c.setBackground(Color.GREEN);
	}
}