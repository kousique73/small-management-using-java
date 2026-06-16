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


public class employeeop extends JFrame implements ActionListener {
	
	
	
	Container container1 = getContentPane();
	 JTextField userTextField1 = new JTextField(); //name
	JTextField userTextField2 = new JTextField(); //id
	JTextField userTextField3 = new JTextField(); //age
	JTextField userTextField4 = new JTextField(); //nationality
	JTextField userTextField5 = new JTextField(); //designation
	JButton regbutton1 = new JButton();
	
	JButton back= new JButton(); 
	
	employeeop() {
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Insert Employee");
		this.setBounds(200, 0, 1080, 768);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 intial();
		 actionevent();
		}

	public void intial(){
		
		container1.setLayout(null);
		container1.setBackground(new Color(95, 147, 160));
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Emp_Page.jpg")); 		
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
	     bg1.setBounds(0, 0, 1080, 768);
		container1.add(bg1);
		
		userTextField1.setBounds(588, 199, 160, 28);
		userTextField1.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField1.setToolTipText(" Name");
		userTextField1.setBackground(new Color(240,240,240));
		userTextField1.setBorder(null);
		container1.add(userTextField1);
		
		userTextField2.setBounds(780, 199, 160, 28);
		userTextField2.setToolTipText("ID");
		userTextField2.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField2.setBackground(new Color(240,240,240));
		userTextField2.setBorder(null);
		container1.add(userTextField2);
		
		userTextField3.setBounds(588,283, 350, 30);
		userTextField3.setToolTipText("age");
		userTextField3.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField3.setBackground(new Color(240,240,240));
		userTextField3.setBorder(null);
		container1.add(userTextField3);
		
		userTextField4.setBounds(588, 368, 350, 30);
		userTextField4.setToolTipText("Nationality");
		userTextField4.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField4.setBackground(new Color(240,240,240));
		userTextField4.setBorder(null);
		container1.add(userTextField4);
	
		userTextField5.setBounds(588, 453, 270, 30);
		userTextField5.setToolTipText("Designation");
		userTextField5.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField5.setBackground(new Color(240,240,240));
		userTextField5.setBorder(null);
		container1.add(userTextField5);
		

		back.setBounds(32, 29, 45,25);
	    back.setBackground(new Color(179, 218, 255));
		back.setVerticalAlignment(SwingConstants.CENTER);
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setFont(new Font("ROBOTO",Font.BOLD,15));
		back.setContentAreaFilled(false);
		container1.add(back);
	
		regbutton1.setBounds(580, 535, 130,30);
		regbutton1.setBackground(new Color(179, 218, 255));
		regbutton1.setVerticalAlignment(SwingConstants.CENTER);
		regbutton1.setHorizontalAlignment(SwingConstants.CENTER);
		regbutton1.setFont(new Font("ROBOTO",Font.BOLD,15));
		regbutton1.setContentAreaFilled(false);
		container1.add(regbutton1);
	}
	public void actionevent() {
		regbutton1.addActionListener(this);
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==back)
		{
			this.setVisible(false);
			
		EM ud= new EM();
		ud.setVisible(true);
			
		}
		
		
	
	   if(e.getSource()==regbutton1)
	   {
		   String name = this.userTextField1.getText();
           String id = this.userTextField2.getText();
           String age = this.userTextField3.getText();

           String nationality = this.userTextField4.getText();

           String designation = this.userTextField5.getText();

           


           Employee employee = new Employee(
               name,
               id,
               age,
               nationality,
               designation
           );


           insertEmployee(employee);
           resetUI();
          

           



	   }


      
	}


     public static void insertEmployee(Employee employee){
    	 String path = "F://Swing GUI//src//MainPackage/Employee3.txt";
           File fileToWrite = new File (path);

           
      try (FileWriter fileWriter = new FileWriter(fileToWrite, true)) {
        fileWriter.write(employee.toString());
        JOptionPane.showMessageDialog(null,"Employee has been successfully Registered!!", "Confirmation", JOptionPane.WARNING_MESSAGE);
      } catch (Exception e) {
        System.out.println(e);
      }

      
      

    }


   



    public void resetUI(){
         this.userTextField1.setText(" ");
           this.userTextField2.setText(" ");
           this.userTextField3.setText(" ");
           this.userTextField4.setText(" ");
           this.userTextField5.setText(" ");
    }


   



       


}
	
	
	
	
	
	
	
	
	
	
	
	




	
	
	
	
	
	

