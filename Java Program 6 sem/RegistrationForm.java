import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class RegistrationForm extends JFrame implements ActionListener{
	
	JTextField t1,t2,t3,t4;
	JTextArea ta1,ta2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,msg;
	JRadioButton it,cmp,civil,mechanical;
	JCheckBox first,sec,third,fourth,fifth,sixth;
	JComboBox term;
	JButton save,show;
	JTextArea screen;
	
	public void regis(){
		setTitle("Registration Form");
		setSize(900,700);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel title = new JLabel("Student Registration Form");
		title.setBounds(330,10,250,50);
		title.setFont(title.getFont().deriveFont(20.0f));
		c.add(title);
		
		l1 = new JLabel("Name");
		l1.setBounds(20,70,100,20);
		l1.setFont(title.getFont().deriveFont(15.0f));
		c.add(l1);
		
		t1 = new JTextField();
		t1.setBounds(130,70,240,20);
		c.add(t1);
		
		l2 = new JLabel("GTU No");
		l2.setBounds(20,110,100,20);
		l2.setFont(title.getFont().deriveFont(15.0f));
		c.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(130,110,240,20);
		c.add(t2);
		
		l3 = new JLabel("Branch");
		l3.setBounds(20,150,100,20);
		l3.setFont(title.getFont().deriveFont(15.0f));
		c.add(l3);
		
		it = new JRadioButton("IT");
		cmp = new JRadioButton("Computer");
		civil = new JRadioButton("Civil");
		mechanical = new JRadioButton("Mechanical");
		
		it.setBounds(130,150,50,20);
		it.setFont(title.getFont().deriveFont(15.0f));
		
		cmp.setBounds(210,150,100,20);
		cmp.setFont(title.getFont().deriveFont(15.0f));
		
		civil.setBounds(130,180,80,20);
		civil.setFont(title.getFont().deriveFont(15.0f));
		
		mechanical.setBounds(210,180,120,20);
		mechanical.setFont(title.getFont().deriveFont(15.0f));
		it.setSelected(true);
		
		c.add(it);
		c.add(cmp);
		c.add(civil);
		c.add(mechanical);
		
		ButtonGroup bn = new ButtonGroup();
		bn.add(it);
		bn.add(cmp);
		bn.add(civil);
		bn.add(mechanical);
		
		l4= new JLabel("Sem");
		l4.setBounds(20,220,100,20);
		l4.setFont(title.getFont().deriveFont(15.0f));
		c.add(l4);
		
		first = new JCheckBox("First");
		first.setBounds(130,220,60,20);
		first.setFont(title.getFont().deriveFont(15.0f));
		first.setSelected(true);
		c.add(first);
		
		sec = new JCheckBox("Second");
		sec.setBounds(210,220,80,20);
		sec.setFont(title.getFont().deriveFont(15.0f));
		c.add(sec);
		
		third = new JCheckBox("Third");
		third.setBounds(300,220,80,20);
		third.setFont(title.getFont().deriveFont(15.0f));
		c.add(third);
		
		fourth = new JCheckBox("Fourth");
		fourth.setBounds(130,260,80,20);
		fourth.setFont(title.getFont().deriveFont(15.0f));
		c.add(fourth);
		
		fifth = new JCheckBox("Fifth");
		fifth.setBounds(210,260,80,20);
		fifth.setFont(title.getFont().deriveFont(15.0f));
		c.add(fifth);
		
		sixth = new JCheckBox("Sixth");
		sixth.setBounds(300,260,80,20);
		sixth.setFont(title.getFont().deriveFont(15.0f));
		c.add(sixth);
		
		l5 = new JLabel("Address");
		l5.setBounds(20,300,100,20);
		l5.setFont(title.getFont().deriveFont(15.0f));
		c.add(l5);
		
		ta1 = new JTextArea();
		ta1.setBounds(130,300,240,80);
		c.add(ta1);
		
		l6 = new JLabel("term");
		l6.setBounds(20,410,110,20);
		l6.setFont(title.getFont().deriveFont(15.0f));
		c.add(l6);
		
		String term_[] = {"2019-2020","2020-2021","2021-2022"};
		
		term = new JComboBox(term_);
		term.setBounds(130,410,240,20);
		c.add(term);
		
		l7 = new JLabel("Contact No");
		l7.setBounds(20,450,100,20);
		l7.setFont(title.getFont().deriveFont(15.0f));
		c.add(l7);
		
		t3 = new JTextField();
		t3.setBounds(130,450,240,20);
		c.add(t3);
		
		l8 = new JLabel("Email-id");
		l8.setBounds(20,490,100,20);
		l8.setFont(title.getFont().deriveFont(15.0f));
		c.add(l8);
		
		t4 = new JTextField();
		t4.setBounds(130,490,240,20);
		c.add(t4);
		
		ta2 =new JTextArea();
		ta2.setBounds(430,70,400,512);
		c.add(ta2);
		
		save = new JButton("Save");
		save.setBounds(130,550,110,30);
		save.setFont(title.getFont().deriveFont(15.0f));
		c.add(save);
		save.addActionListener(this);
		
		show = new JButton("Show");
		show.setBounds(255,550,110,30);
		show.setFont(title.getFont().deriveFont(15.0f));
		c.add(show);
		save.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String args[])
	{
		RegistrationForm p = new RegistrationForm();
		p.regis();
	}
	public void actionPerformed(ActionEvent a)
	{
		String s=a.getActionCommand();
		if(s=="Save")
		{
			String name=t1.getText();
			String gtuno=t2.getText();
			String branch=" ";
			if(it.isSelected())
			{
				branch="IT";
			}
			else if(cmp.isSelected())
			{
				branch="Computer";
			}
			else if(civil.isSelected())
			{
				branch="Civil";
			}
			else if(mechanical.isSelected())
			{
				branch="Mechanical";
			}
			
			String sem=" ";
			if(first.isSelected())
			{
				sem ="First";
			}
			else if(sec.isSelected())
			{
				sem ="Second";
			}
			else if(third.isSelected())
			{
				sem ="Third";
			}
			else if(fourth.isSelected())
			{
				sem ="Fourth";
			}
			else if(fifth.isSelected())
			{
				sem ="Fifth";
			}
			else if(sixth.isSelected())
			{
				sem ="Sixth";
			}
			String add=ta1.getText();
			String c=(String)term.getSelectedItem();
			String cn=t3.getText();
			String email=t4.getText();
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava","root","");
				Statement stmt=con.createStatement();
				String sql1 = "Insert INTO student_registration (name,gtuno,branch,sem,address,term,mobile,email)VALUES ('"+name+"','"+gtuno+"','"+branch+"','"+sem+"','"+add+"','"+c+"','"+cn+"','"+email+"')";
				
				stmt.executeUpdate(sql1);
				ta2.setText("Data inserted");
				stmt.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(s=="Show")
		{
			String em=t4.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajava","root","");
				Statement stmt=con.createStatement();
				
				String sql1="SELECT * FROM student_registration where email='"+em+"'";
				ResultSet rs1=stmt.executeQuery(sql1);
				while(rs1.next())
				{
					String name=rs1.getString("name");
					String gtuno=rs1.getString("gtuno");
					String branch=rs1.getString("branch");
					String sem=rs1.getString("sem");
					String add=rs1.getString("address");
					String term=rs1.getString("term");
					String mobile=rs1.getString("mobile");
					String email=rs1.getString("email");
					ta2.setText("Name: "+name+"\n Gtu No: "+gtuno+"\n Branch: "+branch+"\n Semester: "+sem+"\n Address: "+add+"\n Academic Term: "+term+"\n Mobile Number: "+mobile+"\n Email-id: "+email+"\n");
				}
				stmt.close();
				con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
}}}}
				