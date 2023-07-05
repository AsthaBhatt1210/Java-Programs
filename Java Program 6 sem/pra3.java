//Built an applet that display a horizontal rectangle in its centre. Let the rectangle fill with colour from UP to DOWN.

import java.awt.Graphics; 
import java.awt.event.*; 
import java.awt.*; 
import java.applet.*; 
public class pra3 extends Applet 
{ 
 public void paint(Graphics g) 
 { 
 int width=50; 
 int height=10; 
 g.setColor(Color.red); 
 g.drawRect(150,100,50,200); 
 for(int i=1;i<21;i++) 
 { 
  try 
  { 
    Thread.sleep(1000); 
  } 
  catch(InterruptedException e) 
  { 
  } 
    g.fillRect(150,100,width,height); 
    height = height +10; 
  }
 }
} 

/* 
<applet code="pra3.class" width=600 height=400> 
</applet> 
*/ 