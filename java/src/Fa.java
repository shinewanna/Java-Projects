import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
public class Fa extends JFrame implements ActionListener{
	JTextField t1,t2,t3,tb,tg;
	JButton b1;
	JPanel p1,p2,p3;
	JLabel l1,l2,l3,l4;

	public Fa(){
		l1=new JLabel("Enter boy name with small letter and no space.");
		l2=new JLabel("Enter number of letter you enter.");
		l3=new JLabel("Enter girl name with small letter and no space.");
		l4=new JLabel("Enter number of letter you enter.");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		
		tb=new JTextField(10);
		tg=new JTextField(10);
		
		b1=new JButton("Start");
		t3=new JTextField(10);
		p1=new JPanel();
		p1.setLayout(new GridLayout(2,4));
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(tb);
		p1.add(l3);
		p1.add(t2);
		p1.add(l4);
		p1.add(tg);
		
		p2=new JPanel();
		p2.setLayout(new FlowLayout());
		p2.add(b1);
		p2.add(t3);
		p3=new JPanel();
		p3.setLayout(new BorderLayout());
		p3.add(BorderLayout.NORTH,p1);
		p3.add(BorderLayout.CENTER,p2);
		setTitle("FLAMES");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(p3);
		
		
		
		
		
		b1.addActionListener(this);
		this.setVisible(true);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fa();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		char[]b=new char[30];
		char[]g=new char[30];
		String bs,gs;
		bs=t1.getText();
		gs=t2.getText();
		int count=0,boy,girl;
		boy=Integer.parseInt(tb.getText());
		girl=Integer.parseInt(tg.getText());
		for(int a=0;a<boy;a++)
		{
			b[a]=bs.charAt(a);
		}
		
		for(int a=0;a<girl;a++)
		{
			g[a]=gs.charAt(a);
		}
		if(boy<girl||boy==girl)
		for(int i=0;i<=boy;i++){	
				for(int j=0;j<girl;j++){
				
				
				if(b[i]==g[j]){
					count++;
					j=girl;
				}
			}
		}
	
	else{
			for(int i=0;i<=girl;i++){	
					for(int j=0;j<boy;j++){
					
					
					if(g[i]==b[j]){
						count++;
						j=boy;
	}
					}
			}
	}
		
		int tot=boy+girl;
		int n=tot-(count*2);
		if(n==1)
		{
		t3.setText("Sister");	
		}
		else if(n==2)
		{
			t3.setText("Friend");
		}
		
		else if(n==3)
		{
			t3.setText("Love");
		}
		else if(n==4)
		{
			t3.setText("Love");
		}
		else if(n==5)
		{
			t3.setText("Married");
		}
		else if(n==6)
		{
			t3.setText("Love");
		}
		else if(n==7)
		{
			t3.setText("Enemy");
		}
		else if(n==8)
		{
			t3.setText("Friend");
		}
		else if(n==9)
		{
			t3.setText("Married");
		}
		else if(n==10)
		{
			t3.setText("Affection");
		}
		else if(n==11)
		{
			t3.setText("Sister");
		}
		else if(n==12)
		{
			t3.setText("Friend");
		}
		else if(n==13)
		{
			t3.setText("Sister");
		}
		else if(n==14)
		{
			t3.setText("Friend");
		}
		else if(n==15)
		{
			t3.setText("Love");
		}
		else if(n==16)
		{
			t3.setText("Affection");
		}
		else if(n==17)
		{
			t3.setText("Sister");
		}
		else if(n==18)
		{
			t3.setText("Friend");
		}
		else if(n==19)
		{
			t3.setText("Sister");
		}
		else if(n==20)
		{
			t3.setText("Friend");
		}
	}
}
		

