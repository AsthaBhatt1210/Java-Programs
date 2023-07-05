import java.awt.*;
import java.applet.*;
/*<applet code="checkboxgroupdemo.class" height=200 width=200></applet>*/
public class checkboxgroupdemo extends Applet
{
	CheckboxGroup item = new CheckboxGroup();
	Checkbox c1 = new Checkbox("add",item,false);
	Checkbox c2 = new Checkbox("sub",item,true);
	Checkbox c3 = new Checkbox("mul",item,false);
	Checkbox c4 = new Checkbox("div",item,false);
	Checkbox c5 = new Checkbox("min",item,false);
	Checkbox c6 = new Checkbox("max",item,false);
	Button b1 = new Button("Submit");
	TextField t1 = new TextField(20);
	TextField t2 = new TextField(20);
	TextField t3 = new TextField(20);
	 int ans;
	public void init()
	{
		add(t1);
		add(t2);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(c5);
		add(c6);
		add(b1);
		add(t3);
    }
	
	public boolean action(Event evt, Object arg)
	{
	  int no1 = Integer.parseInt(t1.getText());
	  int no2 = Integer.parseInt(t2.getText());
	  
	  
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c1)
		  {
		    ans  = no1+no2; 
	        t3.setText("SUM: " +String.valueOf(ans));
		  }
	  }
	  
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c2)
		  {
		   ans = no1-no2;
	       t3.setText("SUB: " +String.valueOf(ans));
		  }
	  }
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c3)
		  {
		   ans = no1*no2;
	       t3.setText("Mul: " +String.valueOf(ans));
		  }
	  }
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c4)
		  {
		   ans = no1/no2;
	       t3.setText("Div: " +String.valueOf(ans));
		  }
	  }
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c5)
		  {
		   ans = (no1<no2)?no1:no2;
	       t3.setText("Min: " +String.valueOf(ans));
		  }
	  }
	  if(evt.target.equals(b1))
	  {
		  if(item.getSelectedCheckbox()==c6)
		  {
		   ans = (no1>no2)?no1:no2;
	       t3.setText("Max: " +String.valueOf(ans));
		  }
	  }
		
	else
		;
	  return true;
  
	}
}