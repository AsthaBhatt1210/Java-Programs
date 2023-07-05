import java.applet.*;
import java.awt.*;

/*<applet code="mainpro.class" height=200 width=300></applet>*/

public class mainpro extends Applet
{
  TextField t1 = new TextField();
  TextField t2 = new TextField();
  TextField t3 = new TextField();
  Button b1 = new Button("Add");
  Button b2 = new Button("Sub");
  Button b3 = new Button("Mul");
  Button b4 = new Button("Div");
  Button b5 = new Button("Mod");
  Button b6 = new Button("Min");
  Button b7 = new Button("Max");
  int ans;
  
  public void init()
  {
	  setLayout(new GridLayout(5,2));
	  add(t1);
	  add(t2);
	  add(b1);
	  add(b2);
	  add(b3);
	  add(b4);
	  add(b5);
	  add(b6);
	  add(b7);
	  add(t3);
  }
  
  public boolean action(Event evt,Object ob)
  {
	  int no1 = Integer.parseInt(t1.getText());
	  int no2 = Integer.parseInt(t2.getText());
	  
	  
	  if(evt.target.equals(b1))
	  {
		  ans  = no1+no2; 
	      t3.setText("SUM: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b2))
	  {
		  ans = no1-no2;
	      t3.setText("SUB: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b3))
	  {
		  ans = no1 * no2;
	      t3.setText("MUL: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b4))
	  {
		  ans = no1 / no2;
	      t3.setText("DIV: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b5))
	  {
		  ans = no1 % no2;
	      t3.setText("MOD: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b6))
	  {
		  ans = (no1<no2)?no1:no2;
	      t3.setText("Min: " +String.valueOf(ans));
	  }
	  
	  else if(evt.target.equals(b7))
	  {
		  ans = (no1>no2)?no1:no2;
	      t3.setText("Max: " +String.valueOf(ans));
	  }
	  
	  else
		  ;
	  return true;
  }
}