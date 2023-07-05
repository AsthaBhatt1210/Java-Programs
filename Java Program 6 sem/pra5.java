/*Develop an applet that contains one button. Initialize the label on the button to "start", when 
the user presses the button, which changes the label between these two values each time the 
button is pressed */

import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
/*<applet code="pra5" height=500 width=500></applet>*/
public class pra5 extends Applet implements ActionListener
{
 Button b;
 public void init()
 {
   b=new Button("Start");
   b.addActionListener(this);
   add(b);
 }
  public void actionPerformed(ActionEvent ae)
  {
    String label=b.getLabel();
    if(label.compareTo("Start")==0)
    {
      b.setLabel("Stop");
    }
    else
    {
      b.setLabel("Start");
    }
  }
}