import java.awt.*;
public class pra9e1  
{
    Frame f;

	public pra9e1()
	{
	   f=new Frame("Practical of Menu");
	  // l.setBounds(50,50,10,10);
	   MenuBar mb=new MenuBar();
	   Menu mn=new Menu("File");
	   Menu mn1=new Menu("New");
	   MenuItem e1=new MenuItem("Item 1");
	   MenuItem e2=new MenuItem("Item 2");
	   MenuItem mi2=new MenuItem("Open");
	   MenuItem mi3=new MenuItem("Save");
	   Menu mn4=new Menu("Exit");
	   MenuItem e3=new MenuItem("Item 3");
	   
	   mn4.setActionCommand("I am exit command");
	   mn.add(mn1);
	   mn1.add(e1);
	   mn1.add(e2);
	   mn.add(mi2);
	   mn.add(mi3);
	   mn.add(mn4);
	   mn4.add(e3);
	   mb.add(mn);
	  // f.setMenuBar(mb);
	   Menu mn2=new Menu("Edit");
	   MenuItem mn21=new MenuItem("Cut");
	   Menu mn22=new Menu("Copy");
	   MenuItem e4=new MenuItem("Item 4");
	   Menu mn23=new Menu("Paste");
	   MenuItem e5=new MenuItem("Item 5");
	   MenuItem mn24=new MenuItem("Undo");
	   mn2.add(mn21);
	   mn22.add(e4);
	   mn2.add(mn22);
	   mn23.add(e5);
	   mn2.add(mn23);
	   mn2.add(mn24);
	   mb.add(mn2);
	   Menu mn3=new Menu("Design");
	   Menu mn31=new Menu("Font");
	   MenuItem e6=new MenuItem("Times New Roman");
	   MenuItem e7=new MenuItem("Dancing script");
	   MenuItem mn32=new MenuItem("Syntax");
	   MenuItem mn33=new MenuItem("Size");
	   Menu mn34=new Menu("Color");
	   MenuItem e8=new MenuItem("Black");
	   MenuItem e9=new MenuItem("Blue");
	   MenuItem e10=new MenuItem("White");
	   mn31.add(e6);
	   mn31.add(e7);
	   mn3.add(mn31);
	   mn3.add(mn32);
	   mn3.add(mn33);
	   mn34.add(e8);
	   mn34.add(e9);
	   mn34.add(e10);
	   mn3.add(mn34);
	   mb.add(mn3);
	   f.setMenuBar(mb);
	   
	   f.setSize(500,500);
	   f.setVisible(true);
	}
	public static void main(String args[])
	{
		pra9e1 ob=new pra9e1();
	}
}