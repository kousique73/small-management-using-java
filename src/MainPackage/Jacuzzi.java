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

class Jacuzzi extends JFrame implements ActionListener  {
	 Container jcontainer = getContentPane();
		JButton previousSlide = new JButton();
		JButton Home= new JButton();
		
		
		Jacuzzi(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Jacuzzi");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 jintial();
			 actionevent();
	 }
	public void	jintial(){
		jcontainer.setLayout(null);
	    jcontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Jacuzzi.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		jcontainer.add(bg1);
		
	
		previousSlide.setBounds(393, 535, 30,30);
		previousSlide.setBackground(new Color(179, 218, 255));
		previousSlide.setVerticalAlignment(SwingConstants.CENTER);
		previousSlide.setHorizontalAlignment(SwingConstants.CENTER);
		previousSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		previousSlide.setContentAreaFilled(false);
		jcontainer.add(previousSlide);
		
		Home.setBounds(37, 24, 30,30);
	    Home.setBackground(new Color(179, 218, 255));
		Home.setVerticalAlignment(SwingConstants.CENTER);
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("ROBOTO",Font.BOLD,15));
		Home.setContentAreaFilled(false);
		jcontainer.add(Home);
	}
		
	public void actionevent() {
		previousSlide.addActionListener(this);
		Home.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==previousSlide)
		 {
			 this .setVisible(false);
			 
			 gym sp= new gym();
			 sp.setVisible(true);
		 }
		 
		 if(e.getSource()==Home)
		 {
			 this.setVisible(false);
			 NavigationWindow nw= new NavigationWindow();
			 nw.setVisible(true);
			 
		 }
		 
	}	
			
			
		}

