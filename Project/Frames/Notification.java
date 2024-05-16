package Frames;





import java.awt.event.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Notification extends JFrame implements ActionListener,MouseListener{
    JLabel text1,text2;
    JButton returButton;
    JPanel panel;
    Color myColor;
    Font myFont1,myFont2;
    Cursor c1;
 
    public Notification(){

        super("Notification");
			this.setSize(450, 230);
	        this.setLocation(500,250);

			
			myColor =new Color(5, 5, 5);
			myFont1 = new Font("Cambria", Font.PLAIN, 15);
            myFont2 = new Font("Cambria", Font.PLAIN, 20);
           
            panel = new JPanel();
            panel.setLayout(null);
            panel.setBackground(myColor);
    

            text1 =new JLabel("We rechived your order ");
            text1.setBounds(10,40,300,40);
            text1.setBackground(myColor);
            text1.setForeground(Color.WHITE);
            text1.setOpaque(true);
            text1.setFont(myFont1);
            panel.add(text1);

            text2 =new JLabel("Thanks for choosing us! ");
            text2.setBounds(10,70,300,40);
            text2.setBackground(myColor);
            text2.setForeground(Color.WHITE);
            text2.setOpaque(true);
            text2.setFont(myFont2);
            panel.add(text2);

            c1=new Cursor(Cursor.HAND_CURSOR);

            returButton=new JButton("Return");
            returButton.setCursor(c1);
            returButton.setBounds(250, 130, 80, 25);
            returButton.setBackground(Color.RED);
            returButton.setForeground(Color.WHITE);
            returButton.setOpaque(true);
            returButton.addMouseListener(this);
            panel.add(returButton);

            this.add(panel);
            
            
            
            returButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    
                        setVisible(false);
                        Dashboard f1 = new   Dashboard();
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
			returButton.setForeground(Color.gray);
			returButton.setOpaque(true);
		}
    }
    public void mouseExited(MouseEvent me){
		if(me.getSource()==returButton){
			returButton.setBackground(Color.RED);
			returButton.setForeground(Color.WHITE);
			returButton.setOpaque(true);
		}
}
public static void main(String[] args) {
		
		Notification f1=new Notification();
		f1.setVisible(true);
		
	}

}