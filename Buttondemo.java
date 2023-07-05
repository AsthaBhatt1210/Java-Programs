//Button example
import java.applet.*;
import java.awt.*;
/*<applet code="Buttondemo.class" height=500 width=500></applet>*/

public class Buttondemo extends Applet
{
	Button b1 = new Button("Click me");
	
     public void init()
     {
      add(b1);
	  b1.setBounds(30,100,80,30);
	  setVisible(true);
     }
	/* public static void main(String args[])
	 {
		 Buttondemo o = new Buttondemo();
	 } */
}