package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField textField_roomcost;
	private JTextField textField_extrameal;
	private JTextField textField_transport;
	private JTextField textField_accomodation;
	private JTextField textField_special;
	private JTextField textField_vat;
	private JTextField textField_subtotal;
	private JTextField textField_total;
	private JTextField textName;
	private JTextField textMobile;
	private JTextField textNID;
	private JTextField textEmail;
	private JTextField textAddress;
	
	private JFrame frame;
	private JTextArea textArea_reciept;
	
	String iTax,isubtotal,itotal;
	double [] cost= new double[100];

	public Billing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Swing GUI\\src\\MainPackage\\Hotel_logo.png"));
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(0, 0, 1390, 763);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(48, 46, 354, 506);
		panel.add(panel_1);
		
		JLabel lbl_name = new JLabel("NAME:");
		lbl_name.setFont(new Font("SansSerif", Font.BOLD, 20));
		lbl_name.setBounds(10, 39, 110, 31);
		panel_1.add(lbl_name);
		
		JLabel lbl_mobile = new JLabel("MOBILE:");
		lbl_mobile.setFont(new Font("SansSerif", Font.BOLD, 20));
		lbl_mobile.setBounds(10, 116, 86, 31);
		panel_1.add(lbl_mobile);
		
		JLabel lblAddress = new JLabel("ADRESS:");
		lblAddress.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblAddress.setBounds(10, 416, 110, 31);
		panel_1.add(lblAddress);
		
		JLabel lbl_NID = new JLabel("NID:");
		lbl_NID.setFont(new Font("SansSerif", Font.BOLD, 20));
		lbl_NID.setBounds(10, 191, 110, 31);
		panel_1.add(lbl_NID);
		
		JLabel lbl_email = new JLabel("E-MAIL:");
		lbl_email.setFont(new Font("SansSerif", Font.BOLD, 20));
		lbl_email.setBounds(10, 271, 110, 31);
		panel_1.add(lbl_email);
		
		textName = new JTextField();
		textName.setBounds(99, 30, 245, 47);
		panel_1.add(textName);
		textName.setColumns(10);
		
		textMobile = new JTextField();
		textMobile.setColumns(10);
		textMobile.setBounds(99, 110, 245, 47);
		panel_1.add(textMobile);
		
		textNID = new JTextField();
		textNID.setColumns(10);
		textNID.setBounds(99, 185, 245, 47);
		panel_1.add(textNID);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(99, 265, 245, 47);
		panel_1.add(textEmail);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(99, 410, 245, 47);
		panel_1.add(textAddress);
		
		JLabel lblNewLabel_2 = new JLabel("ROOM");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 329, 79, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lbl_roomtype = new JLabel("TYPE:");
		lbl_roomtype.setFont(new Font("SansSerif", Font.BOLD, 20));
		lbl_roomtype.setBounds(10, 355, 79, 26);
		panel_1.add(lbl_roomtype);
		
		JComboBox comBox_roomtype = new JComboBox();
		comBox_roomtype.setModel(new DefaultComboBoxModel(new String[] {"DELUXE SEA SIDE", "DELUXE HILL SIDE", "ECONOMY SEA SIDE", "ECONOMY HILL SIDE"}));
		comBox_roomtype.setFont(new Font("SansSerif", Font.BOLD, 20));
		comBox_roomtype.setEditable(true);
		comBox_roomtype.setBackground(new Color(255, 255, 255));
		comBox_roomtype.setBounds(99, 329, 245, 47);
		panel_1.add(comBox_roomtype);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(20, 14, 20, 14, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1.setBounds(463, 46, 454, 695);
		panel.add(panel_1_1);
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_2_2.setBackground(new Color(95, 158, 160));
		panel_1_2_2.setBounds(36, 476, 383, 190);
		panel_1_1.add(panel_1_2_2);
		
		textField_vat = new JTextField();
		textField_vat.setColumns(10);
		textField_vat.setBounds(203, 10, 170, 44);
		panel_1_2_2.add(textField_vat);
		
		textField_subtotal = new JTextField();
		textField_subtotal.setColumns(10);
		textField_subtotal.setBounds(203, 74, 170, 44);
		panel_1_2_2.add(textField_subtotal);
		
		textField_total = new JTextField();
		textField_total.setColumns(10);
		textField_total.setBounds(203, 136, 170, 44);
		panel_1_2_2.add(textField_total);
		
		JLabel lblNewLabel = new JLabel("VAT");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 9, 162, 44);
		panel_1_2_2.add(lblNewLabel);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblSubtotal.setBounds(10, 74, 162, 44);
		panel_1_2_2.add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblTotal.setBounds(10, 136, 162, 44);
		panel_1_2_2.add(lblTotal);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Room Cost");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox.isSelected()) {
					textField_roomcost.setEnabled(true);
					textField_roomcost.setText(" ");
					textField_roomcost.requestFocus();
					
				}else {
					textField_roomcost.setEnabled(false);
					textField_roomcost.setText("0");
				}
				
			}
		});
		chckbxNewCheckBox.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox.setFont(new Font("SansSerif", Font.BOLD, 17));
		chckbxNewCheckBox.setBounds(36, 56, 166, 56);
		panel_1_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxExtraMeal = new JCheckBox("Extra Meal");
		chckbxExtraMeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxExtraMeal.isSelected()) {
					textField_extrameal.setEnabled(true);
					textField_extrameal.setText(" ");
					textField_extrameal.requestFocus();
					
				}else {
					textField_extrameal.setEnabled(false);
					textField_extrameal.setText("0");
				}
				
			}
		});
		chckbxExtraMeal.setBackground(new Color(176, 224, 230));
		chckbxExtraMeal.setFont(new Font("SansSerif", Font.BOLD, 17));
		chckbxExtraMeal.setBounds(36, 145, 166, 56);
		panel_1_1.add(chckbxExtraMeal);
		
		JCheckBox chckbxTransport = new JCheckBox("Transport");
		chckbxTransport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxTransport.isSelected()) {
					textField_transport.setEnabled(true);
					textField_transport.setText(" ");
					textField_transport.requestFocus();
					
				}else {
					textField_transport.setEnabled(false);
					textField_transport.setText("0");
				}
				
			}
		});
		chckbxTransport.setBackground(new Color(176, 224, 230));
		chckbxTransport.setFont(new Font("SansSerif", Font.BOLD, 17));
		chckbxTransport.setBounds(36, 232, 221, 56);
		panel_1_1.add(chckbxTransport);
		
		JCheckBox chckbxAccomodationService = new JCheckBox("Accomodation \r\nService");
		chckbxAccomodationService.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxAccomodationService.isSelected()) {
					textField_accomodation.setEnabled(true);
					textField_accomodation.setText(" ");
					textField_accomodation.requestFocus();
					
				}else {
					textField_accomodation.setEnabled(false);
					textField_accomodation.setText("0");
				}
				
			}
		});
		chckbxAccomodationService.setBackground(new Color(176, 224, 230));
		chckbxAccomodationService.setFont(new Font("SansSerif", Font.BOLD, 17));
		chckbxAccomodationService.setBounds(36, 323, 221, 56);
		panel_1_1.add(chckbxAccomodationService);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Special Service");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxNewCheckBox_4.isSelected()) {
					textField_special.setEnabled(true);
					textField_special.setText(" ");
					textField_special.requestFocus();
					
				}else {
					textField_special.setEnabled(false);
					textField_special.setText("0");
				}
				
			}
		});
		chckbxNewCheckBox_4.setBackground(new Color(176, 224, 230));
		chckbxNewCheckBox_4.setFont(new Font("SansSerif", Font.BOLD, 17));
		chckbxNewCheckBox_4.setBounds(36, 408, 166, 56);
		panel_1_1.add(chckbxNewCheckBox_4);
		
		textField_roomcost = new JTextField();
		textField_roomcost.setBounds(276, 56, 120, 52);
		panel_1_1.add(textField_roomcost);
		textField_roomcost.setColumns(10);
		
		textField_extrameal = new JTextField();
		textField_extrameal.setColumns(10);
		textField_extrameal.setBounds(276, 151, 120, 52);
		panel_1_1.add(textField_extrameal);
		
		textField_transport = new JTextField();
		textField_transport.setColumns(10);
		textField_transport.setBounds(276, 238, 120, 52);
		panel_1_1.add(textField_transport);
		
		textField_accomodation = new JTextField();
		textField_accomodation.setColumns(10);
		textField_accomodation.setBounds(276, 329, 120, 52);
		panel_1_1.add(textField_accomodation);
		
		textField_special = new JTextField();
		textField_special.setColumns(10);
		textField_special.setBounds(276, 414, 120, 52);
		panel_1_1.add(textField_special);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1_1.setBackground(new Color(176, 224, 230));
		panel_1_1_1.setBounds(940, 51, 396, 667);
		panel.add(panel_1_1_1);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setBounds(20, 510, 352, 129);
		panel_1_1_1.add(panel_1_2_1);
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_2_1.setBackground(new Color(95, 158, 160));
		
	
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		System.exit(0);
			
			
			}
		});
		btnExit.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 25));
		btnExit.setBounds(57, 29, 241, 74);
		panel_1_2_1.add(btnExit);
		
		JTextArea textArea_reciept = new JTextArea();
		textArea_reciept.setBounds(20, 21, 352, 479);
		panel_1_1_1.add(textArea_reciept);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(48, 582, 354, 136);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_2.setBackground(new Color(95, 158, 160));
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cost[0]= Double.parseDouble(textField_roomcost.getText())*800;
				cost[1]= Double.parseDouble(textField_extrameal.getText())*200;
				cost[2]= Double.parseDouble(textField_transport.getText())*200;
				cost[3]= Double.parseDouble(textField_accomodation.getText())*350;
				cost[4]= Double.parseDouble(textField_special.getText())*380;
				
				cost[5]= cost[0]+  cost[1]+  cost[2]+  cost[3]+  cost[4];
				
				iTax= String.format("$ %.2f ", cost[5]/100);
				isubtotal=String.format("$ %.2f",cost[5]);
				itotal= String.format("$ %.2f", cost[5]+ (cost[5]/100));
				
				textField_vat.setText(iTax);
				textField_subtotal.setText(isubtotal);
				textField_total.setText(itotal);
				
				textArea_reciept.setEnabled(true);
				
				
			Calendar timer= Calendar.getInstance();
			timer.getTime();
			SimpleDateFormat tTime= new SimpleDateFormat("HH:mm:ss");
			tTime.format(timer.getTime());
			SimpleDateFormat tDate= new SimpleDateFormat("dd-MMM-yyyy");
			tDate.format(timer.getTime());
			
			
			textArea_reciept.append("\t     Money Receipt\n"  +
			
				"\n========================================================\t" +
				"\nName:\t\t\t" + textName.getText()+
				"\nMobile:\t\t\t" +textMobile.getText()+
				"\nRoom Cost:\t\t\t" + textField_roomcost.getText()+
				"\nExtra Meal:\t\t\t" + textField_extrameal.getText()+
				"\nTransport:\t\t\t" + textField_transport.getText()+
				"\nAccomodation:\t\t\t" + textField_accomodation.getText()+
				"\nSpecial Cost:\t\t\t" + textField_special.getText()+
				
				"\n========================================================\t" +
				"\nVat:\t\t\t" + iTax+
				"\nSub Total:\t\t\t" +isubtotal+
				"\nTotal:\t\t\t" + itotal+
				
				"\n========================================================\t" +
				
				"\nDate: "+ tDate.format(timer.getTime())+
				      "\t\tTime: "+ tTime.format(timer.getTime()) +
				      
				     "\n\n\tThanks for Choosing us\n");
				
			}
		});
		btnTotal.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnTotal.setBounds(20, 27, 141, 74);
		panel_1_2.add(btnTotal);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argsO) {
			 
				try {
					textArea_reciept.print();
				}
				catch(java.awt.print.PrinterException ex) {
					System.err.format("No printer Found", ex.getMessage());
				}
			
			}
		});
		btnPrint.setFont(new Font("SansSerif", Font.BOLD, 25));
		btnPrint.setBounds(190, 27, 141, 74);
		panel_1_2.add(btnPrint);
	}
}