package MainPackage;
import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class OurPreview extends JFrame implements ActionListener {
	Container ocontainer = getContentPane();
	JButton video = new JButton();
	JButton previous= new JButton();

	OurPreview(){
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Preview_Window");
		this.setBounds(250, 0, 1080, 760);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 ointial();
		 actionevent();
		
	}
	public void ointial()
	{
		ocontainer.setLayout(null);
		ocontainer.setBackground(new Color(230, 249, 254));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Welcome.png")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 720);
		ocontainer.add(bg1);
	
		video.setBounds(490, 330, 96,60);
		video.setBackground(new Color(179, 218, 255));
		video.setVerticalAlignment(SwingConstants.CENTER);
		video.setHorizontalAlignment(SwingConstants.CENTER);
		video.setFont(new Font("ROBOTO",Font.BOLD,15));
		video.setContentAreaFilled(false);
		ocontainer.add(video);
		
		previous.setBounds(65, 642, 30,30);
		previous.setBackground(new Color(179, 218, 255));
		previous.setVerticalAlignment(SwingConstants.CENTER);
		previous.setHorizontalAlignment(SwingConstants.CENTER);
		previous.setFont(new Font("ROBOTO",Font.BOLD,15));
		previous.setContentAreaFilled(false);
		ocontainer.add(previous);
	
	}
	public void actionevent() {
		video.addActionListener(this);
		previous.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==video) {
			 try {
					Desktop.getDesktop().open(new File("C:/Users/Tamim/Desktop/Preview of Hotel Waldorf Astoria.mkv"));
				} catch (IOException ex) {
					System.out.println(ex);
					ex.printStackTrace();
				}
		}
		
		if(e.getSource()==previous) {
			this.setVisible(false);
			
			WelcomePage wp= new WelcomePage();
			wp.setVisible(true);
			
		}
		
	}

	
}
