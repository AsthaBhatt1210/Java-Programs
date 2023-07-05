import java.applet.Applet;
import java.awt.*;
/*<applet code="showstatus" width="500" height="500">
</applet>*/
public class showstatus extends Applet
{
	TextField tf1=new TextField(15);
	Button b1=new Button("FIRST");
	Button b2=new Button("SECOND");
	
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
		 getAppletContext().showStatus("BY BUTTON1");
		 tf1.setText("BY BUTTON1");
	 }
	  if(evt.target.equals(b2))
	 {
		 getAppletContext().showStatus("BY BUTTON2");
		 tf1.setText("BY BUTTON2");
	 }
	 return true;
	}
}