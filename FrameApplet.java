import java.applet.*;
import java.awt.*;
/*<applet code="FrameApplet" height="500" width="400"></applet>*/

public class FrameApplet extends Applet
{
  Frame f;
  Button b;
  
  public void init()
  {
	  f = new Frame("Frame window");
	  b = new Button("Show window");
	  add(b);
  }
  public boolean action(Event e,Object o)
  {
	  boolean visible = f.isShowing();
	  if(visible)
	  {
		  f.hide();
		  b.setLabel("Show window");
	  }
	  else
	  {
		  f.show();
		  f.resize(200,100);
		  b.setLabel("Hide window");
	  }
	  return true;
  }
}