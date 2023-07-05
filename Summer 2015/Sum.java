import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
//<applet code="Sum" width="180" height="70"></applet>
public class Sum extends Applet implements ActionListener
{
	TextField tf1=new TextField();
	TextField tf2=new TextField();
	Button b1=new Button("ADD");
	TextField tf3=new TextField();
	public void init()
	{
		add(tf1);
		add(tf2);
		add(b1);
		add(tf3);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(tf1.getText());
        int n2=Integer.parseInt(tf2.getText());
		if(ae.getSource()==b1)
	        tf3.setText("SUM:"+String.valueOf(n1+n2));
	}
}