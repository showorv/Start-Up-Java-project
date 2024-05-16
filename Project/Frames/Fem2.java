package Frames;
import java.awt.Color;

import javax.swing.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Classes.*;

public class Fem2 extends JFrame implements ActionListener,MouseListener{
    JLabel firstnamelbl,surnamelbl,phoneormaillbl,passlbl,repasslbl,dbirthlbl,genderlbl,text1,text2;
	JTextField firstnameTF,surnameTF,phoneormaillTF,dbirthTF,genderTF;
	JPasswordField passPF,repassTF;
	JCheckBox male,female,others;
	ButtonGroup bGroup;
    JButton signButton,back;
	JPanel panel;
	Color myColor;
	Font myFont,font2,myFont2;
	Cursor c1;
	
	public Fem2()
	{
		super("create your account");
		this.setSize(840,600);
        this.setLocation(500,250);

		
		myColor =new Color(5, 5, 5);
		myFont = new Font("Cambria", Font.PLAIN, 15);
		myFont2 = new Font("Cambria", Font.BOLD, 15);
        font2 = new Font("Cambria", Font.PLAIN, 30);

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

        text2 = new JLabel("It's quick and easy ");
		text2.setBounds(50, 50, 350, 30);
		text2.setBackground(Color.GRAY);
		text2.setOpaque(false);
		text2.setForeground(Color.WHITE);
		text2.setFont(myFont);
		panel.add(text2);

        text1 = new JLabel("Sign Up ");
		text1.setBounds(50, 10, 160, 40);
		text1.setBackground(myColor);
		text1.setOpaque(true);
		text1.setForeground(Color.GREEN);
		text1.setFont(font2);
		panel.add(text1);
			
		firstnamelbl = new JLabel("Your Name : ");
		firstnamelbl.setBounds(50, 100, 160, 30);
		firstnamelbl.setBackground(Color.GRAY);
		firstnamelbl.setOpaque(false);
		firstnamelbl.setForeground(Color.WHITE);
		firstnamelbl.setFont(myFont);
		panel.add(firstnamelbl);
	
	    firstnameTF = new JTextField();
		firstnameTF.setBounds(50, 130, 250, 30);
		firstnameTF.setBackground(Color.WHITE);
		panel.add(firstnameTF);
	
		surnamelbl = new JLabel("username : ");
		surnamelbl.setBounds(330, 100, 160, 40);
		surnamelbl.setBackground(Color.GRAY);
		surnamelbl.setOpaque(false);
		surnamelbl.setForeground(Color.WHITE);
		surnamelbl.setFont(myFont);
		panel.add(surnamelbl);
	
	    surnameTF = new JTextField();
		surnameTF.setBounds(330, 130, 250, 30);
		surnameTF.setBackground(Color.WHITE);
		panel.add(surnameTF);
		
		genderlbl =new JLabel("Gender :");
		genderlbl.setBounds(50, 170, 300, 40);
		genderlbl.setBackground(Color.GRAY);
		genderlbl.setOpaque(false);
		genderlbl.setForeground(Color.WHITE);
		genderlbl.setFont(myFont);
		panel.add(genderlbl);


        male=new JCheckBox("male");
        male.setBounds(130, 180, 60, 30);
        panel.add(male);

        female=new JCheckBox("female");
        female.setBounds(190, 180, 80, 30);
        panel.add(female);

        others=new JCheckBox("others");
        others.setBounds(266, 180, 100, 30);
        panel.add(others);

		bGroup =new ButtonGroup();
		bGroup.add(male);
		bGroup.add(female);
		bGroup.add(others);

        dbirthlbl = new JLabel("Date of Birth");
		dbirthlbl.setBounds(50, 220, 350, 35);
		dbirthlbl.setBackground(Color.GRAY);
		dbirthlbl.setOpaque(false);
		dbirthlbl.setForeground(Color.WHITE);
		dbirthlbl.setFont(myFont);
		panel.add(dbirthlbl);

        dbirthTF = new JTextField();
		dbirthTF.setBounds(50, 250, 400, 30);
		dbirthTF.setBackground(Color.WHITE);
		panel.add(dbirthTF);

        phoneormaillbl =new JLabel("Phone or email : ");
		phoneormaillbl.setBounds(50, 280, 300, 40);
		phoneormaillbl.setBackground(Color.GRAY);
		phoneormaillbl.setOpaque(false);
		phoneormaillbl.setForeground(Color.WHITE);
		phoneormaillbl.setFont(myFont);
		panel.add(phoneormaillbl);

		phoneormaillTF = new JTextField();
		phoneormaillTF.setBounds(50, 315, 530, 30);
		phoneormaillTF.setBackground(Color.WHITE);
		panel.add(phoneormaillTF);

		passlbl =new JLabel("New Password:");
		passlbl.setBounds(50, 340, 160, 40);
		passlbl.setBackground(Color.GRAY);
		passlbl.setOpaque(false);
		passlbl.setForeground(Color.WHITE);
		passlbl.setFont(myFont);
		panel.add(passlbl);

        passPF = new JPasswordField();
		passPF.setBounds(50, 376, 530, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);

        repasslbl =new JLabel("Re-write Password:");
		repasslbl.setBounds(50, 400, 300, 40);
		repasslbl.setBackground(Color.GRAY);
		repasslbl.setOpaque(false);
		repasslbl.setForeground(Color.WHITE);
		repasslbl.setFont(myFont);
		panel.add(repasslbl);

        repassTF = new JPasswordField();
		repassTF.setBounds(50, 435, 530, 30);
		repassTF.setEchoChar('*');
		panel.add(repassTF);
		

		c1 =new Cursor(Cursor.HAND_CURSOR);
		
		signButton = new JButton("Create Account");
		signButton.setCursor(c1);
		signButton.setBounds(280, 500, 140, 30);
		signButton.setBackground(Color.GREEN);
		signButton.setForeground(Color.BLACK);
		signButton.setOpaque(true);
		signButton.addMouseListener(this);
		signButton.addActionListener(this);
		panel.add(signButton);
		
		back =new JButton("Back");
        back.setCursor(c1);
        back.setBounds(440,500,90,30);
        back.setBackground(Color.decode("#cf1515"));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addMouseListener(this);
        back.addActionListener(this);
        panel.add(back);
	    this.add(panel);
    }
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	
	
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==signButton){
			signButton.setBackground(Color.decode("#345d14"));
			
			signButton.setOpaque(true);
		}
		else if(me.getSource() == back)
		{
			back.setBackground(Color.decode("#771313"));
			back.setForeground(Color.WHITE);
		}

	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==signButton){
			signButton.setBackground(Color.GREEN);
			signButton.setForeground(Color.BLACK);
			signButton.setOpaque(true);
		}
		else if(me.getSource() == back)
		{
			back.setBackground(Color.decode("#cf1515"));
		}

	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String a2=surnameTF.getText();
		String a3=passPF.getText();	
		
		
	
		
		
		if(ae.getSource()==signButton)
		{
			if(a2.isEmpty()||a3.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Fill Up All");
			}
			else{
				
				Account acc=new Account(a2,a3);
				acc.addAccount();
				
			JOptionPane.showMessageDialog(this,"Sucessfully registered");
			this.setVisible(false);
			Frame f1=new Frame();
			f1.setVisible(true);
			
			}
		}
		else if(ae.getSource()==back)
		{	this.setVisible(false);
			Frame f1=new Frame();
			f1.setVisible(true);
			
		}
	}
	

	
	
}
