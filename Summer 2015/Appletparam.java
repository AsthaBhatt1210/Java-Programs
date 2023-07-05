import java.applet.*;
import java.awt.*;
/*
 <applet code="Appletparam" width=500 height=500>
 <param name=name value="Astha">
 <param name=enroll value="06">
 </applet>
*/
 public class Appletparam extends Applet
 {
  public void paint(Graphics g)
  {
   String s1 = getParameter("name");
   String s2 = getParameter("enroll");
   g.drawString("Name: "+s1,20,40);
   g.drawString("Enroll: "+s2,20,60);
   showStatus("Param demo");
  }
 }