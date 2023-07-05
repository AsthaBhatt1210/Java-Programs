/*Aim :- Develop a program that draws two sets of ever – decreasing rectangles one in outline form and one filled alternately in black and white*/

import java.awt.*;
public class pra10 extends Canvas
{
   Frame f;
   public pra10()
   {
     f = new Frame("Practical - 10");
     f.setSize(500,300);
     f.setVisible(true);
     f.setLayout(new FlowLayout());
     setSize(400,200);
     setVisible(true);
     f.add(this);
   }
   public void paint(Graphics g)
   {
      g.setColor(Color.RED);
      g.fillRect(0,0,400,200);
      int x=0;
      int y=0;
      int width=400;
      int height=200;
      int i=0;
      while(i<19)
      {
        width=width-10;
        height=height-10;
        x=(400-width)/2;
        y=(200-height)/2;
        if(i%2==1)
          g.setColor(Color.WHITE);
        else
          g.setColor(Color.BLACK);
          g.fillRect(x,y,width,height);
          i++;
        try
        {
           Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {}
      }
    }
   public static void main(String a[])
   {
      pra10 fd = new pra10();
   }
}