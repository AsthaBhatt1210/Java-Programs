/*Aim :- Develop an applet that uses the mouse listener, which overrides only 
two methods, which are mousePressed and mouseReleased.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="MouseEvent2.class" height=500 width=500></applet>*/

public class MouseEvent2 extends Applet implements MouseListener
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
	public void mousePressed(MouseEvent e)
	{
		msg = "Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent e)
	{
		msg = "Mouse Released";
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