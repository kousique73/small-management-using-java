package MainPackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.swing.*;


public class DeleteCus extends JFrame implements ActionListener  {
	 
	 Container decontainer = getContentPane();
	 JTextField userTextField = new JTextField();
	 JButton select= new JButton();
	 JButton back= new JButton();
	 
	 
	 DeleteCus() {
		 this.setTitle(" "+"WALDORF ASTORIA HOTEL_Delete Customer");
		 this.setBounds(200, 0, 1080, 768);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setResizable(true);
		 
		 
		 this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		 
		 
		 Initial();
		 addActionEvent();
		  
		}
	
	public void Initial(){
		
		decontainer.setLayout(null);
		decontainer.setBackground(Color.WHITE);
		
		ImageIcon bgim = new ImageIcon(this.getClass().getResource("Delete_page_cutomer.jpg")); 
		JLabel bg1 = new JLabel("",bgim,JLabel.CENTER); 
		bg1.setBounds(0, 0, 1080, 768);
		decontainer.add(bg1);
		
		userTextField.setBounds(364, 376, 457, 40);
		userTextField.setToolTipText("Enter NID No");
		userTextField.setFont(new Font("ROBOTO",Font.PLAIN,15));
		userTextField.setBackground(new Color(240,240,240));
		userTextField.setBorder(null);
		decontainer.add(userTextField);
		
		
		back.setBounds(32, 29, 45,25);
	    back.setBackground(new Color(179, 218, 255));
		back.setVerticalAlignment(SwingConstants.CENTER);
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setFont(new Font("ROBOTO",Font.BOLD,15));
		back.setContentAreaFilled(false);
		decontainer.add(back);
		
		
		select.setBounds(420, 547, 239, 45);
		select.setBackground(Color.BLUE);
		select.setVerticalAlignment(SwingConstants.CENTER);
		select.setHorizontalAlignment(SwingConstants.CENTER);
		select.setBackground(new Color(209, 237, 225));
		select.setFont(new Font("ROBOTO",Font.BOLD,13));
		select.setContentAreaFilled(false);
		decontainer.add(select);
	 }
	
	public void addActionEvent() {
		select.addActionListener(this);
		back.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	   if(e.getSource()==select) {

		   String path = "F://Swing GUI//src//MainPackage/Customer3.txt";
		   String path2 = "F://Swing GUI//src//MainPackage/Customer4.txt";

		   File fileToRead = new File(path);
		   File fileToWrite = new File(path2);
			
	        try (
      Scanner reader = new Scanner(fileToRead)
    ) {

      while (reader.hasNextLine()) {
        String readLine = reader.nextLine();
        String[] attributesOfPerson = readLine.split(" ");

        int index=0;
		String name = attributesOfPerson[index++];
		String nid = attributesOfPerson[index++];
		 String age = attributesOfPerson[index++];
		String phoneNumber = attributesOfPerson[index++];
		String nationality = attributesOfPerson[index++];
           
		int ageInt = Integer.parseInt(age);
		int phoneNumberInt = Integer.parseInt(phoneNumber);
		
		
		Customer customer = new Customer(
			name,
			nid,
			ageInt,
			phoneNumberInt,
			nationality
		);

		if(customer.nid.equals(userTextField.getText()) ){


		}else{

		 try (FileWriter fileWriter = new FileWriter(fileToWrite, true)) {
        fileWriter.write(customer.toString()); 
      } catch (Exception epp) {
        System.out.println(epp);
      }

		}

        
      }


    } catch (Exception ep) {
      System.out.println(ep);
    }


    File myObj = new File(path); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 


    String pathNew = "F://Swing GUI//src//MainPackage/Customer3.txt";
    File fileToReadFrom = new File(path2);
	File fileToWriteTo = new File(pathNew);


	try (
      Scanner reader = new Scanner(fileToReadFrom)
    ) {

      while (reader.hasNextLine()) {
        String readLine = reader.nextLine();
        String[] attributesOfPerson = readLine.split(" ");

        int index=0;
		String name = attributesOfPerson[index++];
		String nid = attributesOfPerson[index++];
		String age = attributesOfPerson[index++];
		String phoneNumber = attributesOfPerson[index++];
		String nationality = attributesOfPerson[index++];
		
		int ageInt = Integer.parseInt(age);
		int phoneNumberInt = Integer.parseInt(phoneNumber);
		
		Customer customer = new Customer(
				name,
				nid,
				ageInt,
				phoneNumberInt,
				nationality
			);

		if(customer.nid.equals(userTextField.getText()) ){


		}else{

		 try (FileWriter fileWriter = new FileWriter(fileToWriteTo, true)) {
        fileWriter.write(customer.toString()); 
      } catch (Exception epp) {
        System.out.println(epp);
      }

		}

        
      }


    } catch (Exception ep) {
      System.out.println(ep);
    }

   

		
	}
	   
	   if(e.getSource()==back)
	   {
		   this.dispose();
		   
		   CM customer= new CM();
		    customer.setVisible(true);
	   }
	
	
	}

}
