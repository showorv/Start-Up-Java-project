package Frames;



import java.awt.Color;




import javax.swing.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Requir extends JFrame implements ActionListener,MouseListener{
    JLabel text1,text2;
    JTextArea reqBox;
    JButton orderButton,back;
    JPanel panel;
    Color myColor;
    Font myFont,myFont2;
    Cursor c1;

    public Requir(){
        super("your requrirement");
        this.setSize(700,600);
        this.setLocation(500,250);

        myColor =new Color(5, 5, 5);
        myFont =new Font("Cambria", Font.PLAIN, 20);
        myFont2 =new Font("Cambria", Font.PLAIN, 14);

        panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

        text1 = new JLabel("Your requirements : ");
		text1.setBounds(25, 30, 300, 40);
		text1.setBackground(myColor);
		text1.setOpaque(true);
		text1.setForeground(Color.WHITE);
		text1.setFont(myFont);
		panel.add(text1);

        reqBox=new JTextArea();
        reqBox.setBounds(25,75,550,250);
        reqBox.setLineWrap(true);
        reqBox.setFont(myFont2);
        panel.add(reqBox);

        text2 = new JLabel("*Please fill in the requiremnts correctly you cannot make changes after ordering. ");
		text2.setBounds(30, 330, 600, 40);
		text2.setBackground(myColor);
		text2.setOpaque(true);
		text2.setForeground(Color.red);
		text2.setFont(myFont2);
		panel.add(text2);

        c1 =new Cursor(Cursor.HAND_CURSOR);

        orderButton = new JButton("Order ");
		orderButton.setCursor(c1);
		orderButton.setBounds(250, 390, 100, 30);
		orderButton.setBackground(Color.BLUE);
		orderButton.setForeground(Color.WHITE);
		orderButton.setOpaque(true);
        orderButton.addMouseListener(this);
        orderButton.addActionListener(this);
		panel.add(orderButton);

		back =new JButton("Back");
        back.setCursor(c1);
        back.setBounds(370,390,90,30);
        back.setBackground(Color.decode("#cf1515"));
        back.setForeground(Color.WHITE);
        back.setOpaque(true);
        back.addMouseListener(this);
        panel.add(back);

		this.add(panel);


		back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Dashboard f1 = new Dashboard();
                    f1.setVisible(true);
                
            }
        });
		
		orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                
                    setVisible(false);
                    Notification f1 = new Notification();
                    f1.setVisible(true);
                
            }
        });
    
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void actionPerformed(ActionEvent ae){}
	
	public void mouseEntered(MouseEvent me){
		if(me.getSource()==orderButton){
			orderButton.setBackground(Color.decode("#042c58"));
			orderButton.setForeground(Color.WHITE);
			orderButton.setOpaque(true);
		}
		else if(me.getSource() == back)
		{
			back.setBackground(Color.decode("#771313"));
			back.setForeground(Color.WHITE);
		}

	}
	public void mouseExited(MouseEvent me){
		if(me.getSource()==orderButton){
			orderButton.setBackground(Color.BLUE);
			
			
		}
		else if(me.getSource()==back) {
			back.setBackground(Color.decode("#cf1515"));
		}
		
        
    }
	
	
	
	
	
	
public static void main(String[] args) {
		
		Requir f1=new Requir();
		f1.setVisible(true);
		
	}

	
}


