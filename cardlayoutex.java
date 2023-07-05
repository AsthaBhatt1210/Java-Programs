import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="cardlayoutex.class" width="800" height="500">*/
public class cardlayoutex extends Applet implements ActionListener
{
	CardLayout card = new CardLayout();
	Button b1,b2,b3;
	Panel Deck;
	
	public void init()
	{
		b1 = new Button("Dog");
		b2 = new Button("Cat");
		b3 = new Button("Monkey");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		Deck = new Panel();
		Deck.setLayout(card);
		add(Deck);
	}
	public void actionPerformed(ActionEvent o)
	{
		if(o.getSource()==b1)
			card.show(Deck,"Dog");
		if(o.getSource()==b2)
			card.show(Deck,"Cat");
		if(o.getSource()==b3)
			card.show(Deck,"Monkey");
	}
	public void paint(Graphics g)
	{
		g.drawString("Crad layout demo",50,60);
	}
}