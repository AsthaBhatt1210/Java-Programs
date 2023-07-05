//ActionEvent demo 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ActionEventdemo.class" height=500 width=500></applet>*/
public class ActionEventdemo extends Applet implements ActionListener
{
 Button b1 = new Button("Hello");
 TextField t1 = new TextField(10);
 public void init()
 {
   add(t1);
   add(b1);
   b1.addActionListener(this);
 }
 public void actionPerformed(ActionEvent o)
 {
   t1.setText("Hello");
 }
}