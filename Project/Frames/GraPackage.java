package Frames;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;




public class GraPackage extends JFrame implements MouseListener {
	
	JPanel panel, panel2,panel3,panel4;
	Color bgcolor, bg2,b2c;
	
	JTextField name;
	JLabel box1,box2,box3,text,text2,text3,text4,text5,t6,t7,t8,t9,t10,tt;
	JPasswordField pass;
	
	JButton b1, b2,back;
	Font myFont,myFont2,myFont3,myFont4;
	ImageIcon img,img2,img3,img4;
	Cursor cursor;
	
	
	public GraPackage() {
		
		super("Packages");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		b2c=new Color(66, 135, 245);
		myFont2 = new Font("Cambria", Font.PLAIN, 20);
		myFont3 = new Font("Cambria", Font.BOLD, 18);
		myFont4 = new Font("Cambria", Font.PLAIN, 14);
		
		img= new ImageIcon(getClass().getResource("/Images/white.jpg"));
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		
		this.add(panel);
		
		
		tt= new JLabel("Select Package:");
		tt.setBounds(110,60,200,40);
		tt.setForeground(Color.WHITE);
		tt.setFont(myFont3);
		panel.add(tt);
		
		
		text= new JLabel("Basic");
		text.setBounds(110,110,100,40);
		text.setForeground(Color.BLACK);
		panel.add(text);
		
		text2= new JLabel("US$30");
		text2.setBounds(310,110,100,40);
		text2.setForeground(Color.BLACK);
		text2.setFont(myFont2);
		panel.add(text2);
		
		text3= new JLabel("1 Premuim deisgn or redesign, Photoshop,  ");
		text3.setBounds(110,160,275,40);
		text3.setForeground(Color.BLACK);
		text3.setFont(myFont4);
		panel.add(text3);
		
		text4= new JLabel(" Illustrator work, JPG ,PDF,PNG + Source file ");
		text4.setBounds(110,180,275,40);
		text4.setForeground(Color.BLACK);
		text4.setFont(myFont4);
		panel.add(text4);
		
		text5= new JLabel("3-day delivery ");
		text5.setBounds(160,220,275,40);
		text5.setForeground(Color.BLACK);
		text5.setFont(myFont3);
		panel.add(text5);
		
		b1=new JButton("Continue");
		b1.setBounds(140,300,200,30);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setFont(myFont2);
		b1.addMouseListener(this);
		b1.setCursor(cursor);
		panel.add(b1);
		
		t6= new JLabel("Premium");
		t6.setBounds(410,110,100,40);
		t6.setForeground(Color.BLACK);
		panel.add(t6);
		
		t7= new JLabel("US$55");
		t7.setBounds(600,110,100,40);
		t7.setForeground(Color.BLACK);
		t7.setFont(myFont2);
		panel.add(t7);
		
		t8= new JLabel("2 Premuim deisgn or redesign, Photoshop,");
		t8.setBounds(410,160,275,40);
		t8.setForeground(Color.BLACK);
		t8.setFont(myFont4);
		panel.add(t8);
		
		t9= new JLabel("Illustrator work, JPG ,PDF,PNG + Source file ");
		t9.setBounds(410,180,275,40);
		t9.setForeground(Color.BLACK);
		t9.setFont(myFont4);
		panel.add(t9);
		
		t10= new JLabel("7-day delivery ");
		t10.setBounds(460,220,275,40);
		t10.setForeground(Color.BLACK);
		t10.setFont(myFont3);
		panel.add(t10);
		
		b2=new JButton("Continue");
		b2.setBounds(440,300,200,30);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setFont(myFont2);
		b2.addMouseListener(this);
		b2.setCursor(cursor);
		panel.add(b2);
		
		
		box1= new JLabel(img);
		box1.setBounds(100,100,280,280);
		box1.setBackground(Color.WHITE);
		
		panel.add(box1);
		
		box2= new JLabel(img);
		box2.setBounds(400,100,280,280);
		box2.setBackground(Color.WHITE);
		
		panel.add(box2);
		
		back =new JButton("Back");
        back.setCursor(cursor);
        back.setBounds(600,400,90,30);
        back.setBackground(Color.decode("#cf1515"));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addMouseListener(this);
        panel.add(back);

		this.add(panel);
		
		
		back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    GraDash f1 = new GraDash();
                    f1.setVisible(true);
                
            }
        });
		
		b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Requir f1 = new Requir();
                    f1.setVisible(true);
                
            }
        });
		
		b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Requir f1 = new Requir();
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
			b1.setBackground(Color.gray);
			b1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.gray);
			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == back)
		{
			back.setBackground(Color.decode("#771313"));
			back.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == b1)
		{
			b1.setBackground(Color.BLACK);
			b1.setForeground(Color.WHITE);
		}
		else if(me.getSource() == b2)
		{
			b2.setBackground(Color.BLACK);			b2.setForeground(Color.WHITE);
		}
		else if(me.getSource() == back)
		{
			back.setBackground(Color.decode("#cf1515"));			b2.setForeground(Color.WHITE);
		}
		else
		{
			
		}
	}
	
	
public static void main(String[] args) {
		
		GraPackage f1=new GraPackage();
		f1.setVisible(true);
		
	}
	
	
}
