//checkbox
import java.awt.*;
import java.applet.Applet;
/*<applet code="checkbox.class" height=200 width=200></applet>*/
public class checkbox extends Applet
{
	Checkbox c1 = new Checkbox("pen",true);
	Checkbox c2 = new Checkbox("pencil");
	Checkbox c3 = new Checkbox("scale");
	Button b1 = new Button("Submit");
	TextField tf1 = new TextField(20);
	public void init()
	{
		add(c1);
		add(c2);
		add(c3);
		add(b1);
		add(tf1);
	}
	public boolean action(Event e,Object o)
	{
	   String s = new String();
         if(e.target.equals(b1))
		 {
			if(c1.getState())
			    s = s + c1.getLabel();
			if(c2.getState())
				s = s + "  " + c2.getLabel();
			if(c3.getState())
				s = s + "  " + c3.getLabel();
			tf1.setText(s);
		  }	
          return true;		  
	}
}