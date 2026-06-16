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

public class Booking extends JFrame implements ActionListener {
	
	Container jcontainer = getContentPane();
	
	JButton book1 = new JButton();
	JButton book2 = new JButton();
	JButton book3 = new JButton();
	JButton book4 = new JButton();
	JButton book5 = new JButton();
	JButton book6 = new JButton();
	JButton slider = new JButton();
	JButton Home = new JButton();

	Booking(){
        this.setTitle(" "+"WALDORF ASTORIA HOTEL_Executive Room Booking");
        this.setBounds(200, 0, 1080, 768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
         intial();
         actionevent();
 }
	public void intial() {
		
		jcontainer.setLayout(null);
	    jcontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Rooms_Executive.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		jcontainer.add(bg1);
		
		book1.setBounds(115, 490, 128,28);
		book1.setLayout(new FlowLayout());
		book1.setBackground(new Color(179, 218, 255));
		book1.setVerticalAlignment(SwingConstants.CENTER);
		book1.setHorizontalAlignment(SwingConstants.CENTER);
		book1.setFont(new Font("ROBOTO",Font.BOLD,15));
		book1.setContentAreaFilled(false);
		jcontainer.add(book1);
		
		book2.setBounds(475, 488, 128,28);
		book2.setBackground(new Color(179, 218, 255));
		book2.setVerticalAlignment(SwingConstants.CENTER);
		book2.setHorizontalAlignment(SwingConstants.CENTER);
		book2.setFont(new Font("ROBOTO",Font.BOLD,15));
		book2.setContentAreaFilled(false);
		jcontainer.add(book2);
		
		book3.setBounds(835, 488, 128,28);
		book3.setLayout(new FlowLayout());
		book3.setBackground(new Color(179, 218, 255));
		book3.setVerticalAlignment(SwingConstants.CENTER);
		book3.setHorizontalAlignment(SwingConstants.CENTER);
		book1.setFont(new Font("ROBOTO",Font.BOLD,15));
		book3.setContentAreaFilled(false);
		jcontainer.add(book3);
		
		book4.setBounds(115, 685, 128,28);
		book4.setBackground(new Color(179, 218, 255));
		book4.setVerticalAlignment(SwingConstants.CENTER);
		book4.setHorizontalAlignment(SwingConstants.CENTER);
		book4.setFont(new Font("ROBOTO",Font.BOLD,15));
		book4.setContentAreaFilled(false);
		jcontainer.add(book4);
		
		book5.setBounds(475, 685, 128,28);
		book5.setLayout(new FlowLayout());
		book5.setBackground(new Color(179, 218, 255));
		book5.setVerticalAlignment(SwingConstants.CENTER);
		book5.setHorizontalAlignment(SwingConstants.CENTER);
		book5.setFont(new Font("ROBOTO",Font.BOLD,15));
		book5.setContentAreaFilled(false);
		jcontainer.add(book5);
		
		book6.setBounds(835, 685, 128,28);
		book6.setBackground(new Color(179, 218, 255));
		book6.setVerticalAlignment(SwingConstants.CENTER);
		book6.setHorizontalAlignment(SwingConstants.CENTER);
		book6.setFont(new Font("ROBOTO",Font.BOLD,15));
		book6.setContentAreaFilled(false);
		jcontainer.add(book6);
		
		slider.setBounds(57, 295, 115,32);
		slider.setBackground(new Color(179, 218, 255));
		slider.setVerticalAlignment(SwingConstants.CENTER);
		slider.setHorizontalAlignment(SwingConstants.CENTER);
		slider.setFont(new Font("ROBOTO",Font.BOLD,15));
		slider.setContentAreaFilled(false);
		jcontainer.add(slider);
		
		Home.setBounds(32, 24, 35,30);
	    Home.setBackground(new Color(179, 218, 255));
		Home.setVerticalAlignment(SwingConstants.CENTER);
		Home.setHorizontalAlignment(SwingConstants.CENTER);
		Home.setFont(new Font("ROBOTO",Font.BOLD,15));
		Home.setContentAreaFilled(false);
		jcontainer.add(Home);
		
	}
	
	public void actionevent() {
		book1.addActionListener(this);
		book2.addActionListener(this);
		book3.addActionListener(this);
		book4.addActionListener(this);
		book5.addActionListener(this);
		book6.addActionListener(this);
		slider.addActionListener(this);
		Home.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		 if(e.getSource()==book1)
		 {
			 this .setVisible(false);
			 
			Insertcus2 ic= new Insertcus2();
			ic.setVisible(true);
		 }
		 
		 if(e.getSource()==book2)
		 {
			 this.setVisible(false);
			 
			 Insertcus2 ic= new Insertcus2();
				ic.setVisible(true);
			 
			 }
		 if(e.getSource()==book3)
		 {
			 this .setVisible(false);
			 
			 Insertcus2 ic= new Insertcus2();
				ic.setVisible(true);
		 }
		 
		 if(e.getSource()==book4)
		 {
			 this .setVisible(false);
			 Insertcus2 ic= new Insertcus2();
				ic.setVisible(true);
		 }
		 
		 if(e.getSource()==book5)
		 {
			 this.setVisible(false);
			 
			 Insertcus2 ic= new Insertcus2();
				ic.setVisible(true);
			 
			 }
		 if(e.getSource()==book6)
		 {
			 this .setVisible(false);
			 
			 Insertcus2 ic= new Insertcus2();
				ic.setVisible(true);
		 }
		 
		 if(e.getSource()==slider)
		 {
			 this .setVisible(false);
			 
			EcoRoombooking sp= new EcoRoombooking();
			 sp.setVisible(true);
		 }
		 
		 if(e.getSource()==Home)
		 {
			 this.setVisible(false);
			 
			 UserDashboard ud= new UserDashboard();
			 ud.setVisible(true);
			 
			 }
		
	}	
	
	
}
