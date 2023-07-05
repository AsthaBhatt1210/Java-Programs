/*Aim: Develop an applet that display the position of the mouse at the upper left corner 
of the applet when it is dragged or moved. Draw a 10x10 pixel rectangle filed with 
black at the current mouse position.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="MouseEvent1.class" height=500 width=500></applet>*/
public class MouseEvent1 extends Applet implements MouseMotionListener
{
	static int x,y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString("X = " +x+ " ,Y = " +y,15,15);
		g.fillRect(x,y,10,10);
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
}