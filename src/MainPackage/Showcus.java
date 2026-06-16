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
import java.io.IOException;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;




class cus extends Customer{
	
	cus(String name,String nid,int age,int phoneNumber,String nationality)
		{
			this.name=name;
			this.nid=nid;
			this.age = age;
			this.phoneNumber = phoneNumber;
			this.nationality = nationality;

		}
}
public class Showcus extends JFrame implements ActionListener {
	
	String path = "F://Swing GUI//src//MainPackage/Customer3.txt";
	int n;
	
	cus customer[] = new cus[n];
	
	String name;
	String nid;
	int age;
	int phoneNumber;
	String nationality;
	
	
	
	Container con = getContentPane();
	JTextField searchBox = new JTextField();
	JButton searchButton = new JButton("Search");
	JButton resetButton = new JButton("Reset");
	
	JButton hbutton= new JButton("Back");
	
	JTextField date= new JTextField();
	
	DefaultTableModel model = new DefaultTableModel();
	JTable courseTable = new JTable(model);
	JScrollPane scroll = new JScrollPane(courseTable);
	
	
	
	
	
	
	
	
	Showcus()
	{
		
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Show Customer");
    	this.setBounds(300, 100, 800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
        
        countLines();
        Load();
        
        LoadTable();
        
        Init();
        addActionEvent();
	}
	
	public void Init()
	{	
		con.setLayout(null);
		con.setBackground(new Color(95, 147, 160));
		scroll.setBounds(100, 100, 500, 200);
    	con.add(scroll);
    	
		searchBox.setBounds(250, 50, 250, 25);
		searchBox.setToolTipText("Search here");
		searchBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        con.add(searchBox);
        
        searchButton.setBounds(500, 50, 95, 25);
        searchButton.setBackground(new Color(41, 232, 242));
        searchButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con.add(searchButton);
        
        resetButton.setBounds(600, 50, 95, 25);
        resetButton.setBackground(new Color(41, 232, 242));
        resetButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con.add(resetButton);
        

        
        hbutton.setBounds(600, 350, 95, 25);
        hbutton.setBackground(new Color(41, 232, 242));
        hbutton.setFont(new Font("San Francisco", Font.BOLD, 17));
        con.add(hbutton);
        
        
        
		
	}
	
	public void addActionEvent()
	{
		searchButton.addActionListener(this);
		resetButton.addActionListener(this);
		hbutton.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		

		if(e.getSource() == searchButton)
		{
			String text = searchBox.getText();
			model.setRowCount(0); 
			
			for(int i=0; i<n; i++)
			{
				if(text.equalsIgnoreCase(customer[i].name) || text.equalsIgnoreCase(customer[i].nid) ||text.equals(customer[i].age) || text.equals(customer[i].phoneNumber) || text.equalsIgnoreCase(customer[i].nationality))
				{
					model.addRow(new Object[]{customer[i].name,customer[i].nid,customer[i].age,customer[i].phoneNumber,customer[i].nationality});			
				}
				else if(text.equals(""))
				{
					model.addRow(new Object[]{customer[i].name,customer[i].nid,customer[i].age,customer[i].phoneNumber,customer[i].nationality});
				}
			}
		}
		if(e.getSource() == resetButton)
		{	
			if(!searchBox.equals(""))
			{
				model.setRowCount(0); // clear table contents
				model.setColumnCount(0);
				searchBox.setText("");
				LoadTable();
			}
		}

		if(e.getSource()==hbutton)
		{
			this.dispose();
			
		    CM customer= new CM();
		    customer.setVisible(true);
		}
		
		
		
		
	}
	public int countLines()
	{
		int count=0;
		try {
			Scanner get = new Scanner(new File(path));
			
	        while(get.hasNextLine())
	        {
	            get.nextLine();
	            count++;
	        }
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		n = count;
		customer = new cus[n];
		
        return count;
	}
	
	public void Load()
	{
		try
	    {
			
			Scanner get = new Scanner(new File(path));
	        String line, arr[];
	        
	        for(int i=0; i<n; i++)
	        {
	        	line = get.nextLine();
	        	arr = line.split(" ");
	        	customer[i] = new cus(arr[0], arr[1],Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),arr[4]);
	        }
	    }
	    catch (Exception ep) {
			System.out.println("ERROR 404! File-Not-Found");
	        
	    }
	}
	

	public void LoadTable()
	{
		
		model.addColumn("Name");
		model.addColumn("NID");
		model.addColumn("Age");
		model.addColumn("Phone Number");
		model.addColumn("Nationality");
		
		
		for(int i=0; i<n; i++)
		{
			model.addRow(new Object[]{customer[i].name,customer[i].nid,customer[i].age,customer[i].phoneNumber,customer[i].nationality});			
		}
		
	}
	
	

}
