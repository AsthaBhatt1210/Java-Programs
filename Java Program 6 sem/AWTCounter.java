//Write an AWT GUI application.Each time the "Count" button is clicked,the counter value shall increase by 1.
import java.awt.*;
import java.awt.event.*;
public class AWTCounter extends Frame implements ActionListener
{
  Label l;
  TextField tf;
  Button b;
  int count = 0;
  public AWTCounter()
  {
    setLayout(new FlowLayout());
	l = new Label("Counter");
	add(l);
	tf = new TextField(count + "",10);
	tf.setEditable(false);
	add(tf);
	b = new Button("Count");
	add(b);
	b.addActionListener(this);
	setSize(300,300);
	setVisible(true);
	setTitle("AWT Counter");
  }
  public void actionPerformed(ActionEvent e)
  {
	  ++count;
	  tf.setText(count+ "");
  }
  public static void main(String args[])
  {
	  AWTCounter ob = new AWTCounter();
  }
}