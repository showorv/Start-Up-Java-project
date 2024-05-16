package Frames;

import java.awt.Color;


import javax.swing.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.EtchedBorder;

public class videoEdit extends JFrame implements MouseListener {

	JPanel panel;
	Color bgcolor, bg2,b2c;
	
	JTextField name;
	JLabel text,text2,text3,text4,text5;
	JPasswordField pass;
	
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Font myFont,myFont2,myFont3,myFont4;
	ImageIcon img,img2,img3,img4;
	Cursor cursor;
	
	public videoEdit() {
		
		super("VIDEOEDITING");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		b2c=new Color(66, 135, 245);
		myFont2 = new Font("Cambria", Font.BOLD, 15);
		myFont3 = new Font("Cambria", Font.BOLD, 25);
		
		
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		
		
		img= new ImageIcon(getClass().getResource("/Images/vid.jpg"));
		img2=new ImageIcon(getClass().getResource("/Images/backbutton.png"));
		
		text= new JLabel(img);
		text.setBounds(300,50,250,148);
		text.setForeground(Color.white);
		
		panel.add(text);
		
		
		text2=new JLabel("VIDEO EDITING");
		text2.setBounds(325,100,200,250);
		text2.setForeground(Color.decode("#740979"));
		text2.setFont(myFont3);
		
		panel.add(text2);
		
		
		
		
		
		
		text5=new JLabel("Select:");
		text5.setBounds(396,180,200,250);
		text5.setForeground(Color.WHITE);
		text5.setFont(myFont2);
		
		panel.add(text5);
		
	
		
		b1=new JButton("Podcast Edit");
		b1.setBounds(300,330,250,30);
		b1.setBackground(Color.decode("#740979"));
		b1.setForeground(Color.white);
		b1.setFont(myFont2);
		b1.setBorder(new EtchedBorder(100));
		b1.setCursor(cursor);
		b1.addMouseListener(this);
		panel.add(b1);
		
		b2=new JButton("Travel Video Edit");
		b2.setBounds(300,370,250,30);
		b2.setBackground(Color.decode("#740979"));
		b2.setForeground(Color.white);
		b2.setFont(myFont2);
		b2.setBorder(new EtchedBorder(100));
		b2.setCursor(cursor);
		b2.addMouseListener(this);
		panel.add(b2);
		
		b3=new JButton("Motion Graphics");
		b3.setBounds(300,410,250,30);
		b3.setBackground(Color.decode("#740979"));
		b3.setForeground(Color.white);
		b3.setFont(myFont2);
		b3.setBorder(new EtchedBorder(100));
		b3.setCursor(cursor);
		b3.addMouseListener(this);
		panel.add(b3);
		
		b5=new JButton("Animation");
		b5.setBounds(300,450,250,30);
		b5.setBackground(Color.decode("#740979"));
		b5.setForeground(Color.white);
		b5.setFont(myFont2);
		b5.setBorder(new EtchedBorder(100));
		b5.setCursor(cursor);
		b5.addMouseListener(this);
		panel.add(b5);
		
		b4=new JButton(img2);
		b4.setBounds(670,400,20,23);
		
		b4.setForeground(Color.white);
		
		b4.setCursor(cursor);
		panel.add(b4);
		
		
		this.add(panel);
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    VidPack f1 = new  VidPack();
                    f1.setVisible(true);
                
            }
        });
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    VidPack f1 = new  VidPack();
                    f1.setVisible(true);
                
            }
        });
		b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    VidPack f1 = new  VidPack();
                    f1.setVisible(true);
                
            }
        });
		b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    VidPack f1 = new  VidPack();
                    f1.setVisible(true);
                
            }
        });
		
		b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Dashboard f1 = new Dashboard();
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
			b1.setBackground(Color.decode("#614670"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#614670"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#614670"));
			b3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b5)
		{
			b5.setBackground(Color.decode("#614670"));
			b5.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.decode("#740979"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#740979"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#740979"));
			b3.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b5)
		{
			b5.setBackground(Color.decode("#740979"));
			b5.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}

	
	
	
	
public static void main(String[] args) {
		
		videoEdit f1=new videoEdit();
		f1.setVisible(true);
		
	}
	
	
}

