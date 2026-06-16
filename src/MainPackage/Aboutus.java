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

public class Aboutus extends JFrame implements ActionListener  {

	
	Container jcontainer = getContentPane();
	 JButton Home= new JButton();
	 
	 Aboutus(){
			this.setTitle(" "+"WALDORF ASTORIA HOTEL_About Us");
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
			
			ImageIcon bgim = new ImageIcon(this.getClass().getResource("About_us.jpg")); 
			JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
			bg1.setBounds(0, 0, 1080, 768);
			jcontainer.add(bg1);
			
			Home.setBounds(32, 24, 35,30);
		    Home.setBackground(new Color(179, 218, 255));
			Home.setVerticalAlignment(SwingConstants.CENTER);
			Home.setHorizontalAlignment(SwingConstants.CENTER);
			Home.setFont(new Font("ROBOTO",Font.BOLD,15));
			Home.setContentAreaFilled(false);
			jcontainer.add(Home);
	 }
	 public void actionevent() {
			Home.addActionListener(this);
		}
	 public void actionPerformed(ActionEvent e)
		{
		 if(e.getSource()==Home) {
			 this.setVisible(false);
			 
			NavigationWindow wp= new NavigationWindow();
			wp.setVisible(true);
		 }
		}
	
	
	
	
	
	
}
