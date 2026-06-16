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

public class UserDashboard extends JFrame implements ActionListener {

     Container jcontainer = getContentPane();
        JButton booking = new JButton();
        JButton rooms= new JButton();
        JButton logout= new JButton();
        
        
        UserDashboard(){
            this.setTitle(" "+"WALDORF ASTORIA HOTEL_User Dashboard");
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
            
            ImageIcon bgim = new ImageIcon(this.getClass().getResource("User_Dashboard.jpg")); 
            JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
            bg1.setBounds(0, 0, 1080, 768);
            jcontainer.add(bg1);
            
            booking.setBounds(95, 420, 415,217);
            booking.setLayout(new FlowLayout());
            booking.setBackground(new Color(179, 218, 255));
            booking.setVerticalAlignment(SwingConstants.CENTER);
            booking.setHorizontalAlignment(SwingConstants.CENTER);
            booking.setFont(new Font("ROBOTO",Font.BOLD,15));
            booking.setContentAreaFilled(false);
            jcontainer.add(booking);
            
            rooms.setBounds(570, 420, 415,217);
            rooms.setBackground(new Color(179, 218, 255));
            rooms.setVerticalAlignment(SwingConstants.CENTER);
            rooms.setHorizontalAlignment(SwingConstants.CENTER);
            rooms.setFont(new Font("ROBOTO",Font.BOLD,15));
            rooms.setContentAreaFilled(false);
            jcontainer.add(rooms);
            
            logout.setBounds(32, 27, 45,25);
		    logout.setBackground(new Color(179, 218, 255));
			logout.setVerticalAlignment(SwingConstants.CENTER);
			logout.setHorizontalAlignment(SwingConstants.CENTER);
			logout.setFont(new Font("ROBOTO",Font.BOLD,15));
		    logout.setContentAreaFilled(false);
			jcontainer.add(logout);
            
       }
       
       private void actionevent() {
 		  booking.addActionListener(this);
 			rooms.addActionListener(this);
 			logout.addActionListener(this);
 			
 		}
 	  public void actionPerformed(ActionEvent e)
 		{
 		  
 		  if(e.getSource()==booking)
 			 {
 				 this.setVisible(false);
 				 Booking bk= new Booking();
 				 bk.setVisible(true);
 				 
 				 
 			 }
 			 
 			 if(e.getSource()==rooms)
 			 {
 				 this.setVisible(false);
 				 
 				 Rooms wp= new Rooms();
 				 wp.setVisible(true);
 			 }
 			 
 			 
 			 if(e.getSource()== logout)
 			 {
 				 this.setVisible(false);
 				 
 				 UserLogin ad= new UserLogin();
 				 ad.setVisible(true);
 				 
 			 }
       
}
}
