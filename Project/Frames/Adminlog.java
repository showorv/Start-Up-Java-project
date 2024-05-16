package Frames;



import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Adminlog extends JFrame implements MouseListener,ActionListener {

    JPanel panel;
    Color bgcolor, bg2;

    JTextField name;
    JLabel text, text2, text3, nameLabel, passLabel;
    JPasswordField pass;

    JCheckBox c1, c2, c3;
    JButton loginBtn, signup, exitBtn, forgot;
    Font myFont, myFont2;
    Cursor cursor;

    public Adminlog() {

        super("My first App");
        this.setSize(840, 600);
        this.setLocation(500, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bgcolor = new Color(5, 5, 5);
        bg2 = new Color(18, 29, 74);
        myFont = new Font("Cambria", Font.PLAIN, 28);
        myFont2 = new Font("Cambria", Font.BOLD, 28);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(bgcolor);
        this.add(panel);
        text = new JLabel("WELCOME TO");

        text.setBounds(300, 80, 500, 30);
        text.setForeground(Color.white);
        text.setFont(myFont);
        panel.add(text);

        text2 = new JLabel(" INVENTIVESKILL");

        text2.setBounds(270, 105, 500, 30);
        text2.setForeground(Color.GREEN);
        text2.setFont(myFont2);
        panel.add(text2);

        nameLabel = new JLabel("Username:");
        nameLabel.setBounds(130, 175, 100, 30);
        nameLabel.setForeground(Color.white);
        nameLabel.setToolTipText("Enter your name");
        panel.add(nameLabel);

        name = new JTextField();
        name.setBounds(205, 175, 400, 25);
        name.setToolTipText("Enter your name");
        panel.add(name);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(130, 205, 100, 30);
        passLabel.setForeground(Color.white);
        panel.add(passLabel);

        pass = new JPasswordField();
        pass.setBounds(205, 205, 400, 25);
        pass.setToolTipText("Enter your Password");
        panel.add(pass);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        loginBtn = new JButton("Login");
        loginBtn.setBounds(340, 255, 80, 30);
        loginBtn.setBackground(Color.BLUE);
        loginBtn.setForeground(Color.white);
        loginBtn.addMouseListener(this);
       loginBtn.addActionListener(this);
        loginBtn.setCursor(cursor);
        panel.add(loginBtn);
        
        

      

        
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
        if (me.getSource() == loginBtn) {
            loginBtn.setBackground(bg2);
            loginBtn.setForeground(Color.WHITE);
        }

        else {

        }
    }

    public void mouseExited(MouseEvent me) {
        if (me.getSource() == loginBtn) {
            loginBtn.setBackground(Color.BLUE);
            loginBtn.setForeground(Color.WHITE);
        }

       else{

       }
    }

    
        
      
        public void actionPerformed(ActionEvent ae) {
            String username=name.getText();
            String password=pass.getText();

            if(username.equals("admin")&& password.equals("admin"))
            {
                JOptionPane.showMessageDialog(null, "Successfull");

                admin_panel f1= new admin_panel();
                f1.setVisible(true);
                this.setVisible(false);
            }

            else{
                JOptionPane.showMessageDialog(null, "Wrong password or username");
            }
        }
    ;

   

    
}