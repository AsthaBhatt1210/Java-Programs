/* Develop an applet that contains two buttons. Initialize the label on the buttons to 
"red" and "green", when the user presses the button, it should change the content on 
the label according to the button pressed.*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code = "pra5e1.class" width = "500" height= "300" ></applet>*/
public class pra5e1 extends Applet 
{
  TextField tf1=new TextField(15);
	Button b1=new Button("RED");
	Button b2=new Button("GREEN");
	
	public void init()
	{
	   add(tf1);
	   add(b1);
	   add(b2);
	}
	public boolean action(Event evt,Object obj)
	{
	 if(evt.target.equals(b1))
	 {
		 getAppletContext().showStatus("red");
		 tf1.setText("RED");
	 }
	  if(evt.target.equals(b2))
	 {
		 getAppletContext().showStatus("green");
		 tf1.setText("GREEN");
	 }
	 return true;
	}
}