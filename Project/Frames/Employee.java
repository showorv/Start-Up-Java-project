package Frames;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Employee extends JFrame implements ActionListener{
	JPanel panel;
	Color bgcolor, bg2;
	
	JTextField name,a1,a2,a3,a4,a5,a6;
	JLabel text,text2 ,text3,nameLabel, passLabel,b1,b2,b3,b4,b5,b6;
	JPasswordField pass;
	
	DefaultTableModel model;
	JButton d1,d2,d3,d4;
	Font myFont,myFont2,myFont3;
	Cursor cursor;
	
	JTable table;
	JScrollPane scroll;
	String[] cols= {"Serial","Name","Work at","Contact Num","Address","Portfolio"};	
	String[] rows= new String[6];
	
	
	public Employee() {
		
		super("My first App");
		this.setSize(840,600);
		this.setLocation(500,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bgcolor=new Color(5, 5, 5);
		bg2=new Color(18, 29, 74);
		myFont = new Font("Cambria", Font.PLAIN, 25);
		myFont2 = new Font("Cambria", Font.BOLD, 28);
		myFont3 = new Font("Cambria", Font.BOLD, 17);
		
		panel= new JPanel();
		panel.setLayout(null);
		panel.setBackground(bgcolor);
		
		this.add(panel);
		
		
		text2=new JLabel("Employee Details");
		text2.setBounds(330,10,200,50);
		text2.setForeground(Color.white);
		text2.setFont(myFont);
		
		panel.add(text2);
		
		table= new JTable();
		table.setSelectionBackground(Color.gray);
		table.setRowHeight(30);
		
		
		scroll =new JScrollPane(table);
		scroll.setBounds(50,60,700,200);
		panel.add(scroll);
		
		model = new DefaultTableModel();
		model.setColumnIdentifiers(cols);
		table.setModel(model);
		
	    b1=new JLabel("Serial:");
		b1.setBounds(30,300,100,30);
		b1.setForeground(Color.white);
		
		panel.add(b1);
		
		
		a1=new JTextField();
		a1.setBounds(90,305,300,20);
	
		panel.add(a1);
		
		 b2=new JLabel("Name:");
			b2.setBounds(30,330,100,30);
			b2.setForeground(Color.white);
			
			panel.add(b2);
		
			a2=new JTextField();
			a2.setBounds(90,335,300,20);
			
			panel.add(a2);
			
			 b3=new JLabel("Work at:");
				b3.setBounds(30,360,100,30);
				b3.setForeground(Color.white);
				
				panel.add(b3);
				
				a3=new JTextField();
				a3.setBounds(90,365,300,20);
				
				panel.add(a3);
				
				b4=new JLabel("Contact:");
				b4.setBounds(30,390,100,30);
				b4.setForeground(Color.white);
				
				panel.add(b4);
				
				a4=new JTextField();
				a4.setBounds(90,395,300,20);
				
				panel.add(a4);
				
				b5=new JLabel("Address:");
				b5.setBounds(30,420,100,30);
				b5.setForeground(Color.white);
				
				panel.add(b5);
			
				a5=new JTextField();
				a5.setBounds(90,425,300,20);
				
				panel.add(a5);
				
				b6=new JLabel("Portfolio:");
				b6.setBounds(30,450,100,30);
				b6.setForeground(Color.white);
				
				panel.add(b6);
			
				a6=new JTextField();
				a6.setBounds(90,455,300,20);
				
				panel.add(a6);
				
				d1=new JButton("Add ");
				d1.setBounds(30,490,80,30);
				d1.setBackground(Color.decode("#226cbe"));
				d1.setForeground(Color.white);
				d1.setFont(myFont3);
				d1.setBorder(new EtchedBorder(100));
				d1.setCursor(cursor);
				
				panel.add(d1);
				
				d3=new JButton("Update ");
				d3.setBounds(120,490,100,30);
				d3.setBackground(Color.decode("#226cbe"));
				d3.setForeground(Color.white);
				d3.setFont(myFont3);
				d3.setBorder(new EtchedBorder(100));
				d3.setCursor(cursor);
				
				panel.add(d3);
				
				d2=new JButton("Delete");
				d2.setBounds(230,490,100,30);
				d2.setBackground(Color.decode("#226cbe"));
				d2.setForeground(Color.white);
				d2.setFont(myFont3);
				d2.setBorder(new EtchedBorder(100));
				d2.setCursor(cursor);
				
				panel.add(d2);
				
				d4=new JButton("Back");
				d4.setBounds(335,490,100,30);
				d4.setBackground(Color.decode("#226cbe"));
				d4.setForeground(Color.white);
				d4.setFont(myFont3);
				d4.setBorder(new EtchedBorder(100));
				d4.setCursor(cursor);
				
				panel.add(d4);
				
				table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent me) {
						int numberofrow=table.getSelectedRow();
						String b1= model.getValueAt(numberofrow, 0).toString();
						String b2= model.getValueAt(numberofrow, 1).toString();
						String b3= model.getValueAt(numberofrow, 2).toString();
						String b4= model.getValueAt(numberofrow, 3).toString();
						String b5= model.getValueAt(numberofrow, 4).toString();
						String b6= model.getValueAt(numberofrow, 5).toString();
						
						a1.setText(b1);
						a2.setText(b2);
						a3.setText(b3);
						a4.setText(b4);
						a5.setText(b5);
						a6.setText(b6);
					}
				});
				
				d1.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent ae) {
		                
		                    if(ae.getSource()==d1) {
		                    	rows[0]=a1.getText();
		                    	rows[1]=a2.getText();
		                    	rows[2]=a3.getText();
		                    	rows[3]=a4.getText();
		                    	rows[4]=a5.getText();
		                    	
		                    	model.addRow(rows);
		                    }
		                
		            }
		        });
				
				
				d2.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent ae) {
		                
		                    if(ae.getSource()==d2) {
		                    	int numberofrow= table.getSelectedRow();
		                    	
		                    	if(numberofrow>=0) {
		                    		model.removeRow(numberofrow);
		                    		
		                    	}
		                    	
		                    	else {
		                    		JOptionPane.showMessageDialog(null,"No row selected");
		                    	}
		                    	
		                    }
		                
		            }
		        });
				
				d3.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent ae) {
		                
		                    if(ae.getSource()==d3) {
		                    	int numberofrow= table.getSelectedRow();
		                    	
		                    	String b1= a1.getText();
		                    	String b2= a2.getText();
		                    	String b3= a3.getText();
		                    	String b4= a4.getText();
		                    	String b5= a5.getText();
		                    	String b6= a6.getText();
		                    	
		                    	model.setValueAt(b1, numberofrow, 0);
		                    	model.setValueAt(b2, numberofrow, 1);
		                    	model.setValueAt(b3, numberofrow, 2);
		                    	model.setValueAt(b4, numberofrow, 3);
		                    	model.setValueAt(b5, numberofrow, 4);
		                    	model.setValueAt(b6, numberofrow, 5);
		                    	
		                    }
		                
		            }
		        });
				
				
				d4.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent ae) {
		                
		                    setVisible(false);
		                    admin_panel f1 = new admin_panel();
		                    f1.setVisible(true);
		                
		            }
		        });
				
				
				
	}
public static void main(String[] args) {
		
	Employee f1=new Employee();
		f1.setVisible(true);
		
	}
@Override
public void actionPerformed(ActionEvent e) {

	
}
	
}
