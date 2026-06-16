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

class gym extends JFrame implements ActionListener  {
	 Container gcontainer = getContentPane();
		JButton previousSlide = new JButton();
		JButton nextSlide= new JButton();
		
		
		gym(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_Gym");
			this.setBounds(200, 0, 1080, 768);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(false);
			this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
			 gintial();
			 actionevent();
	 }
	public void	gintial(){
		gcontainer.setLayout(null);
	    gcontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Gym.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
	    gcontainer.add(bg1);
		
	
		previousSlide.setBounds(393, 535, 30,30);
		previousSlide.setBackground(new Color(179, 218, 255));
		previousSlide.setVerticalAlignment(SwingConstants.CENTER);
		previousSlide.setHorizontalAlignment(SwingConstants.CENTER);
		previousSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		previousSlide.setContentAreaFilled(false);
		gcontainer.add(previousSlide);
		
		nextSlide.setBounds(997, 535, 30,30);
		nextSlide.setBackground(new Color(179, 218, 255));
		nextSlide.setVerticalAlignment(SwingConstants.CENTER);
		nextSlide.setHorizontalAlignment(SwingConstants.CENTER);
		nextSlide.setFont(new Font("ROBOTO",Font.BOLD,15));
		nextSlide.setContentAreaFilled(false);
		gcontainer.add(nextSlide);
	}
			
	public void actionevent() {
		previousSlide.addActionListener(this);
		nextSlide.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==previousSlide)
		 {
			 this .setVisible(false);
			 
			 PoolBilliards sp= new PoolBilliards();
			 sp.setVisible(true);
		 }
		 
		 if(e.getSource()==nextSlide)
		 {
			 this.setVisible(false);
			 
			 Jacuzzi jb= new Jacuzzi();
			 jb.setVisible(true);
		 }
		 
	}	
			
		}
