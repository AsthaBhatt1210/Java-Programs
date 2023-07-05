import java.awt.*;
import java.applet.*;
/*<applet code="ButtonDemo2" height=500 width=500></applet>*/
public class ButtonDemo2 extends Applet
{
  TextField t = new TextField(4);
  Button b = new Button("Click");
  public void init()
  {
	  add(b);
	  add(t);
  }
  public boolean action(Event e,Object o)
  {
	  t.setText("Hello");
	  return true;
  }
}