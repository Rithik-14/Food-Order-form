import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class food extends JFrame
{
JFrame f1,f2,f4,f3;
String[] nv ={"EGG BIRYANI","CHICKEN 65","FISH CURRY","EGG OMLETTE","PRAWN CURRY"};
JLabel title,name,contact,email,address,pincode,pref,order,note,vegl,nonvegl,ordname,qty,prc,warn,thank,cart,totall,dashed,cartname,cartcontact,c_name,c_contact;
JLabel[] vegit = {new JLabel("IDLI"),new JLabel("DOSA"),new JLabel("AAPAM"),new JLabel("VADA"),new JLabel("POORI"),new JLabel("PAROTTA"),new JLabel("PONGAL"),new JLabel("TEA"),new JLabel("COFFEE")};
JLabel[] vegcost= {new JLabel("30Rs"),new JLabel("50Rs"),new JLabel("50Rs"),new JLabel("20Rs"),new JLabel("40Rs"),new JLabel("60Rs"),new JLabel("40Rs"),new JLabel("15Rs"),new JLabel("20Rs")};
JLabel[] nonvegit={new JLabel(nv[0]),new JLabel(nv[1]),new JLabel(nv[2]),new JLabel(nv[3]),new JLabel(nv[4])};
JLabel[] nonvegcost={new JLabel("150"),new JLabel("120"),new JLabel("220"),new JLabel("60"),new JLabel("250")};
JLabel[] nvbill={new JLabel("EGG BIRYANI"),new JLabel("CHICKEN 65"),new JLabel("FISH CURRY"),new JLabel("EGG OMLETTE"),new JLabel("PRAWN CURRY")};
JLabel[] vbill = {new JLabel("IDLI"),new JLabel("DOSA"),new JLabel("AAPAM"),new JLabel("VADA"),new JLabel("POORI"),new JLabel("PAROTTA"),new JLabel("PONGAL"),new JLabel("TEA"),new JLabel("COFFEE")};
JTextField tf1,tf2,tf3,tf4;
JTextField[] tfcart;
JTextArea a1;
String[] ch = {"--SELECT--","VEG","NON-VEG"};
JComboBox cb1;
Integer[] value = {0,1,2,3,4,5};
JComboBox[] cmbn={new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value)};
JComboBox[] cmbv= {new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value),new JComboBox(value)};
JButton b1,b2,proceed;
JRadioButton r1;
JScrollPane sp;
JLabel m1,m2,m3,m4;
	public food() 
	{	
		f1 = new JFrame("FOOD ORDER FORM");
		
		m1 = new JLabel(new ImageIcon("intro2.jpg"));
		m1.setBounds(70,30,300,300);
		
		title = new JLabel("PERSONAL DETAILS");
		title.setBounds(340,0,400,30);
		
		name = new JLabel("NAME*");
		name.setBounds(415,50,200,20);
		tf1 = new JTextField();
		tf1.setBounds(505,50,150,20);
		
		contact = new JLabel("CONTACT*");
		contact.setBounds(415,80,200,20);
		tf2 = new JTextField();
		tf2.setBounds(505,80,150,20);
		
		tf2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String data = tf2.getText();
				int data_len = data.length();
				int temp=0;
				if(data_len == 10)
				{
					for ( int i=0;i<data_len;i++ )
					{
						if( !(Character.isDigit(data.charAt(i))) )
						{
							 temp = temp +1;
						}
					}
					if(temp>0)
					{
						 JOptionPane.showMessageDialog(f1,"ENTER VALID NUMBER","WARNING",JOptionPane.WARNING_MESSAGE);
					}
				}
				else
				{
					 JOptionPane.showMessageDialog(f1,"ENTER 10 DIGIT NUMBER","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		
		email = new JLabel("E-MAIL");
		email.setBounds(415,110,200,20);
		tf3 = new JTextField();
		tf3.setBounds(505,110,150,20);
		
		address = new JLabel("ADDRESS*");
		address.setBounds(415,140,200,20);
		a1 = new JTextArea();
		sp = new JScrollPane(a1);
		sp.setBounds(505,140,200,100);
		
		pincode = new JLabel("PINCODE*");
		pincode.setBounds(415,250,200,20);
		tf4 = new JTextField();
		tf4.setBounds(505,250,150,20);
		
		tf4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String pdata = tf4.getText();
				int pdata_len = pdata.length();
				int ptemp=0;
				if(pdata_len == 6)
				{
					for ( int i=0;i<pdata_len;i++ )
					{
						if( !(Character.isDigit(pdata.charAt(i))) )
						{
							 ptemp = ptemp +1;
						}
					}
					if(ptemp>0)
					{
						 JOptionPane.showMessageDialog(f1,"ENTER VALID PINCODE","WARNING",JOptionPane.WARNING_MESSAGE);
					}
				}
				else
				{
					 JOptionPane.showMessageDialog(f1,"ENTER 6 DIGIT PINCODE","WARNING",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		pref = new JLabel("PREFERENCE*");
		pref.setBounds(415,280,200,20);
		cb1 = new JComboBox(ch);
		cb1.setBounds(505,280,150,20);
		
		b1 = new JButton("NEXT");
		b1.setBounds(490,330,100,20);
		
		note = new JLabel("NOTE : ENTER ALL MANDATORY FIELDS");
		
		f1.getContentPane().setBackground(Color.white);
        f1.pack();
		f1.add(m1);
		f1.add(title);
		f1.add(name);
		f1.add(tf1);
		f1.add(contact);
		f1.add(tf2);
		f1.add(email);
		f1.add(tf3);
		f1.add(address);
		f1.add(sp);
		f1.add(pincode);
		f1.add(tf4);
		f1.add(pref);
		f1.add(cb1);
		f1.add(b1);
		f1.add(note);
		f1.setLayout(null);
		f1.setSize(800,430);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener()
		{  
			public void actionPerformed(ActionEvent e)
			{	if(tf1.getText().equals(""))
				{
					note.setBounds(430,370,240,10);
				}
				else if(tf2.getText().equals(""))
				{
					note.setBounds(430,370,240,10);
				}
				else if(a1.getText().equals(""))
				{
					note.setBounds(430,370,240,10);
				}
				else if(tf4.getText().equals(""))
				{
					note.setBounds(430,370,240,10);
				}
				else if(cb1.getItemAt(cb1.getSelectedIndex()).equals("--SELECT--"))
				{
					note.setBounds(430,370,240,10);
				}
				else
				{
				f2 = new JFrame("FOOD ORDER FORM");
				f2.getContentPane().setBackground(Color.white);
				f2.pack();
				order = new JLabel("ORDER DETAILS");
				order.setBounds(360,0,400,30);
				
				ordname = new JLabel("ITEM");
				ordname.setBounds(450,60,200,20);
				f2.add(ordname);
				prc = new JLabel("PRICE");
				prc.setBounds(550,60,200,20);
				f2.add(prc);
				qty = new JLabel("QUANTITY");
				qty.setBounds(625,60,200,20);
				f2.add(qty);
				if(cb1.getItemAt(cb1.getSelectedIndex()).equals("VEG"))
				{vegl = new JLabel("VEG MENU");
			     vegl.setBounds(375,30,200,20);
				 f2.add(vegl);
				 m2 = new JLabel(new ImageIcon("veg.jpg"));
				 m2.setBounds(65,30,290,300);
				 f2.add(m2);
				 b2 = new JButton("NEXT");
				 b2.setBounds(530,360,75,20);
				 f2.add(b2);
				int j=85;
				int k=0;
				while(k<=8)
				{   if(k==0)
					{
					vegit[k].setBounds(450,j,100,20);
					}
					vegit[k].setBounds(450,j,100,20);
					f2.add(vegit[k]);
					k = k+1;
					j = j+30;
				}
				int a=85;
				int b=0;
				while(b<=8)
				{
					vegcost[b].setBounds(550,a,50,20);
					f2.add(vegcost[b]);
					b= b+1;
					a=a+30;
				}
				int c=85;
				int d=0;
				while(d<=8)
				{
					cmbv[d].setBounds(625,c,50,20);
					f2.add(cmbv[d]);
					d =d+1;
					c=c+30;
				}
				
				b2.addActionListener(new ActionListener()
				 {
					 public void actionPerformed(ActionEvent e)
					 {   f4  =new JFrame("FOOD ORDER FORM");
						 f4.getContentPane().setBackground(Color.white);
						 f4.pack();
					     cart = new JLabel("YOUR CART");
						 r1 = new JRadioButton(" AGREE TO OUR T&C");
						 r1.setBounds(600,330,150,15);
						 Integer[] p = new Integer[9];
						 int total=0,i=0;
						 
						 p[0] = (Integer)(cmbv[0].getItemAt(cmbv[0].getSelectedIndex())) * (30);
						 p[1] = (Integer)(cmbv[1].getItemAt(cmbv[1].getSelectedIndex())) * (50);
						 p[2] = (Integer)(cmbv[2].getItemAt(cmbv[2].getSelectedIndex())) * (50);
						 p[3] = (Integer)(cmbv[3].getItemAt(cmbv[3].getSelectedIndex())) * (20);
						 p[4] = (Integer)(cmbv[4].getItemAt(cmbv[4].getSelectedIndex())) * (40);
						 p[5] = (Integer)(cmbv[5].getItemAt(cmbv[5].getSelectedIndex())) * (60);
						 p[6] = (Integer)(cmbv[6].getItemAt(cmbv[6].getSelectedIndex())) * (40);
						 p[7] = (Integer)(cmbv[7].getItemAt(cmbv[7].getSelectedIndex())) * (15);
						 p[8] = (Integer)(cmbv[8].getItemAt(cmbv[8].getSelectedIndex())) * (20);
						 while(i<=8)
						 {
							 if(p[i]!=0)
							 {
								 total = total + p[i];
							 }
							 i=i+1;
						 }
						 if(total==0)
						 {
							 f3 = new JFrame("FOOD ORDER FORM");
							 f3.getContentPane().setBackground(Color.white);
							 m4 = new JLabel(new ImageIcon("cart.jpg"));
							 m4.setBounds(335,0,150,150);
							 f3.add(m4);
							 f2.setVisible(false);
							 warn = new JLabel("CART : NOTHING IS ADDED");
							 warn.setBounds(340,160,200,30);
							 thank = new JLabel("THANK  YOU  FOR  VISITING  US");
							 thank.setBounds(325,190,200,30);
							 f3.add(warn);
							 f3.add(thank);
							 f3.setLayout(null);
							 f3.setSize(800,430);
							 f3.setVisible(true);
							 f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
							 
						 }
						 if(total!=0)
						 {   cart.setBounds(345,0,200,20);
							 ordname.setBounds(300,40,200,20);
							 qty.setBounds(410,35,300,30);
							 c_name = new JLabel("NAME : ");
							 c_name.setBounds(10,20,200,20);
							 c_contact = new JLabel("CONTACT : ");
							 c_contact.setBounds(10,50,200,20);
							 cartname = new JLabel(tf1.getText());
							 cartname.setBounds(60,20,200,20);
							 cartcontact = new JLabel(tf2.getText());
							 cartcontact.setBounds(80,50,200,20);
							 dashed = new JLabel("---------------------------------------");
							 int r=0;
							 int j=0;
							 int x=70;
							 int data;
							 JLabel[] temp =new JLabel[9];
							 while(j<=8)
							 {  data = (Integer)( cmbv[j].getItemAt(cmbv[j].getSelectedIndex()));
								 if(  data != 0 )
								 {
									temp[r] = new JLabel(String.valueOf(data));
									temp[r].setBounds(440,x,200,20);
									vbill[j].setBounds(300,x,200,20);
									f4.add(vbill[j]);
									f4.add(temp[r]);
									x=x+30;
									
								 }
								 
								 j=j+1;
								 r=r+1;
							 }
							dashed.setBounds(300,x,200,20);
							totall = new JLabel("TOTAL : "+total+" Rs");
							totall.setBounds(300,x+20,200,20);
						 }
						 proceed = new JButton("PROCEED | TOTAL : "+total);
						 proceed.setBounds(600,360,175,20);
						 proceed.addActionListener(new ActionListener()
						 {  public void actionPerformed(ActionEvent a)
							 {
							 if(r1.isSelected())
							 {
							   
							   JOptionPane.showMessageDialog(f4,"ORDER PLACED"+"\n"+"PLEASE VISIT US AGAIN");
							   f4.setVisible(false);
							   f4.dispose();
							   f2.setVisible(false);
							   f2.dispose();
							   f1.setVisible(false);
							   f1.dispose();
							 }
							 else
							 {
								 JOptionPane.showMessageDialog(f4,"PLEASE AGREE TO OUR T&C","WARNING",JOptionPane.WARNING_MESSAGE);
								 
							 }
							 }
						 });
						 f4.add(cart);
						 f4.add(totall);
						 f4.add(ordname);
						 f4.add(qty);
						 f4.add(dashed);
						 f4.add(c_name);
						 f4.add(c_contact);
						 f4.add(cartname);
						 f4.add(cartcontact);
						 f4.add(r1);
						 f4.add(proceed);
						 f4.setLayout(null);
						 f4.setSize(800,430);
						 f4.setVisible(true);
						 f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
					 }
					 
				 });
				
				
				
				}
				else if(cb1.getItemAt(cb1.getSelectedIndex()).equals("NON-VEG"))
				{
				 nonvegl = new JLabel("NON-VEG MENU");
			     nonvegl.setBounds(360,30,200,20);
				 f2.add(nonvegl);
				 m3 = new JLabel(new ImageIcon("nonveg.png"));
				 m3.setBounds(65,60,250,250);
				 f2.add(m3);
				 b2 = new JButton("NEXT");
				 b2.setBounds(520,285,75,20);
				 f2.add(b2);
				int j=85;
				int k=0;
				while(k<=4)
				{   if(k==0)
					{
					nonvegit[k].setBounds(450,j,100,20);
					}
					nonvegit[k].setBounds(450,j,100,20);
					f2.add(nonvegit[k]);
					k = k+1;
					j = j+40;
				}
				int a=85;
				int b=0;
				while(b<=4)
				{
					nonvegcost[b].setBounds(550,a,50,20);
					f2.add(nonvegcost[b]);
					b= b+1;
					a=a+40;
				}
				int c=85;
				int d=0;
				while(d<=4)
				{
					cmbn[d].setBounds(625,c,50,20);
					f2.add(cmbn[d]);
					d =d+1;
					c=c+40;
				}
				 
				 b2.addActionListener(new ActionListener()
				 {
					 public void actionPerformed(ActionEvent e)
					 {   f4  =new JFrame("FOOD ORDER FORM");
						 f4.getContentPane().setBackground(Color.white);
						 f4.pack();
					     cart = new JLabel("YOUR CART");
						 r1 = new JRadioButton(" AGREE TO OUR T&C");
						 r1.setBounds(600,330,150,15);
						 Integer[] p = new Integer[5];
						 int total=0,i=0;
						 p[0] = (Integer)(cmbn[0].getItemAt(cmbn[0].getSelectedIndex())) * (150);
						 p[1] = (Integer)(cmbn[1].getItemAt(cmbn[1].getSelectedIndex())) * (120);
						 p[2] = (Integer)(cmbn[2].getItemAt(cmbn[2].getSelectedIndex())) * (220);
						 p[3] = (Integer)(cmbn[3].getItemAt(cmbn[3].getSelectedIndex())) * (60);
						 p[4] = (Integer)(cmbn[4].getItemAt(cmbn[4].getSelectedIndex())) * (250);
						 while(i<=4)
						 {
							 if(p[i]!=0)
							 {
								 total = total + p[i];
							 }
							 i=i+1;
						 }
						 if(total==0)
						 {
							 f3 = new JFrame("FOOD ORDER FORM");
							 f3.getContentPane().setBackground(Color.white);
							 m4 = new JLabel(new ImageIcon("cart.jpg"));
							 m4.setBounds(335,0,150,150);
							 f3.add(m4);
							 f2.setVisible(false);
							 warn = new JLabel("CART : NOTHING IS ADDED");
							 warn.setBounds(340,160,200,30);
							 thank = new JLabel("THANK  YOU  FOR  VISITING  US");
							 thank.setBounds(325,190,200,30);
							 f3.add(warn);
							 f3.add(thank);
							 f3.setLayout(null);
							 f3.setSize(800,430);
							 f3.setVisible(true);
							 f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
							 
						 }
						 if(total!=0)
						 {   cart.setBounds(345,0,200,20);
							 ordname.setBounds(320,40,200,20);
							 qty.setBounds(410,35,300,30);
							 c_name = new JLabel("NAME : ");
							 c_name.setBounds(10,20,200,20);
							 c_contact = new JLabel("CONTACT : ");
							 c_contact.setBounds(10,50,200,20);
							 cartname = new JLabel(tf1.getText());
							 cartname.setBounds(60,20,200,20);
							 cartcontact = new JLabel(tf2.getText());
							 cartcontact.setBounds(80,50,200,20);
							 dashed = new JLabel("---------------------------------------");
							 int r=0;
							 int j=0;
							 int x=70;
							 int data;
							 int itemr=0,itemq=0;
							 JLabel[] temp =new JLabel[5];
							 while(j<=4)
							 {  data = (Integer)( cmbn[j].getItemAt(cmbn[j].getSelectedIndex()));
								 if(  data != 0 )
								 {
									temp[r] = new JLabel(String.valueOf(data));
									temp[r].setBounds(440,x,200,20);
									nvbill[j].setBounds(300,x,200,20);
									f4.add(nvbill[j]);
									f4.add(temp[r]);
									x=x+30;								
								 }
								 
								 j=j+1;
								 r=r+1;
							 }
							dashed.setBounds(300,x,200,20);
							totall = new JLabel("TOTAL : "+total+" Rs");
							totall.setBounds(300,x+30,200,20);
						 }
						 proceed = new JButton("PROCEED | TOTAL : "+total);
						 proceed.setBounds(600,360,175,20);
						 proceed.addActionListener(new ActionListener()
						 {  public void actionPerformed(ActionEvent a)
							 {
							 if(r1.isSelected())
							 {
							   
							   JOptionPane.showMessageDialog(f4,"ORDER PLACED"+"\n"+"PLEASE VISIT US AGAIN");
							   f4.setVisible(false);
							   f4.dispose();
							   f2.setVisible(false);
							   f2.dispose();
							   f1.setVisible(false);
							   f1.dispose();
							 }
							 else
							 {
								 JOptionPane.showMessageDialog(f4,"PLEASE AGREE TO OUR T&C","WARNING",JOptionPane.WARNING_MESSAGE);
								 
							 }
							 }
						 });
						 f4.add(cart);
						 f4.add(totall);
						 f4.add(ordname);
						 f4.add(qty);
						 f4.add(dashed);
						 f4.add(c_name);
						 f4.add(c_contact);
						 f4.add(cartname);
						 f4.add(cartcontact);
						 f4.add(r1);
						 f4.add(proceed);
						 
						 f4.setLayout(null);
						 f4.setSize(800,430);
						 f4.setVisible(true);
						 f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
					 }
					 
				 });
				 
				}
				
				
				f2.add(order);
				f1.setVisible(false);
				f2.setLayout(null);
				f2.setSize(800,430);
				f2.setVisible(true);
				f2.setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		
		});
		

	}

	public static void main(String[] args) throws Exception
	{	
		new food();
	}
}  



