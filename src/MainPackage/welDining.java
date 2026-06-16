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

 class welDining extends JFrame implements ActionListener  {
	 Container wd2container = getContentPane();
		JButton previous = new JButton();
		JButton next= new JButton();
	


 
 welDining(){
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Dining");
		this.setBounds(200, 0, 1080, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 weldintial();
		 actionevent();
 }
 public void weldintial()
	{
		wd2container.setLayout(null);
		wd2container.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Dining.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		wd2container.add(bg1);
		
	
		previous.setBounds(35, 33, 60,30);
		previous.setBackground(new Color(179, 218, 255));
		previous.setVerticalAlignment(SwingConstants.CENTER);
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("ROBOTO",Font.BOLD,15));
		previous.setContentAreaFilled(false);
		wd2container.add(previous);
		
		next.setBounds(675, 510, 40,40);
		next.setBackground(new Color(179, 218, 255));
		next.setVerticalAlignment(SwingConstants.CENTER);
		next.setHorizontalAlignment(SwingConstants.CENTER);
		next.setFont(new Font("ROBOTO",Font.BOLD,15));
		next.setContentAreaFilled(false);
		wd2container.add(next);
	}
 
 public void actionevent() {
		previous.addActionListener(this);
		next.addActionListener(this);
	}
 public void actionPerformed(ActionEvent e)
 {
	 if(e.getSource()==previous)
	 {
		 this .setVisible(false);
		 
		 NavigationWindow nw= new NavigationWindow();
		 nw.setVisible(true);
	 }
	 
	 if(e.getSource()==next)
	 {
		 this.setVisible(false);
		 
		 Juicebar jb= new Juicebar();
		 jb.setVisible(true);
	 }
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
