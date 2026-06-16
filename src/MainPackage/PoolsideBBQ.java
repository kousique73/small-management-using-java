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

 class PoolsideBBQ extends JFrame implements ActionListener  {
	 Container pbqcontainer = getContentPane();
		JButton previous = new JButton();
		JButton Home= new JButton();
	


 
 PoolsideBBQ(){
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Pool_side_BBQ");
		this.setBounds(200, 0, 1080, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 poolbbqintial();
		 actionevent();
 }
 public void poolbbqintial()
	{
		pbqcontainer.setLayout(null);
		pbqcontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("BBQ.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		pbqcontainer.add(bg1);
		
		
	
		previous.setBounds(42, 518, 30,30);
		previous.setBackground(new Color(179, 218, 255));
		previous.setVerticalAlignment(SwingConstants.CENTER);
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("ROBOTO",Font.BOLD,15));
		previous.setContentAreaFilled(false);
		pbqcontainer.add(previous);
		
		Home.setBounds(30, 24, 30,30);
		Home.setBackground(new Color(179, 218, 255));
		Home.setVerticalAlignment(SwingConstants.CENTER);
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("ROBOTO",Font.BOLD,15));
		Home.setContentAreaFilled(false);
		pbqcontainer.add(Home);
	}
 public void actionevent() {
		previous.addActionListener(this);
		Home.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
	 if(e.getSource()==previous)
	 {
		 this .setVisible(false);
		 cafesavoury wd= new cafesavoury();
		 wd.setVisible(true);
	 }
	 
	 if(e.getSource()==Home)
	 {
		 this.setVisible(false);
		 
		 NavigationWindow jb= new NavigationWindow();
		 jb.setVisible(true);
	 }
	 
}
 }