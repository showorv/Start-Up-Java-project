package Frames;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Started extends JFrame implements MouseListener {

	JPanel panel;
	Color bgcolor, bg2,b2c;
	Font myFont,myFont2,myFont3,myFont4;
	JLabel text,text2,text3,text4,text5;
	JButton b1, b2,b3;
	ImageIcon img,img2,img3,img4;
	Cursor c1;
	public Started() {
		
		
		
		super("GetStarted");
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
		this.add(panel);
		
		img= new ImageIcon(getClass().getResource("/Images/bg1.jpg"));
		
		
		
		
		b1 = new JButton("Get Started");
		b1.setCursor(c1);
		b1.setBounds(230, 400, 140, 30);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		b1.setOpaque(true);
		b1.addMouseListener(this);
		
		panel.add(b1);
	    
	    
		b2 =new JButton("Admin Pannel");
        b2.setCursor(c1);
        b2.setBounds(380,400,140,30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.setOpaque(true);
        b2.addMouseListener(this);
       
        panel.add(b2);
		
	
		text= new JLabel(img);
		text.setBounds(0,0,830,600);
		text.setForeground(Color.white);
		
		panel.add(text);
		
	  
	    b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Frame f1 = new  Frame();
                    f1.setVisible(true);
                
            }
        });
	    
	    b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                   Adminlog f1 = new  Adminlog();
                    f1.setVisible(true);
                
            }
        });
	    
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==b1){
			b1.setBackground(Color.decode("#345d14"));
			
			b1.setOpaque(true);
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.decode("#771313"));
			b2.setForeground(Color.WHITE);
		}
	}
	
	public void mouseExited(MouseEvent me){
		if(me.getSource()==b1){
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.BLACK);
			b1.setOpaque(true);
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.BLUE);
		}
	}
	
	

	

		
		
		
	
	
	
public static void main(String[] args) {
		
		Started f1=new Started();
		f1.setVisible(true);
		
	}
	
}
