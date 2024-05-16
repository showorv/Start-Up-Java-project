package Frames;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements MouseListener  {
	JButton privacyButton,EmploymeneButton,reviewsButton,back,inviteButton;
	JPanel panel;
	Color myColor;
	Font myFont;
	Cursor c1;
		
	public Menu()
		{
			super("menu");
			this.setSize(550, 400);
	        this.setLocation(500,250);

			
			myColor =new Color(5, 5, 5);
			myFont = new Font("Cambria", Font.PLAIN, 20);

			panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(myColor);

	        c1 =new Cursor(Cursor.HAND_CURSOR);

	        privacyButton =new JButton("Privacy");
	        privacyButton.setCursor(c1);
	        privacyButton.setBounds(10,50,200,45);
	        privacyButton.setBackground(Color.decode("#112400"));
	        privacyButton.setForeground(Color.WHITE);
	        privacyButton.setOpaque(true);
	        privacyButton.addMouseListener(this);
	        panel.add(privacyButton);

			EmploymeneButton =new JButton("Employee Details");
	        EmploymeneButton.setCursor(c1);
	        EmploymeneButton.setBounds(10,100,200,45);
	        EmploymeneButton.setBackground(Color.decode("#112400"));
	        EmploymeneButton.setForeground(Color.WHITE);
	        EmploymeneButton.addMouseListener(this);
	        EmploymeneButton.setOpaque(true);
            panel.add(EmploymeneButton);

			reviewsButton =new JButton("Reviews");
	        reviewsButton.setCursor(c1);
	        reviewsButton.setBounds(10,150,200,45);
	        reviewsButton.setBackground(Color.decode("#112400"));
	        reviewsButton.setForeground(Color.WHITE);
	        reviewsButton.setOpaque(true);
	        reviewsButton.addMouseListener(this);
	        panel.add(reviewsButton);

			inviteButton =new JButton("invite Friends");
	        inviteButton.setCursor(c1);
	        inviteButton.setBounds(10,200,200,45);
	        inviteButton.setBackground(Color.decode("#112400"));
	        inviteButton.setForeground(Color.WHITE);
	        inviteButton.setOpaque(true);
	        inviteButton.addMouseListener(this);
	        panel.add(inviteButton);
	        
	        back =new JButton("Back");
	        back.setCursor(c1);
	        back.setBounds(150,250,90,30);
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
			
			EmploymeneButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {
	                
	                    setVisible(false);
	                   employee2 f1 = new  employee2 ();
	                    f1.setVisible(true);
	                
	            }
	        });
		}
	
		public void mouseClicked(MouseEvent me){}
		public void mousePressed(MouseEvent me){}
		public void mouseReleased(MouseEvent me){}
	    public void mouseEntered(MouseEvent me){
			if(me.getSource()==privacyButton){
				privacyButton.setBackground(Color.decode("#002404"));
				
				privacyButton.setOpaque(true);
			}
	        else if(me.getSource()==EmploymeneButton){
				EmploymeneButton.setBackground(Color.decode("#002404"));
				
				EmploymeneButton.setOpaque(true);
			}
	        else if(me.getSource()==reviewsButton){
				reviewsButton.setBackground(Color.decode("#002404"));
				
				reviewsButton.setOpaque(true);
			}
	        else if(me.getSource()==inviteButton){
				inviteButton.setBackground(Color.decode("#002404"));
				
				inviteButton.setOpaque(true);
			}
	        else if(me.getSource() == back)
			{
				back.setBackground(Color.decode("#771313"));
				back.setForeground(Color.WHITE);
			}
	        
		}
		public void mouseExited(MouseEvent me){
			if(me.getSource()==privacyButton){
				privacyButton.setBackground(Color.decode("#112400"));
				
				privacyButton.setOpaque(true);
			}
	        else if(me.getSource()==EmploymeneButton){
				EmploymeneButton.setBackground(Color.decode("#112400"));
				
				EmploymeneButton.setOpaque(true);
			}
	        else if(me.getSource()==reviewsButton){
				reviewsButton.setBackground(Color.decode("#112400"));
				
				reviewsButton.setOpaque(true);
			}
	        else if(me.getSource()==inviteButton){
				inviteButton.setBackground(Color.decode("#112400"));
				
				inviteButton.setOpaque(true);
			}
	        else if(me.getSource()==back) {
				back.setBackground(Color.decode("#cf1515"));
			}
			

        }
		
		
		public static void main(String[] args) {
			
			Menu f1=new Menu();
			f1.setVisible(true);
			
		}
    }

