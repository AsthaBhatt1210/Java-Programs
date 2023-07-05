import java.awt.*;
import java.applet.Applet;
/*<applet code = "containerdemo.class" height="100" width="100"></applet>*/
// run: javac containerdemo.java
//      java containerdemo

public class containerdemo extends Applet
{
	public void init()
	{
		add(new Button("One"));
		add(new Button("Two"));
		add(new Label("Three"));
		add(new TextField(""));  //anonymious control
        TextField p = new TextField(20);
		p.setEchoCharacter('*');
		add(p);
	}
	public static void main(String args[])
	{
		Frame f = new Frame();
		f.setTitle("This is containerdemo");
		containerdemo c = new containerdemo();
		c.init();
		f.add(c);
        f.pack();
		f.show();
	}
}