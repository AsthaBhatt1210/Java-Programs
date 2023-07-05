import java.awt.*;
import java.applet.*;
/*<applet code="Calculator.class" height=500 width=500></applet>*/
public class Calculator extends Applet
{
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	Button b1 = new Button("Sum");
	Button b2 = new Button("Sub");
	TextField tf3 = new TextField();
	
	public void init()
	{
		add(tf1);
		add(tf2);
		add(b1);
		add(b2);
		add(tf3);
	}
	public boolean action(Event e,Object o)
	{
		int no1 = Integer.parseInt(tf1.getText());
		int no2 = Integer.parseInt(tf2.getText());
		
		if(e.target.equals(b1))
		{
			tf3.setText("SUM: " +String.valueOf(no1+no2));
		}
		if(e.target.equals(b2))
		{
			tf3.setText("SUB: " +String.valueOf(no1-no2));
		}
		return true;
	}
}