import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
/*<applet code="KeyListenerex2.class" height=500 width=500></applet>*/

public class KeyListenerex2 extends Applet implements KeyListener
{
  Label l;
  TextArea area;
  
  public KeyListenerex2()
  {
	  l = new Label();
	  l.setBounds(20,50,100,20);
	  area = new TextArea();
	  area.setBounds(20,80,300,300);
	  area.addKeyListener(this);
	  add(l);
	  add(area);
	  setSize(200,200);
	  setLayout(null);
	  setVisible(true);
  }
  public void keyPressed(KeyEvent e)
  {
	  l.setText("Key pressed");
  }
  public void keyReleased(KeyEvent e)
  {
	  l.setText("Key Released");
  }
  public void keyTyped(KeyEvent e)
  {
	  l.setText("Key Typed");
  }
  public static void main(String args[])
  {
	  KeyListenerex2 o = new KeyListenerex2();
  }
}