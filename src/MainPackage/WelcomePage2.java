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

class WelcomePage2 extends JFrame implements ActionListener {
	
	Container wp2container = getContentPane();
	JButton previous = new JButton();
	JButton next= new JButton();

	WelcomePage2(){
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Rooms");
		this.setBounds(200, 0, 1080, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 wintial();
		 actionevent();
		
	}
	public void wintial()
	{
		wp2container.setLayout(null);
		wp2container.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Room_page.png")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		wp2container.add(bg1);
	
		previous.setBounds(65, 645, 30,30);
		previous.setBackground(new Color(179, 218, 255));
		previous.setVerticalAlignment(SwingConstants.CENTER);
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("ROBOTO",Font.BOLD,15));
		previous.setContentAreaFilled(false);
		wp2container.add(previous);
		
		next.setBounds(985, 645, 30,30);
		next.setBackground(new Color(179, 218, 255));
		next.setVerticalAlignment(SwingConstants.CENTER);
		next.setHorizontalAlignment(SwingConstants.CENTER);
		next.setFont(new Font("ROBOTO",Font.BOLD,15));
		next.setContentAreaFilled(false);
		wp2container.add(next);
		
	
	}
	public void actionevent() {
		previous.addActionListener(this);
		next.addActionListener(this);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==previous) {
			this.setVisible(false);
			
			NavigationWindow wp= new NavigationWindow();
			wp.setVisible(true);
			
		}
		
		if(e.getSource()==next) {
			this.setVisible(false);
			
		Ecosuite es= new Ecosuite();
		es.setVisible(true);
		}
		
		
	}

}
