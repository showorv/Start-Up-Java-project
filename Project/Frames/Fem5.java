package Frames;
import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Fem5 extends JFrame {
    JLabel text1,text2,text3,text4;
    JButton b1,back;
    JPanel panel;
    Color myColor;
    Font myFont,myFont2;
    Cursor c1;   
    
    public Fem5()
	{
		super("details");
		this.setSize(550, 400);
        this.setLocation(500,250);

		
		myColor =new Color(5, 5, 5);
		myFont = new Font("Cambria", Font.BOLD, 25);
		myFont2 = new Font("Cambria", Font.PLAIN, 20);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);
        this.add(panel);

        text1 =new JLabel("Order details:");
        text1.setBounds(20,60,200,50);
        text1.setForeground(Color.WHITE);
        text1.setFont(myFont);
        panel.add(text1);
        
        text2 =new JLabel("Order Catagory:");
        text2.setBounds(60,100,200,50);
        text2.setForeground(Color.WHITE);
        text2.setFont(myFont2);
        panel.add(text2);
        
        text3 =new JLabel("Package Name:");
        text3.setBounds(60,130,200,50);
        text3.setForeground(Color.WHITE);
        text3.setFont(myFont2);
        panel.add(text3);
        
        text4 =new JLabel("Package Price:");
        text4.setBounds(60,160,200,50);
        text4.setForeground(Color.WHITE);
        text4.setFont(myFont2);
        panel.add(text4);


        b1 =new JButton("Payment");
        b1.setBounds(170,280,90,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        panel.add(b1);


    	back =new JButton("Back");
        back.setCursor(c1);
        back.setBounds(270,280,90,30);
        back.setBackground(Color.decode("#cf1515"));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
//        back.addMouseListener(this);
        panel.add(back);

      
        
        
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                   Fem4 f1 = new Fem4();
                    f1.setVisible(true);
                
            }
        });
		

        }
    
    
    
    
    
    
public static void main(String[] args) {
		
		Fem5 f1=new Fem5();
		f1.setVisible(true);
		
	}
	
	
    
    
     }
