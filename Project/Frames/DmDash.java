package Frames;







import javax.swing.*;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DmDash extends JFrame implements MouseListener  {

	
	JPanel panel;
	Color bgcolor, bg2,b2c;
	
	JTextField name;
	JLabel text,text2,text3,text4,text5;
	JPasswordField pass;
	
	JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Font myFont,myFont2,myFont3,myFont4;
	ImageIcon img,img2,img3,img4;
	Cursor cursor;
	
	public DmDash() {
		
		super("DigitalMarketing");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		b2c=new Color(66, 135, 245);
		myFont2 = new Font("Cambria", Font.BOLD, 15);
	     
		
		
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		
		
		img= new ImageIcon(getClass().getResource("/Images/dm.jpg"));
		img2=new ImageIcon(getClass().getResource("/Images/backbutton.png"));
		
		text= new JLabel(img);
		text.setBounds(200,0,200,250);
		text.setForeground(Color.white);
		
		panel.add(text);
		
		
		text2=new JLabel("Grow Your");
		text2.setBounds(420,30,200,250);
		text2.setForeground(Color.white);
		text2.setFont(myFont2);
		
		panel.add(text2);
		
		text3=new JLabel("Business");
		text3.setBounds(499,30,200,250);
		text3.setForeground(Color.GREEN);
		text3.setFont(myFont2);
		
		panel.add(text3);
		
		
		text4=new JLabel("With Dital Marketing");
		text4.setBounds(564,30,200,250);
		text4.setForeground(Color.WHITE);
		text4.setFont(myFont2);
		
		panel.add(text4);
		
		text5=new JLabel("Select:");
		text5.setBounds(396,180,200,250);
		text5.setForeground(Color.WHITE);
		text5.setFont(myFont2);
		
		panel.add(text5);
		
		
		
		b1=new JButton("SEO \n (Search Engine Optimizaion)");
		b1.setBounds(300,330,250,30);
		b1.setBackground(Color.decode("#24400e"));
		b1.setForeground(Color.white);
		b1.setFont(myFont2);
		b1.setBorder(new EtchedBorder(100));
		b1.setCursor(cursor);
		b1.addMouseListener(this);
		panel.add(b1);
		
		b2=new JButton("SMM \n (Social Media Marketing)");
		b2.setBounds(300,370,250,30);
		b2.setBackground(Color.decode("#24400e"));
		b2.setForeground(Color.white);
		b2.setFont(myFont2);
		b2.setBorder(new EtchedBorder(100));
		b2.setCursor(cursor);
		b2.addMouseListener(this);
		panel.add(b2);
		
		b3=new JButton("Google Ads \n / \n PPC Ads)");
		b3.setBounds(300,410,250,30);
		b3.setBackground(Color.decode("#24400e"));
		b3.setForeground(Color.white);
		b3.setFont(myFont2);
		b3.setBorder(new EtchedBorder(100));
		b3.setCursor(cursor);
		b3.addMouseListener(this);
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
                    DmPackage f1 = new DmPackage();
                    f1.setVisible(true);
                
            }
        });
		
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    DmPackage2 f1 = new DmPackage2();
                    f1.setVisible(true);
                
            }
        });
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    DmPackage3 f1 = new DmPackage3();
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
			b1.setBackground(Color.decode("#4f9058"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#4f9058"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#4f9058"));
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
			b1.setBackground(Color.decode("#24400e"));
			b1.setForeground(Color.WHITE);
		}
		
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#24400e"));
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b3)
		{
			b3.setBackground(Color.decode("#24400e"));
			b3.setForeground(Color.WHITE);
		}
		
		else
		{
			
		}
	}
	
	
	
	
public static void main(String[] args) {
		
		DmDash f1=new DmDash();
		f1.setVisible(true);
		
	}
	
	
	
	
	
}

















