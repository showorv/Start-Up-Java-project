package Frames;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class employee2 extends JFrame implements MouseListener{
    JLabel text1,text2,text3,text4,text5,test6;
    JButton returButton;
    JPanel panel;
    Color myColor;
    Font myFont1,myFont2,myFont3;
    Cursor c1;
 
    
    public employee2()
	{
		super("Employee Details");
		this.setSize(750, 700);
        this.setLocation(450,200);

        myColor =new Color(5, 5, 5);
        myFont1 = new Font("Cambria", Font.PLAIN, 30);
        myFont2 = new Font("Cambria", Font.PLAIN, 15);
        myFont3 = new Font("Cambria", Font.PLAIN, 25);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(myColor);

        text1 =new JLabel("Employee details ");
        text1.setBounds(200,40,300,40);
        text1.setBackground(myColor);
        text1.setForeground(Color.GREEN);
        text1.setOpaque(true);
        text1.setFont(myFont1);
        panel.add(text1);

        text2 =new JLabel("Web Devoloper ");
        text2.setBounds(10,100,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont3);
        panel.add(text2);

        text3 =new JLabel("Name      : Rafat Khan");
        text3.setBounds(10,130,200,40);
        text3.setBackground(myColor);
        text3.setForeground(Color.white);
        text3.setOpaque(true);
        text3.setFont(myFont2);
        panel.add(text3);

        text2 =new JLabel("Experience: 4years");
        text2.setBounds(10,155,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont2);
        panel.add(text2);

        text4 =new JLabel("App developer");
        text4.setBounds(10,240,200,40);
        text4.setBackground(myColor);
        text4.setForeground(Color.white);
        text4.setOpaque(true);
        text4.setFont(myFont3);
        panel.add(text4);

        text3 =new JLabel("Name      : Ahmed ali ");
        text3.setBounds(10,270,200,40);
        text3.setBackground(myColor);
        text3.setForeground(Color.white);
        text3.setOpaque(true);
        text3.setFont(myFont2);
        panel.add(text3);

        text2 =new JLabel("Experience: 3.5years");
        text2.setBounds(10,295,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont2);
        panel.add(text2);
        
        text2 =new JLabel("Digital marketing");
        text2.setBounds(10,360,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont3);
        panel.add(text2);

        text3 =new JLabel("Name      : Mahmud Hassan Alfi");
        text3.setBounds(10,385,250,40);
        text3.setBackground(myColor);
        text3.setForeground(Color.white);
        text3.setOpaque(true);
        text3.setFont(myFont2);
        panel.add(text3);

        text2 =new JLabel("Experience: 3.5years");
        text2.setBounds(10,410,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont2);
        panel.add(text2);

        text2 =new JLabel("Graphics deginer ");
        text2.setBounds(420,100,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont3);
        panel.add(text2);

        text3 =new JLabel("Name      :Abid Hossain");
        text3.setBounds(420,130,200,40);
        text3.setBackground(myColor);
        text3.setForeground(Color.white);
        text3.setOpaque(true);
        text3.setFont(myFont2);
        panel.add(text3);


        text2 =new JLabel("Experience: 4years");
        text2.setBounds(420,155,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont2);
        panel.add(text2);


        text4 =new JLabel("video Editor");
        text4.setBounds(420,240,200,40);
        text4.setBackground(myColor);
        text4.setForeground(Color.white);
        text4.setOpaque(true);
        text4.setFont(myFont3);
        panel.add(text4);

        text3 =new JLabel("Name      :Rizbi kobir ");
        text3.setBounds(420,270,200,40);
        text3.setBackground(myColor);
        text3.setForeground(Color.white);
        text3.setOpaque(true);
        text3.setFont(myFont2);
        panel.add(text3);

        text2 =new JLabel("Experience: 3.5years");
        text2.setBounds(420,295,200,40);
        text2.setBackground(myColor);
        text2.setForeground(Color.white);
        text2.setOpaque(true);
        text2.setFont(myFont2);
        panel.add(text2);

        c1=new Cursor(Cursor.HAND_CURSOR);

        returButton=new JButton("Return");
            returButton.setCursor(c1);
            returButton.setBounds(250, 500, 100, 25);
            returButton.setBackground(Color.blue);
            returButton.setForeground(Color.WHITE);
            returButton.setOpaque(true);
            returButton.addMouseListener(this);
            panel.add(returButton);

        this.add(panel);
        
        
        returButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Menu f1 = new Menu();
                    f1.setVisible(true);
                
            }
        });
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void actionPerformed(ActionEvent ae){}

	
	public void mouseEntered(MouseEvent me){
		
        if(me.getSource()==returButton){
			returButton.setBackground(Color.blue);
			returButton.setForeground(Color.WHITE);
			returButton.setOpaque(true);
		}
    }
    public void mouseExited(MouseEvent me){
		if(me.getSource()==returButton){
			returButton.setBackground(Color.blue);
			returButton.setForeground(Color.WHITE);
			returButton.setOpaque(true);
		}
}
	
public static void main(String[] args) {
		
	employee2 f1=new employee2();
		f1.setVisible(true);
		
	}
}

