package MainPackage;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EM extends JFrame implements ActionListener {

	 Container jcontainer = getContentPane();
		JButton add = new JButton();
		JButton show= new JButton();
	    JButton delete = new JButton();
	    JButton Home= new JButton();
	    
	    
	    EM(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Employee Management Window");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 intial();
			 actionevent();
	 }
	    

	

	public void intial(){
	    	
		   jcontainer.setLayout(null);
		    jcontainer.setBackground(new Color(230, 249, 254));
			
			ImageIcon bgim = new ImageIcon(this.getClass().getResource("Employee_managment.jpg")); 
			JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
			bg1.setBounds(0, 0, 1080, 768);
			jcontainer.add(bg1);
		    
		    add.setBounds(62, 642, 240,50);
			add.setLayout(new FlowLayout());
			add.setBackground(new Color(179, 218, 255));
			add.setVerticalAlignment(SwingConstants.CENTER);
			add.setHorizontalAlignment(SwingConstants.CENTER);
			add.setFont(new Font("ROBOTO",Font.BOLD,15));
			add.setContentAreaFilled(false);
			jcontainer.add(add);
			
			show.setBounds(419, 642, 240,50);
			show.setBackground(new Color(179, 218, 255));
			show.setVerticalAlignment(SwingConstants.CENTER);
			show.setHorizontalAlignment(SwingConstants.CENTER);
			show.setFont(new Font("ROBOTO",Font.BOLD,15));
			show.setContentAreaFilled(false);
			jcontainer.add(show);
			
			delete.setBounds(772, 642, 240,50);
			delete.setBackground(new Color(179, 218, 255));
			delete.setVerticalAlignment(SwingConstants.CENTER);
			delete.setHorizontalAlignment(SwingConstants.CENTER);
			delete.setFont(new Font("ROBOTO",Font.BOLD,15));
			delete.setContentAreaFilled(false);
			jcontainer.add(delete);
			
			Home.setBounds(45, 24, 35,30);
		    Home.setBackground(new Color(179, 218, 255));
			Home.setVerticalAlignment(SwingConstants.CENTER);
			Home.setHorizontalAlignment(SwingConstants.CENTER);
			Home.setFont(new Font("ROBOTO",Font.BOLD,15));
			Home.setContentAreaFilled(false);
			jcontainer.add(Home);
}
	
	private void actionevent() {
		  add.addActionListener(this);
			show.addActionListener(this);
			delete.addActionListener(this);
			Home.addActionListener(this);
			
		}
	 public void actionPerformed(ActionEvent e)
		{
		 if(e.getSource()==add)
		 {
			 this.setVisible(false);
			 
			 employeeop add= new employeeop();
			 add.setVisible(true);
		 }
		 
		 if(e.getSource()==show)
		 {
			 this.setVisible(false);
			 
			 ShowEmployee se= new ShowEmployee();
			 se.setVisible(true);
		 }
		 
		 if(e.getSource()==delete)
		 {
			 this.setVisible(false);
			 
			DeleteEmployee de= new DeleteEmployee();
			 de.setVisible(true);
		 }
		 
		 if(e.getSource()== Home)
		 {
			 this.setVisible(false);
			 Addashboard ad= new Addashboard();
			 ad.setVisible(true);
			 
		 }
		 
		 
		 
		}
	
	
	
	
	
	
	
	
}