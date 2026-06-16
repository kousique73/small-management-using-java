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



 class NavigationWindow extends JFrame implements ActionListener {

	 Container jcontainer = getContentPane();
		JButton room = new JButton();
		JButton as= new JButton();
	    JButton os = new JButton();
	    JButton wa= new JButton();
	    JButton Home= new JButton();
	    
	    NavigationWindow(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Navigation Window");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 intial();
			 actionevent();
	 }
	    
	    public void	intial(){
			jcontainer.setLayout(null);
		    jcontainer.setBackground(new Color(230, 249, 254));
			
			ImageIcon bgim = new ImageIcon(this.getClass().getResource("Navigation.jpg")); 
			JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
			bg1.setBounds(0, 0, 1080, 768);
			jcontainer.add(bg1);
			
		
			room.setBounds(63, 603, 160,28);
			room.setLayout(new FlowLayout());
			room.setBackground(new Color(179, 218, 255));
			room.setVerticalAlignment(SwingConstants.CENTER);
			room.setHorizontalAlignment(SwingConstants.CENTER);
			room.setFont(new Font("ROBOTO",Font.BOLD,15));
			room.setContentAreaFilled(false);
			jcontainer.add(room);
			
			as.setBounds(328, 603, 160,28);
			as.setBackground(new Color(179, 218, 255));
			as.setVerticalAlignment(SwingConstants.CENTER);
			as.setHorizontalAlignment(SwingConstants.CENTER);
			as.setFont(new Font("ROBOTO",Font.BOLD,15));
			as.setContentAreaFilled(false);
			jcontainer.add(as);
			
			os.setBounds(592, 603, 160,28);
			os.setBackground(new Color(179, 218, 255));
			os.setVerticalAlignment(SwingConstants.CENTER);
			os.setHorizontalAlignment(SwingConstants.CENTER);
			os.setFont(new Font("ROBOTO",Font.BOLD,15));
			os.setContentAreaFilled(false);
			jcontainer.add(os);
			
			wa.setBounds(855, 603, 160,28);
			wa.setBackground(new Color(179, 218, 255));
			wa.setVerticalAlignment(SwingConstants.CENTER);
			wa.setHorizontalAlignment(SwingConstants.CENTER);
			wa.setFont(new Font("ROBOTO",Font.BOLD,15));
			wa.setContentAreaFilled(false);
			jcontainer.add(wa);
			
			Home.setBounds(32, 24, 30,30);
		    Home.setBackground(new Color(179, 218, 255));
			Home.setVerticalAlignment(SwingConstants.CENTER);
			Home.setHorizontalAlignment(SwingConstants.CENTER);
			Home.setFont(new Font("ROBOTO",Font.BOLD,15));
			Home.setContentAreaFilled(false);
			jcontainer.add(Home);
		}
			
		public void actionevent() {
			room.addActionListener(this);
			as.addActionListener(this);
			os.addActionListener(this);
			wa.addActionListener(this);
			Home.addActionListener(this);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			 if(e.getSource()==room)
			 {
				 this .setVisible(false);
				 
				 WelcomePage2 sp= new WelcomePage2();
				 sp.setVisible(true);
			 }
			 
			 if(e.getSource()==as)
			 {
				 this.setVisible(false);
				 
				 welDining sv= new welDining();
				 sv.setVisible(true);
				 
				 }
			 if(e.getSource()==os)
			 {
				 this .setVisible(false);
				 
				 Spool sp= new Spool();
				 sp.setVisible(true);
			 }
			 
			 if(e.getSource()==wa)
			 {
				 this.setVisible(false);
				 
				 Aboutus as= new Aboutus();
				 as.setVisible(true);
				 
				 
			 }
			 
			 if(e.getSource()==Home) {
				 this.setVisible(false);
				 
				WelcomePage wp= new WelcomePage();
				wp.setVisible(true);
			 }
			 
		}	
	    
	 
	 
	}
