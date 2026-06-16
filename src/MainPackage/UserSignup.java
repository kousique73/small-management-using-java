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
import java.net.URI;
import java.net.URISyntaxException;


class UserSignup extends JFrame implements ActionListener   {

String path = "F://Swing GUI//src//MainPackage/UserInfo.txt";
Container container1 = getContentPane();

int u=0;

JTextField userTextField1 = new JTextField(); //First name
JTextField userTextField2 = new JTextField(); //Last name
JTextField userTextField3 = new JTextField(); //email
JTextField userTextField4 = new JTextField(); //phone number

JPasswordField passwordField1 = new JPasswordField(); //password
JPasswordField passwordField2= new JPasswordField(); //confirm password

JCheckBox showPassword1 = new JCheckBox (); //password
JCheckBox showPassword2 = new JCheckBox(); //confirm password
JCheckBox terms = new JCheckBox();

JButton Home= new JButton();
JButton regbutton1 = new JButton();
JButton fb = new JButton();
JButton gmail = new JButton();
JButton apple = new JButton();




UserSignup() {
	this.setTitle(" "+"WALDORF ASTORIA HOTEL_User Signup");
	 this.setBounds(200, 0, 1080, 768);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setResizable(true);
	 
	 
	 this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
	 
 intial();
 actionevent();
}

public void intial()
{
	container1.setLayout(null);
	container1.setBackground(new Color(230, 249, 254));
	
	
	ImageIcon bgim = new ImageIcon(this.getClass().getResource("Sign_up_page.jpg")); 
	JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
	bg1.setBounds(0, 0, 1080, 768);
	container1.add(bg1);
	
	userTextField1.setBounds(588, 199, 160, 28);
	userTextField1.setFont(new Font("ROBOTO",Font.PLAIN,15));
	userTextField1.setToolTipText("First Name");
	userTextField1.setBackground(new Color(240,240,240));
	userTextField1.setBorder(null);
	container1.add(userTextField1);
	
	userTextField2.setBounds(780, 199, 160, 28);
	userTextField2.setToolTipText("Last name");
	userTextField2.setFont(new Font("ROBOTO",Font.PLAIN,15));
	userTextField2.setBackground(new Color(240,240,240));
	userTextField2.setBorder(null);
	container1.add(userTextField2);
	
	userTextField3.setBounds(588,283, 350, 30);
	userTextField3.setToolTipText("E-mail");
	userTextField3.setFont(new Font("ROBOTO",Font.PLAIN,15));
	userTextField3.setBackground(new Color(240,240,240));
	userTextField3.setBorder(null);
	container1.add(userTextField3);
	
	userTextField4.setBounds(588, 368, 350, 30);
	userTextField4.setToolTipText("Contact Number");
	userTextField4.setFont(new Font("ROBOTO",Font.PLAIN,15));
	userTextField4.setBackground(new Color(240,240,240));
	userTextField4.setBorder(null);
	container1.add(userTextField4);
	
	passwordField1.setBounds(588, 453, 270, 30);
	passwordField1.setToolTipText("Enter Password");
	passwordField1.setFont(new Font("ROBOTO",Font.PLAIN,15));
	passwordField1.setBackground(new Color(240,240,240));
	passwordField1.setBorder(null);
	container1.add(passwordField1);
	
	passwordField2.setBounds(588, 538, 270, 30);
	passwordField2.setToolTipText("Confirm Password");
	passwordField2.setFont(new Font("ROBOTO",Font.PLAIN,15));
	passwordField2.setBorder(null);
	passwordField2.setBackground(new Color(240,240,240));
	container1.add(passwordField2);
	
	showPassword1.setBounds(880, 470, 20, 20);
	showPassword1.setBackground(new Color(240, 252, 244));
	showPassword1.setToolTipText("Show Password");
	container1.add(showPassword1);
	
	showPassword2.setBounds(880, 550, 20, 20);
	showPassword2.setBackground(new Color(240, 252, 244));
	showPassword2.setToolTipText("Confirm Password");
	container1.add(showPassword2);
	
	
	regbutton1.setBounds(580, 585, 100,30);
	regbutton1.setBackground(new Color(179, 218, 255));
	regbutton1.setVerticalAlignment(SwingConstants.CENTER);
	regbutton1.setHorizontalAlignment(SwingConstants.CENTER);
	regbutton1.setFont(new Font("ROBOTO",Font.BOLD,15));
	regbutton1.setContentAreaFilled(false);
	container1.add(regbutton1);
	
	fb.setBounds(780, 638, 25,25);
	fb.setBackground(new Color(179, 218, 255));
	fb.setVerticalAlignment(SwingConstants.CENTER);
	fb.setHorizontalAlignment(SwingConstants.CENTER);
	fb.setFont(new Font("ROBOTO",Font.BOLD,15));
	fb.setContentAreaFilled(false);
	container1.add(fb);
	
	gmail.setBounds(837, 638, 25,25);
	gmail.setBackground(new Color(179, 218, 255));
	gmail.setVerticalAlignment(SwingConstants.CENTER);
	gmail.setHorizontalAlignment(SwingConstants.CENTER);
	gmail.setFont(new Font("ROBOTO",Font.BOLD,15));
	gmail.setContentAreaFilled(false);
	container1.add(gmail);
	
	apple.setBounds(889, 638, 25,25);
	apple.setBackground(new Color(179, 218, 255));
	apple.setVerticalAlignment(SwingConstants.CENTER);
	apple.setHorizontalAlignment(SwingConstants.CENTER);
	apple.setFont(new Font("ROBOTO",Font.BOLD,15));
	apple.setContentAreaFilled(false);
	container1.add(apple);
	
	Home.setBounds(32, 24, 35,30);
    Home.setBackground(new Color(179, 218, 255));
	Home.setVerticalAlignment(SwingConstants.CENTER);
	Home.setHorizontalAlignment(SwingConstants.CENTER);
	Home.setFont(new Font("ROBOTO",Font.BOLD,15));
	Home.setContentAreaFilled(false);
	container1.add(Home);

}
public void actionevent() {
	regbutton1.addActionListener(this);
	showPassword1.addActionListener(this);
	showPassword2.addActionListener(this);
	fb.addActionListener(this);
	gmail.addActionListener(this);
	apple.addActionListener(this);
	Home.addActionListener(this);

}

@Override
public void actionPerformed(ActionEvent e) {
	
	
	
	if(passwordField1.getText().equals(passwordField2.getText())== false) {
		u++;
	}
	if(e.getSource()==regbutton1)
	{
		try {
			if(!check(userTextField3.getText()) && !check2(userTextField4.getText()) && passwordField1.getText().equals(passwordField2.getText()))
					{
				FileWriter myfile=new FileWriter(path,true);
				myfile.write(userTextField1.getText()+" "+userTextField2.getText()+" "+userTextField3.getText()+" "+passwordField1.getText()+" "+userTextField4.getText()+"\n" );
				myfile.close();
				JOptionPane.showMessageDialog(null,"Welcome You've been successfully Registered!! Please Login to continue!", "Confirmation", JOptionPane.WARNING_MESSAGE);
				
			}
			
			
			else {
				if(u>0) {
					JOptionPane.showMessageDialog(null,"Passwords Didn't match");
					
				}
				else {
				JOptionPane.showMessageDialog(null, "Username or phone number is already in use!!","Confirmation",JOptionPane.WARNING_MESSAGE);
			}
				}
		}
		catch(IOException ex) {
			System.out.println("ERROR 404! FILE NOT FOUND");
		}
		
		resetUI();
	}
	
	if(e.getSource()==showPassword1) {
		
		if (showPassword1.isSelected()) {
			passwordField1.setEchoChar((char) 0);
		}
		else {
			passwordField1.setEchoChar((char)0023);
		}
	}
		
		if(e.getSource()==showPassword2) {
			
			if (showPassword2.isSelected()) {
				passwordField2.setEchoChar((char) 0);
			}
			else {
				passwordField2.setEchoChar((char)0023);
			}
		
			
}
	
if(e.getSource()==fb) {
			
			Desktop browser=  Desktop.getDesktop();
			try {
				browser.browse(new URI("http://www.facebook.com"));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			catch(URISyntaxException err) {
				
			}
		}
if(e.getSource()==gmail) {
	
	Desktop browser=  Desktop.getDesktop();
	try {
		browser.browse(new URI("http://www.gmail.com"));
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	catch(URISyntaxException err) {
		
	}
}

if(e.getSource()==apple) {
	
	Desktop browser=  Desktop.getDesktop();
	try {
		browser.browse(new URI("https://appleid.apple.com"));
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	catch(URISyntaxException err) {
		
	}
}
	
	
if(e.getSource()==Home)
{
	UserLogin lf= new UserLogin();
	lf.setVisible(true);
}       
	
	
	
	
	
	
	
}

public boolean check(String email) {
	String line;
	try {
		FileReader fr= new FileReader(path);
		BufferedReader br= new BufferedReader(fr);
		while ((line=br.readLine()) !=null)
		{
			if(email.split("@")[0].equalsIgnoreCase(line.split(" ")[2].split("@")[0])) {
				return true;
			}
		}
	}
	
	catch(Exception exc) {
		System.out.println("ERROR 404! FILE NOT FOUND");
		
	}
	return false;
}
public boolean check2(String phone) {
	String line;
	try {
		FileReader fr= new FileReader(path);
		BufferedReader br= new BufferedReader(fr);
		while ((line=br.readLine()) !=null)
		{
			if(phone.equalsIgnoreCase(line.split(" ")[4])) {
				return true;
			}
		}
	}
	
	catch(Exception exc) {
		System.out.println("ERROR 404! FILE NOT FOUND");
		
	}
	return false;
}

public void resetUI(){
    this.userTextField1.setText(" ");
      this.userTextField2.setText(" ");
      this.userTextField3.setText(" ");
      this.userTextField4.setText(" ");
      this.passwordField1.setText("");
      this.passwordField2.setText("");
}


}
