/*Write an applet that contains three buttons OK,CANCEL and HELP and a text field.if OK is pressed shown on the status bar-"OK is pressed" and the text field should turn red. When CANCEL is pressed -shown on the status bar-"CANCEL is pressed" and text field should turn green. When HELP is pressed- shown on the status bar-"HELP is pressed" and the text field should turn yellow*/ 

import java.awt.*;
import java.applet.*;
//<applet code="pra8e1.class" height=500 width=500></applet>
public class pra8e1 extends Applet
{
  Button b1 = new Button("OK");
  Button b2 = new Button("CANCLE");
  Button b3 = new Button("HELP");
  TextField tf1 = new TextField(15);
  
  public void init()
    {
	  add(tf1);
	  add(b1);
	  add(b2);
	  add(b3);
	}
  public boolean action(Event e,Object o)
  {
    if(e.target.equals(b1))
	{
		getAppletContext().showStatus("OK is pressed");
		tf1.setBackground(Color.RED);
	}
	if(e.target.equals(b2))
	{
		getAppletContext().showStatus("CANCLE is pressed");
		tf1.setBackground(Color.GREEN);
	}
	if(e.target.equals(b3))
	{
		getAppletContext().showStatus("HELP is pressed");
		tf1.setBackground(Color.YELLOW);
	}
	return true;
  }
}