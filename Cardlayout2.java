import java.awt.*;
import java.applet.Applet;
/*<applet code="Cardlayout2.class" width=500 height=500></applet>*/
public class Cardlayout2 extends Applet
{
	Panel panelCards = new Panel();
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Canvas c1 = new Canvas();
	Canvas c2 = new Canvas();
	Canvas c3 = new Canvas();
	
	CardLayout cards = new CardLayout();
	
	public void init()
	{
		c1.setBackground(Color.blue);
		c2.setBackground(Color.yellow);
		c3.setBackground(Color.pink);
		
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());
		p3.setLayout(new BorderLayout());
		
		p1.add(c1);
		p2.add(c2);
		p3.add(c3);
		
		panelCards.setLayout(cards);
		panelCards.add(p1);
		panelCards.add(p2);
		panelCards.add(p3);
		
		setLayout(new BorderLayout());
		add(panelCards);
	}
	public boolean mouseDown(Event e,int x,int y)
	{
		cards.next(panelCards);
		return true;
	}
}