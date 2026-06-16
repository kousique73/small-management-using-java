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

class Exesuite extends JFrame implements ActionListener  {
	 Container Excontainer = getContentPane();
		JButton Home = new JButton();
		JButton nextSlide= new JButton();
		
		
		Exesuite(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Executive Suite");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 exeintial();
			 actionevent();
	 }
	public void	exeintial(){
		Excontainer.setLayout(null);
	    Excontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Executive_Suite.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 738);
		Excontainer.add(bg1);
		
	
		Home.setBounds(41, 10, 36,35);
		Home.setBackground(new Color(179, 218, 255));
		Home.setVerticalAlignment(SwingConstants.CENTER);
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("ROBOTO",Font.BOLD,15));
		Home.setContentAreaFilled(false);
		Excontainer.add(Home);
		
		nextSlide.setBounds(647, 690, 30,30);
		nextSlide.setBackground(new Color(179, 218, 255));
		nextSlide.setVerticalAlignment(SwingConstants.CENTER);
		nextSlide.setHorizontalAlignment(SwingConstants.CENTER);
		nextSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		nextSlide.setContentAreaFilled(false);
		Excontainer.add(nextSlide);
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
			 
			 Ecosuite sp= new Ecosuite();
			 sp.setVisible(true);
		 }
		 
		 if(e.getSource()==Home)
		 {
			 this.setVisible(false);
			 UserDashboard wp= new UserDashboard();
			 wp.setVisible(true);
			 
		 }
		 
	}
			
		}
