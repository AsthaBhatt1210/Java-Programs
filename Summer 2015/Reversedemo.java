import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="Reversedemo.class" height=500 width=500></applet>
public class Reversedemo extends Applet implements ActionListener
{
	TextField tf1;
	Label l;
	public void init()
	{
		tf1=new TextField(10);
		Button b1=new Button("REVERSE");
		l=new Label();
		b1.addActionListener(this);
		add(tf1);
		add(b1);
		add(l);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=tf1.getText();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		l.setText(rev);
	}
}