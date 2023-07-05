//Listdemo
import java.awt.*;
import java.applet.*;
/*<applet code="Listdemo.class" height=500 width=500></applet>*/
public class Listdemo extends Applet
{
	List l = new List(4,true);
	public void init()
	{
	  l.add("1");
	  l.add("2");
	  l.add("3");
	  l.add("4");
	  l.add("5");
	  add(l);
   }
}