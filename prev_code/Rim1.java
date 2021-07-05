import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Rim extends JFrame implements ActionListener
{
	
	JLabel l1,l2;
	JTextField tf1,tf2;
	JButton b1,b2;
	
	public Rim()
	{
		setTitle("Rickshaw");
		setBounds(300,200,350,400);
		setLayout(null);
		
		l1=new JLabel("ID");
		l1.setBounds(30,80,100,50);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(30,150,100,50);
		add(l2);
		
		tf1=new JTextField(20);
		tf1.setBounds(150, 80, 150, 50);
		add(tf1);
		
		tf2=new JTextField(20);
		tf2.setBounds(150, 150, 150, 50);
		add(tf2);
		
		b1=new JButton("Rimi");
		b1.setBounds(200,220,100,50);
		add(b1);
		
		b2=new JButton("Ovi");
		b2.setBounds(30,220,150,50);
		add(b2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
/*class ButtonSensor implements ActionListener
{
	Rim r;
	ButtonSensor(Rim r)
	{
		this.r=r;
	}*/
public void actionPerformed(ActionEvent ae)
	{    
		String command = ae.getActionCommand();
	    if(command=="Rimi")
		{
			System.out.println("yfgkugfchgkj");
		}
		if(command=="Ovi")
		{
			System.out.println("nhbgvcrgsfgd");
		}	
	}
}

class Rim1
{
	public static void main(String[] args)
	{
		Rim Ri=new Rim();
		Ri.setVisible(true);
	}
}
		
		
		