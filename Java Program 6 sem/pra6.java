/* Develop an applet that uses the mouse listener, which overrides only two methods which are mousePressed and mouseReleased*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="pra6" height=500 width=500></applet>*/
public class pra6 extends Applet implements MouseListener
{
  static String msg;

  public void init()
  {
    addMouseListener(this);
  }
  public void paint(Graphics g)
  {
    g.drawString(msg,10,10);
  }
  
  public void mousePressed(MouseEvent me)
  {
    msg="Mouse Pressed";
    repaint();
  }
  public void mouseReleased(MouseEvent me)
  {
    msg="Mouse Released";
    repaint();
  }
  public void mouseExited(MouseEvent me)
  {
  }
  public void mouseEntered(MouseEvent me)
  {
  }
  public void mouseClicked(MouseEvent me)
  {
  }
 }
