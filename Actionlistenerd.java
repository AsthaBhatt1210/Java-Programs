import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Actionlistenerd" width="180" height="70">
</applet>*/
public class Actionlistenerd extends Applet implements ActionListener
{
	TextField tf1=new TextField(10);
	TextField tf2=new TextField(10);
	Button b1=new Button("ADD");
	Button b2=new Button("SUB");
	Button b3=new Button("Mul");
	Button b4=new Button("Div");
	Button b5=new Button("Min");
	Button b6=new Button("Max");
	Label l1=new Label("ANSWER");
	TextField tf3=new TextField(10);
	
	public void init()
	{
		setLayout(new GridLayout(5,2));//r,c
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(l1);
		add(tf3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int n1=Integer.parseInt(tf1.getText());
        int n2=Integer.parseInt(tf2.getText());
		
	    if(ae.getSource()==b1)
	        tf3.setText("SUM:"+String.valueOf(n1+n2)); 
	    if(ae.getSource()==b2)
	        tf3.setText("SUB:"+String.valueOf(n1-n2)); 
	    if(ae.getSource()==b3)
			tf3.setText("Mul:"+String.valueOf(n1*n2));
		if(ae.getSource()==b4)
			tf3.setText("Div:"+String.valueOf(n1/n2));
		if(ae.getSource()==b5)
		{
			if(n1<n2)
			{
				tf3.setText("Min: "+String.valueOf(n1));
			}
			else
			{
				tf3.setText("Min: "+String.valueOf(n2));
			}
		}
		/*if(ae.getSource()==b6)
		{
			if(n1<n2)
			{
				tf3.setText("Max: "+String.valueOf(n2));
			}
			else
			{
				tf3.setText("Max: "+String.valueOf(n1));
			}
		}*/
		if(ae.getSource()==b6)
			tf3.setText("Max: " +String.valueOf((n1>n2)?n1:n2));
	}
}

