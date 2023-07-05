//using init method
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MenuDemo2.class" height=500 width=500></applet>*/

public class MenuDemo2 extends Applet implements ActionListener
{
	Frame f;
	Label l;
	public void init()
	{
		f = new Frame("Menu Demo");
		l = new Label("Select any MenuItem from File Menu");
		MenuBar mb = new MenuBar();
		Menu mn = new Menu("File");
		
		MenuItem mi1 = new MenuItem("New");
		mi1.addActionListener(this);
		
		MenuItem mi2 = new MenuItem("Open");
		mi2.addActionListener(this);
		
		MenuItem mi3 = new MenuItem("Save");
		mi3.addActionListener(this);
		
		MenuItem mi4 = new MenuItem("Close");
		mi4.addActionListener(this);
		
		mn.add(mi1);
		mn.add(mi2);
		mn.add(mi3);
		mn.add(mi4);
		
		mb.add(mn);
		f.setMenuBar(mb);
		f.setLayout(new FlowLayout());
		f.add(l);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent o)
	{
		if(o.getSource() instanceof MenuItem)
		{
			l.setText(o.getActionCommand());
		}
	}
}	