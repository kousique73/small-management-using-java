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


class Emp extends Employee{
	
	Emp(String name,String id,String age, String nationality,String designation){
		
		
		this.name= name;
		this.id= id;
		this.age=age;
		this.nationality=nationality;
		this.designation=designation;
 
	
}
	
}

public class ShowEmployee extends JFrame implements ActionListener{
	
	String path = "F://Swing GUI//src//MainPackage/Employee3.txt";
	int n;
	
	Emp employee[] = new Emp[n];
	
	String name;
	String id;
	String age;
	String nationality;
	String designation;
	
	
	
	Container con = getContentPane();
	JTextField searchBox = new JTextField();
	JButton searchButton = new JButton("Search");
	JButton resetButton = new JButton("Reset");
	
	JButton hbutton= new JButton("Back");
	
	JTextField date= new JTextField();
	
	
	DefaultTableModel model = new DefaultTableModel();
	JTable courseTable = new JTable(model);
	JScrollPane scroll = new JScrollPane(courseTable);
	
	
	
	
	
	
	
	
	ShowEmployee()
	{
		
		this.setTitle(" "+"WALDORF ASTORIA HOTEL_Show Employee");
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
				if(text.equalsIgnoreCase(employee[i].name) || text.equalsIgnoreCase(employee[i].id) ||text.equalsIgnoreCase(employee[i].age) || text.equalsIgnoreCase(employee[i].nationality) || text.equalsIgnoreCase(employee[i].designation))
				{
					model.addRow(new Object[]{employee[i].name,employee[i].id,employee[i].age,employee[i].nationality,employee[i].designation});			
				}
				else if(text.equals(""))
				{
					model.addRow(new Object[]{employee[i].name,employee[i].id,employee[i].age,employee[i].nationality,employee[i].designation});
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
		
		
		
		if(e.getSource()==hbutton) {
			
		      this.dispose();
		      EM employee= new EM();
		      employee.setVisible(true);
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
		employee = new Emp[n];
		
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
	        	employee[i] = new Emp(arr[0], arr[1], arr[2], arr[3],arr[4]);
	        }
	    }
	    catch (Exception ep) {
			System.out.println("ERROR 404! File-Not-Found");
	        
	    }
	}
	public void LoadTable()
	{
		
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Age");
		model.addColumn("Nationality");
		model.addColumn("Designation");
		
		
		for(int i=0; i<n; i++)
		{
			model.addRow(new Object[]{employee[i].name,employee[i].id,employee[i].age,employee[i].nationality,employee[i].designation});			
		}
		
	}
	
	

}
