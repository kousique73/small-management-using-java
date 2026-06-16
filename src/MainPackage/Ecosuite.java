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

class Ecosuite extends JFrame implements ActionListener  {
	 Container Escontainer = getContentPane();
		JButton Home = new JButton();
		JButton nextSlide= new JButton();
		
		
		Ecosuite(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Economy_Suite");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 ecointial();
			 actionevent();
	 }
	public void	ecointial(){
		Escontainer.setLayout(null);
	    Escontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Economy_Suite.png")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 738);
		Escontainer.add(bg1);
		
	
		Home.setBounds(34, 18, 30,30);
		Home.setBackground(new Color(179, 218, 255));
		Home.setVerticalAlignment(SwingConstants.CENTER);
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("ROBOTO",Font.BOLD,15));
		Home.setContentAreaFilled(false);
		Escontainer.add(Home);
		
		nextSlide.setBounds(1020, 686, 30,30);
		nextSlide.setBackground(new Color(179, 218, 255));
		nextSlide.setVerticalAlignment(SwingConstants.CENTER);
		nextSlide.setHorizontalAlignment(SwingConstants.CENTER);
		nextSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		nextSlide.setContentAreaFilled(false);
		Escontainer.add(nextSlide);
	}
			
	public void actionevent() {
		nextSlide.addActionListener(this);
		Home.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==nextSlide)
		 {
			 this .setVisible(false);
			 
			 Exesuite sp= new Exesuite();
			 sp.setVisible(true);
		 }
		 
		 if(e.getSource()==Home)
		 {
			 this.setVisible(false);
			 WelcomePage2 wp= new WelcomePage2();
			 wp.setVisible(true);
			 
		 }
		 
	}
			
			
		}
