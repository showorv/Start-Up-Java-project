package Frames;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppDash extends JFrame  implements MouseListener {

	
	JPanel panel;
	Color bgcolor, bg2,b2c;
	
	JTextField name;
	JLabel text,text2,text3,text4,text5;
	JPasswordField pass;
	
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Font myFont,myFont2,myFont3,myFont4;
	ImageIcon img,img2,img3,img4;
	Cursor cursor;
	
	public AppDash() {
		
		super("APPDEVELOPEMENT");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		b2c=new Color(66, 135, 245);
		myFont2 = new Font("Cambria", Font.BOLD, 15);
		myFont3 = new Font("Cambria", Font.BOLD, 35);
		
		
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		
		
		img= new ImageIcon(getClass().getResource("/Images/app.jpg"));
		img2=new ImageIcon(getClass().getResource("/Images/backbutton.png"));
		
		text= new JLabel(img);
		text.setBounds(120,50,300,230);
		text.setForeground(Color.white);
		
		panel.add(text);
		
		
		text2=new JLabel("App");
		text2.setBounds(550,26,300,250);
		text2.setForeground(Color.decode("#226cbe"));
		text2.setFont(myFont3);
		
		panel.add(text2);
		
		text4=new JLabel("Developement");
		text4.setBounds(470,60,300,250);
		text4.setForeground(Color.decode("#226cbe"));
		text4.setFont(myFont3);
		
		panel.add(text4);
		
		text3=new JLabel("Create Your App With Us");
		text3.setBounds(490,97,350,250);
		text3.setForeground(Color.WHITE);
		text3.setFont(myFont2);
		
		panel.add(text3);
		
		
		
		
		text5=new JLabel("Select:");
		text5.setBounds(396,180,200,250);
		text5.setForeground(Color.WHITE);
		text5.setFont(myFont2);
		
		panel.add(text5);
		

		
		b1=new JButton("Mobile App Developement ");
		b1.setBounds(300,330,250,30);
		b1.setBackground(Color.decode("#226cbe"));
		b1.setForeground(Color.white);
		b1.setFont(myFont2);
		b1.setBorder(new EtchedBorder(100));
		b1.setCursor(cursor);
		b1.addMouseListener(this);
		panel.add(b1);
		
		b2=new JButton("Web App Developement");
		b2.setBounds(300,370,250,30);
		b2.setBackground(Color.decode("#226cbe"));
		b2.setForeground(Color.white);
		b2.setFont(myFont2);
		b2.setBorder(new EtchedBorder(100));
		b2.setCursor(cursor);
		b2.addMouseListener(this);
		panel.add(b2);
		
		b3=new JButton("Software Developement ");
		b3.setBounds(300,410,250,30);
		b3.setBackground(Color.decode("#226cbe"));
		b3.setForeground(Color.white);
		b3.setFont(myFont2);
		b3.setBorder(new EtchedBorder(100));
		b3.addMouseListener(this);
		b3.setCursor(cursor);
		panel.add(b3);
		
		b4=new JButton(img2);
		b4.setBounds(670,400,20,23);
		
		b4.setForeground(Color.white);
		
		b4.setCursor(cursor);
		panel.add(b4);
		
		
		this.add(panel);
		
		
		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Dashboard f1 = new Dashboard();
                    f1.setVisible(true);
                
            }
        });
		
		b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    AppPackage f1 = new  AppPackage();
                    f1.setVisible(true);
                
            }
        });
		
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    AppPackage f1 = new  AppPackage();
                    f1.setVisible(true);
                
            }
        });
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    AppPackage f1 = new  AppPackage();
                    f1.setVisible(true);
                
            }
        });
		
		
	}
		

	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.decode("#124277"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#124277"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#124277"));
			b3.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.decode("#226cbe"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#226cbe"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#226cbe"));
			b3.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	
	
	
public static void main(String[] args) {
		
		AppDash f1=new AppDash();
		f1.setVisible(true);
		
	}
	
	
	
	
	
}


















