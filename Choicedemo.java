//choice demo
import java.awt.*;
import java.applet.*;
/*<applet code="Choicedemo.class" height=500 width=500></applet>*/
public class Choicedemo extends Applet
{
   Choice c = new Choice();
   public void init()
   {
	c.add("1");
	c.add("2");
	c.add("3");
	c.add("4");
	c.add("5");
	add(c);
   }
}
