package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fem4 extends JFrame implements MouseListener  {
	JButton psetting,pdetails,porder,asetting,logout,back;
	JPanel panel;
	Color myColor;
	Font myFont;
	Cursor c1;
		
	public Fem4()
		{
			super("your profile");
			this.setSize(550, 400);
	        this.setLocation(500,250);

			
			myColor =new Color(5, 5, 5);
			myFont = new Font("Cambria", Font.PLAIN, 20);

			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(myColor);

	        c1 =new Cursor(Cursor.HAND_CURSOR);

	        psetting =new JButton("Profile Setting");
	        psetting.setCursor(c1);
	        psetting.setBounds(10,50,200,45);
	        psetting.setBackground(Color.decode("#112400"));
	        psetting.setForeground(Color.WHITE);
	        psetting.setOpaque(true);
	        psetting.addMouseListener(this);
	        panel.add(psetting);

			pdetails =new JButton("Payment Details");
	        pdetails.setCursor(c1);
	        pdetails.setBounds(10,100,200,45);
	        pdetails.setBackground(Color.decode("#112400"));
	        pdetails.setForeground(Color.WHITE);
	        pdetails.addMouseListener(this);
	        pdetails.setOpaque(true);

	        panel.add(pdetails);

			porder =new JButton("Running order");
	        porder.setCursor(c1);
	        porder.setBounds(10,150,200,45);
	        porder.setBackground(Color.decode("#112400"));
	        porder.setForeground(Color.WHITE);
	        porder.setOpaque(true);
	        porder.addMouseListener(this);
	        panel.add(porder);

			asetting =new JButton("Account Setting");
	        asetting.setCursor(c1);
	        asetting.setBounds(10,200,200,45);
	        asetting.setBackground(Color.decode("#112400"));
	        asetting.setForeground(Color.WHITE);
	        asetting.setOpaque(true);
	        asetting.addMouseListener(this);
	        panel.add(asetting);

			logout =new JButton("Log out");
	        logout.setCursor(c1);
	        logout.setBounds(180,300,90,30);
	        logout.setBackground(Color.decode("#112400"));
	        logout.setForeground(Color.WHITE);
	        logout.setOpaque(true);
	        logout.addMouseListener(this);
	        panel.add(logout);
	        
	        back =new JButton("Back");
	        back.setCursor(c1);
	        back.setBounds(280,300,90,30);
	        back.setBackground(Color.decode("#cf1515"));
	        back.setForeground(Color.WHITE);
	        back.setOpaque(true);
	        back.addMouseListener(this);
	        panel.add(back);

			this.add(panel);
			
			
			back.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                
	                    setVisible(false);
	                    Dashboard f1 = new Dashboard ();
	                    f1.setVisible(true);
	                
	            }
	        });
			logout.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                
	                    setVisible(false);
	                    Frame f1 = new Frame();
	                    f1.setVisible(true);
	                
	            }
	        });
			
			porder.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                
	                    setVisible(false);
	                   Fem5 f1 = new Fem5();
	                    f1.setVisible(true);
	                
	            }
	        });
			
		}
	
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
	    public void mouseEntered(MouseEvent me){
			if(me.getSource()==psetting){
				psetting.setBackground(Color.decode("#002404"));
				
				psetting.setOpaque(true);
			}
	        else if(me.getSource()==pdetails){
				pdetails.setBackground(Color.decode("#002404"));
				
				pdetails.setOpaque(true);
			}
	        else if(me.getSource()==porder){
				porder.setBackground(Color.decode("#002404"));
				
				porder.setOpaque(true);
			}
	        else if(me.getSource()==asetting){
				asetting.setBackground(Color.decode("#002404"));
				
				asetting.setOpaque(true);
			}
	        else if(me.getSource()==logout){
				logout.setBackground(Color.decode("#002404"));
				
				logout.setOpaque(true);
			}
			
	        else if(me.getSource()==back){
				back.setBackground(Color.decode("#771313"));
				
				back.setOpaque(true);
			}

		}
		public void mouseExited(MouseEvent me){
			if(me.getSource()==psetting){
				psetting.setBackground(Color.decode("#112400"));
				
				psetting.setOpaque(true);
			}
	        else if(me.getSource()==pdetails){
				pdetails.setBackground(Color.decode("#112400"));
				
				pdetails.setOpaque(true);
			}
	        else if(me.getSource()==porder){
				porder.setBackground(Color.decode("#112400"));
				
				porder.setOpaque(true);
			}
	        else if(me.getSource()==asetting){
				asetting.setBackground(Color.decode("#112400"));
				
				asetting.setOpaque(true);
			}
	        else if(me.getSource()==logout){
				logout.setBackground(Color.decode("#112400"));
				
				logout.setOpaque(true);
			}
	        else if(me.getSource()==logout){
				back.setBackground(Color.decode("#cf1515"));
				
				back.setOpaque(true);
			}

		}
		

		public static void main(String[] args) {
			
			Fem4 f1=new Fem4();
			f1.setVisible(true);
			
		}
		
}
