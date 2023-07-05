import java.awt.*;
import java.applet.*;
/*<applet code="Borderlayoutex.class" width="800" height="500"></applet> */
public class Borderlayoutex extends Applet
{
 public void init()
 {
    setLayout(new BorderLayout());
	add(new Button("wel"), BorderLayout.NORTH);
	add(new Button("come"), BorderLayout.SOUTH);
	add(new Button("rose"), BorderLayout.EAST);
	add(new Button("tiny"), BorderLayout.WEST);
	add(new Button("apple"), BorderLayout.CENTER); 
 }
}