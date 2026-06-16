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

class Spool extends JFrame implements ActionListener  {
	 Container spcontainer = getContentPane();
		JButton previous = new JButton();
		JButton nextSlide= new JButton();
		
		
		Spool(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Swimming_Pool");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 spoolintial();
			 actionevent();
	 }
	public void	spoolintial(){
		spcontainer.setLayout(null);
	    spcontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("swimming_pool.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		spcontainer.add(bg1);
		

	
		previous.setBounds(25, 30, 40,24);
		previous.setBackground(new Color(179, 218, 255));
		previous.setVerticalAlignment(SwingConstants.CENTER);
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("ROBOTO",Font.BOLD,15));
		previous.setContentAreaFilled(false);
		spcontainer.add(previous);
		
		nextSlide.setBounds(997, 535, 30,30);
		nextSlide.setBackground(new Color(179, 218, 255));
		nextSlide.setVerticalAlignment(SwingConstants.CENTER);
		nextSlide.setHorizontalAlignment(SwingConstants.CENTER);
		nextSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		nextSlide.setContentAreaFilled(false);
		spcontainer.add(nextSlide);
	}
	 public void actionevent() {
			previous.addActionListener(this);
			nextSlide.addActionListener(this);
		}
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==previous)
		 {
			 this .setVisible(false);
			 
			 NavigationWindow nw= new NavigationWindow();
			 nw.setVisible(true);
			 
		 }
		 
		 if(e.getSource()==nextSlide)
		 {
			 this.setVisible(false);
			 
			 welSpa jb= new welSpa();
			 jb.setVisible(true);
		 }
		 
	}		
			
			
		}















