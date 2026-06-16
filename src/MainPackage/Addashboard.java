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

public class Addashboard extends JFrame implements ActionListener {

	 Container jcontainer = getContentPane();
		JButton EM = new JButton();
		JButton CM= new JButton();
	    JButton CB = new JButton();
	    JButton logout= new JButton();
	    
	    
	    Addashboard(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Admin Dashboard");
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
			
			ImageIcon bgim = new ImageIcon(this.getClass().getResource("Admin_Dashboard.jpg")); 
			JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
			bg1.setBounds(0, 0, 1080, 768);
			jcontainer.add(bg1);
		    
		    EM.setBounds(45, 435, 285,185);
			EM.setLayout(new FlowLayout());
			EM.setBackground(new Color(179, 218, 255));
			EM.setVerticalAlignment(SwingConstants.CENTER);
			EM.setHorizontalAlignment(SwingConstants.CENTER);
			EM.setFont(new Font("ROBOTO",Font.BOLD,15));
			EM.setContentAreaFilled(false);
			jcontainer.add(EM);
			
			CM.setBounds(397, 435, 285,185);
			CM.setBackground(new Color(179, 218, 255));
			CM.setVerticalAlignment(SwingConstants.CENTER);
			CM.setHorizontalAlignment(SwingConstants.CENTER);
			CM.setFont(new Font("ROBOTO",Font.BOLD,15));
			CM.setContentAreaFilled(false);
			jcontainer.add(CM);
			
			CB.setBounds(750, 437, 285,185);
			CB.setBackground(new Color(179, 218, 255));
			CB.setVerticalAlignment(SwingConstants.CENTER);
			CB.setHorizontalAlignment(SwingConstants.CENTER);
			CB.setFont(new Font("ROBOTO",Font.BOLD,15));
			CB.setContentAreaFilled(false);
			jcontainer.add(CB);
			
			
			logout.setBounds(32, 27, 45,25);
		    logout.setBackground(new Color(179, 218, 255));
			logout.setVerticalAlignment(SwingConstants.CENTER);
			logout.setHorizontalAlignment(SwingConstants.CENTER);
			logout.setFont(new Font("ROBOTO",Font.BOLD,15));
			logout.setContentAreaFilled(false);
			jcontainer.add(logout);
		    
		    
		    
	    }
	
	  private void actionevent() {
		  EM.addActionListener(this);
			CM.addActionListener(this);
			CB.addActionListener(this);
			logout.addActionListener(this);
			
		}
	  public void actionPerformed(ActionEvent e)
		{
		  
		  if(e.getSource()==EM)
			 {
				 this.setVisible(false);
				 
				  EM employee= new EM();
				 employee.setVisible(true);
			 }
			 
			 if(e.getSource()==CM)
			 {
				 this.setVisible(false);
				 
				 CM cus= new CM();
				 cus.setVisible(true);
			 }
			 
			 if(e.getSource()==CB)
			 {
				 this.setVisible(false);
				 
				Billing de= new Billing();
				 de.setVisible(true);
			 }
			 
			 if(e.getSource()== logout)
			 {
				 this.setVisible(false);
				 
				 LoginFrame ad= new LoginFrame();
				 ad.setVisible(true);
				 
			 }
		  
		  
		  
		}
	
	
	
	
	
	
	
	
	
}
