package MainPackage;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class UserLogin extends JFrame implements ActionListener  {
Container container = getContentPane();

JTextField userTextField = new JTextField();

JPasswordField passwordField = new JPasswordField();

JCheckBox showPassword = new JCheckBox ();

JButton loginButton = new JButton ("Login");
JButton regButton = new JButton("Sign Up");
JButton backbutton = new JButton();


UserLogin() {
 this.setBounds(200, 0, 1080, 768);
 this.setTitle(" "+"WALDORF ASTORIA HOTEL_Customer Login");
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setResizable(true);
 
 
 this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
 
 
 Initialize();
 addActionEvent();
  
}
public void Initialize()
{
container.setLayout(null);
container.setBackground(Color.WHITE);

ImageIcon bgi = new ImageIcon(this.getClass().getResource("Login_page.jpg")); 
JLabel bg = new JLabel("",bgi,JLabel.CENTER); 
bg.setBounds(0, 0, 1080, 768);
container.add(bg);

userTextField.setBounds(82, 306, 250, 25);
userTextField.setToolTipText("Enter Username");
userTextField.setFont(new Font("ROBOTO",Font.PLAIN,15));
userTextField.setBackground(new Color(240,240,240));
userTextField.setBorder(null);
container.add(userTextField);

passwordField.setBounds(82, 380, 250, 25);
passwordField.setToolTipText("Enter Password");
passwordField.setFont(new Font("ROBOTO",Font.PLAIN,15));
passwordField.setEchoChar((char)0023);
passwordField.setBackground(new Color(240,240,240));
passwordField.setBorder(null);
container.add(passwordField);

showPassword.setBounds(360, 392, 20, 20);
showPassword.setBackground(new Color(240, 252, 244));
showPassword.setToolTipText("Show Password");
container.add(showPassword);

loginButton.setBounds(85, 422, 88, 25);
loginButton.setBackground(Color.BLUE);
loginButton.setVerticalAlignment(SwingConstants.CENTER);
loginButton.setHorizontalAlignment(SwingConstants.CENTER);
loginButton.setBackground(new Color(209, 237, 225));
loginButton.setFont(new Font("ROBOTO",Font.BOLD,13));
loginButton.setContentAreaFilled(false);
container.add(loginButton);

regButton.setBounds(85, 482, 184,25);
regButton.setBackground(Color.orange);
regButton.setVerticalAlignment(SwingConstants.CENTER);
regButton.setHorizontalAlignment(SwingConstants.CENTER);
regButton.setFont(new Font("ROBOTO",Font.BOLD,15));
regButton.setContentAreaFilled(false);
container.add(regButton);


backbutton.setBounds(50, 27, 30, 30);
backbutton.setBackground(Color.BLUE);
backbutton.setVerticalAlignment(SwingConstants.CENTER);
backbutton.setHorizontalAlignment(SwingConstants.CENTER);
backbutton.setBackground(new Color(209, 237, 225));
backbutton.setFont(new Font("ROBOTO",Font.BOLD,13));
backbutton.setContentAreaFilled(false);
container.add(backbutton);



}
public void addActionEvent() {
	
	loginButton.addActionListener(this);
	regButton.addActionListener(this);
	showPassword.addActionListener(this);
	backbutton.addActionListener(this);
}
public void reset() {
	userTextField.setText(" ");
	passwordField.setText(" ");
}


public void actionPerformed(ActionEvent e) {

	if(e.getSource()== loginButton) {
		String userText=userTextField.getText();
		String passText=passwordField.getText();
		
	try {
		
	String path = "F://Swing GUI//src//MainPackage/UserInfo.txt";
	
			FileReader fr= new FileReader(path);
			BufferedReader br= new BufferedReader(fr);
			boolean isLoginSuccess = false, isfromNSU= false;
			int u=0;
			String line,fuserEmail,fpass,fuserID;
			
			while((line=br.readLine())!=null)
			{
				fuserEmail = line.split(" ")[2];
				fpass= line.split(" ")[3];
				fuserID= fuserEmail.split("@")[0];
				
			if (fuserEmail.split("@")[1].equalsIgnoreCase("northsouth.edu")) {
				isfromNSU= true;
			}
			
			if((fuserID.equalsIgnoreCase(userText)|| fuserEmail.equalsIgnoreCase(userText) && fpass.equalsIgnoreCase(passText))){
				isLoginSuccess=true;
				this.setVisible(false);
				UserDashboard ud= new UserDashboard();
				ud.setVisible(true);
				break;
			}
			else if (fuserID.equalsIgnoreCase(userText)|| fuserEmail.equalsIgnoreCase(userText)) {
				u++;
			}
			}
			if(!isLoginSuccess)
			{
				if(u>0) {
					JOptionPane.showMessageDialog(null,"Invalid Password!","Warning!!", JOptionPane.WARNING_MESSAGE);	
			}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid User!", "Warning!!", JOptionPane.WARNING_MESSAGE);
				}
			
	}
			
	fr.close();	
	}
	catch( Exception ep) {
		System.out.println("Error 404!");
	}
	
}
	
	if(e.getSource()==regButton) {
		this.setVisible(false);
		
		UserSignup s= new UserSignup();
		s.setVisible(true);
	}
	
	if(e.getSource()== showPassword) {
		if (showPassword.isSelected()) {
			passwordField.setEchoChar((char) 0);
		}
		else {
			passwordField.setEchoChar((char)0023);
		}
	}
	
	if(e.getSource()== backbutton)
	{
		this.setVisible(false);
		
		WelcomePage wp= new WelcomePage();
		wp.setVisible(true);
	}




}


}