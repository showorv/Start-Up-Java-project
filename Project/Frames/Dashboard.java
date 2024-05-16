package Frames;



import javax.swing.*;
import java.awt.*;

import javax.swing.border.EtchedBorder;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class Dashboard extends JFrame implements MouseListener,ActionListener{


	
	
	
	JPanel panel;
	Color bgcolor, bg2,b2c;
	
	JTextField name;
	JLabel text,text2;
	JPasswordField pass;
	
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,back;
	Font myFont,myFont2,myFont3,myFont4;
	ImageIcon img,img2,img3,img4;
	
	
	public Dashboard() {
		
		
		
		
		super("Dashboard");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		b2c=new Color(66, 135, 245);
		myFont2 = new Font("Cambria", Font.BOLD, 15);
		myFont3 = new Font("Cambria", Font.BOLD, 20);
		
		myFont4 = new Font("Cambria", Font.BOLD, 30);
		
		
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		this.add(panel);
		img= new ImageIcon(getClass().getResource("/Images/tt.png"));
		img2= new ImageIcon(getClass().getResource("/Images/email.png"));
		img3= new ImageIcon(getClass().getResource("/Images/user.png"));
		img4= new ImageIcon(getClass().getResource("/Images/notification.png"));
		
		
		text2 =new JLabel("INVENTIVESKILL"
				);
		text2.setBounds(290,23,300,30);
		text2.setForeground(Color.GREEN);
		text2.setFont(myFont4);
		
		panel.add(text2);
		
		text =new JLabel("Dashboard"
				);
		text.setBounds(60,80,100,30);
		text.setForeground(Color.white);
		text.setFont(myFont2);
		
		
		panel.add(text);
		
		
		b1 = new JButton();
		b1.setBounds(50,80,106,30);
		b1.setBackground(Color.BLUE);
		
		b1.setFont(myFont2);
		b1.setOpaque(false);
		panel.add(b1);
		
		
		
		
		b2 = new JButton("Web Developement"
				);
		
		b2.setBounds(50,120,220,150);
		b2.setBackground(Color.decode("#614670"));
		b2.setForeground(Color.white);
		b2.setFont(myFont3);
		b2.setBorder(new EtchedBorder(100));
		b2.addMouseListener(this);
		panel.add(b2);
	
		
		
	
		b3 = new JButton("Digital Marketing"
				);
		
		b3.setBounds(290,120,220,150);
		b3.setBackground(Color.decode("#24400e"));
		b3.setForeground(Color.white);
		b3.setFont(myFont3);
		b3.setBorder(new EtchedBorder(100));
		b3.addMouseListener(this);
		panel.add(b3);
	
			
		b4 = new JButton("Video Editing"
				);
		
		b4.setBounds(530,120,220,150);
		b4.setBackground(Color.decode("#2f598b"));
		b4.setForeground(Color.white);
		b4.setFont(myFont3);
		b4.setBackground(Color.decode("#740979"));
		b4.setBorder(new EtchedBorder(100));
		b4.addMouseListener(this);
		panel.add(b4);
		
		b5 = new JButton("App Developement"
				);
		
		b5.setBounds(150,300,220,150);
		b5.setBackground(Color.decode("#226cbe"));
		b5.setForeground(Color.white);
		b5.setFont(myFont3);
		b5.setBorder(new EtchedBorder(100));
		b5.addMouseListener(this);
		panel.add(b5);
		
		b6 = new JButton("Graphics Design"
				);
		
		b6.setBounds(390,300,220,150);
		b6.setBackground(Color.decode("#ed7e16"));
		b6.setForeground(Color.white);
		b6.setFont(myFont3);
		b6.setBorder(new EtchedBorder(100));
		b6.addMouseListener(this);
		panel.add(b6);
		
		
		b7=new JButton(img);
		b7.setBounds(770,23,20,23);
		b7.setForeground(Color.white);
		b7.setToolTipText("Menu");
		panel.add(b7);
		
		b8=new JButton(img3);
		b8.setBounds(740,23,20,23);
		b8.setForeground(Color.white);
		b8.setToolTipText("Profile");
		
		panel.add(b8);
		
		b9=new JButton(img4);
		b9.setBounds(710,23,20,23);
		b9.setForeground(Color.white);
		b9.setToolTipText("Notification");
		panel.add(b9);
		
		b10=new JButton(img2);
		b10.setBounds(680,23,20,23);
		b10.setForeground(Color.white);
		b10.setToolTipText("Message");
		panel.add(b10);
		
		
		
		
		back =new JButton("Back");
      
        back.setBounds(700,500,90,30);
        back.setBackground(Color.decode("#cf1515"));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addMouseListener(this);
        panel.add(back);


		
		
		
		back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Started f1 = new Started ();
                    f1.setVisible(true);
                
            }
        });

		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    WebDash f1 = new WebDash();
                    f1.setVisible(true);
                
            }
        });
		b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    DmDash f1 = new DmDash();
                    f1.setVisible(true);
                
            }
        });
		
		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    videoEdit f1 = new videoEdit();
                    f1.setVisible(true);
                
            }
        });
		
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    AppDash f1 = new AppDash();
                    f1.setVisible(true);
                
            }
        });
		
		b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    GraDash f1 = new GraDash();
                    f1.setVisible(true);
                
            }
        });
		
		b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                   Menu f1 = new Menu();
                    f1.setVisible(true);
                
            }
        });
		
		b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Fem4 f1 = new Fem4();
                    f1.setVisible(true);
                
            }
        });
		
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#662773"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#4f9058"));
			b3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b4)
		{
			b4.setBackground(Color.decode("#614670"));
			b4.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b5)
		{
			b5.setBackground(Color.decode("#124277"));
			b5.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b6)
		{
			b6.setBackground(Color.decode("#884607"));
			b6.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#614670"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#24400e"));
			b3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b4)
		{
			b4.setBackground(Color.decode("#740979"));
			b4.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b5)
		{
			b5.setBackground(Color.decode("#226cbe"));
			b5.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b6)
		{
			b6.setBackground(Color.decode("#ed7e16"));
			b6.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}




	
}
