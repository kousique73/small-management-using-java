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

 class WelcomePage extends JFrame implements ActionListener {
	 
	 Container wcontainer= getContentPane();
	 JButton aloginButton = new JButton ();
	 JButton loginnow = new JButton();
	 JButton taketour= new JButton();
	 JButton visualtour= new JButton();
	 
	 
	 WelcomePage(){
		 this.setTitle(" "+"WALDORF ASTORIA HOTEL_Welcome Page");
		 this.setBounds(200, 0, 1080, 768);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setResizable(false);
		 
		 
		 this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 design();
		 addActionEvent();
	 }
		 
		public void design(){
			
			wcontainer.setLayout(null);
		 
		 ImageIcon bgi = new ImageIcon(this.getClass().getResource("Welcome_Page.jpg")); 
		 JLabel bg = new JLabel("",bgi,JLabel.CENTER); 
		 bg.setBounds(0, 0, 1080, 768);
		 wcontainer.add(bg);
		 
		 
		 aloginButton.setBounds(990, 32, 50, 50);
		 aloginButton.setVerticalAlignment(SwingConstants.CENTER);
		 aloginButton.setHorizontalAlignment(SwingConstants.CENTER);
		 aloginButton.setContentAreaFilled(false);
		 wcontainer.add(aloginButton);
		 
		 loginnow.setBounds(77, 495, 115, 40);
		 loginnow.setVerticalAlignment(SwingConstants.CENTER);
		 loginnow.setHorizontalAlignment(SwingConstants.CENTER);
		 loginnow.setContentAreaFilled(false);
		 wcontainer.add(loginnow);
		 
		 
		 taketour.setBounds(80, 572, 123, 28);
		 taketour.setVerticalAlignment(SwingConstants.CENTER);
		 taketour.setHorizontalAlignment(SwingConstants.CENTER);
		 taketour.setContentAreaFilled(false);
		 wcontainer.add(taketour);
		 
		 visualtour.setBounds(80, 622, 123, 28);
		 visualtour.setVerticalAlignment(SwingConstants.CENTER);
		 visualtour.setHorizontalAlignment(SwingConstants.CENTER);
		 visualtour.setContentAreaFilled(false);
		 wcontainer.add(visualtour);
		 
		 
		 
		 
	 }
		
		public void	addActionEvent() {
			
			aloginButton.addActionListener(this);
			loginnow.addActionListener(this);
			taketour.addActionListener(this);
				visualtour.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==taketour) {
				this.setVisible(false);
				
				NavigationWindow s= new NavigationWindow();
				s.setVisible(true);
			}
			
			if(e.getSource()==aloginButton) {
				this.setVisible(false);
				
				   LoginFrame l = new LoginFrame();
					l.setVisible(true);
			}
			
			if(e.getSource()==loginnow) {
				this.setVisible(false);
				
				UserLogin u= new UserLogin();
				u.setVisible(true);
			}
			
			if(e.getSource()==visualtour)
			{
				this.setVisible(false);
				
				OurPreview op= new OurPreview();
				op.setVisible(true);
			}
			
			
			
			
			
		}
		
		
		
}

