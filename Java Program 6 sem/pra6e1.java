import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="pra6e1" height=500 width=500></applet>*/
public class pra6e1 extends Applet implements MouseMotionListener
{
  static String msg;

  public void init()
  {
    addMouseMotionListener(this);
  }
  public void paint(Graphics g)
  {
    g.drawString(msg,10,10);
  }
  
  public void mouseDragged(MouseEvent e)
  {
    msg="Mouse Dragged";
    repaint();
  }
  public void mouseMoved(MouseEvent e)
  {
    msg="Mouse Moved";
	repaint();
  }
}