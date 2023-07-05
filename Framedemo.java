///Create a frame window within applet
import java.awt.*;
import java.applet.*;

public class Framedemo extends Applet
{
 
 public Framedemo()
 {
  Frame f = new Frame("Hello");
  Label l = new Label("Gm");
  f.add(l);
  f.setSize(300,300);
  f.setVisible(true);
 }
 public static void main(String args[])
 {
  Framedemo o = new Framedemo();
 }
}