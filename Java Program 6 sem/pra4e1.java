//Develop an applet that draws an oval filled with blue color at current mouse position.
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="pra4e1.class" height=500 width=500></applet>*/

public class pra4e1 extends Applet implements MouseMotionListener
{
	static int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("X = " +x+ " ,Y = " +y,15,15);
		g.setColor(Color.blue); 
		g.fillOval(x,y,20,25);
	}
	public void mouseMoved(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	public void mouseExited(MouseEvent e)
	{
	}
	public void mouseEntered(MouseEvent e)
	{
	}
	public void mouseClicked(MouseEvent e)
	{
	}
}