package swinginit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

import com.mysql.jdbc.PreparedStatement;

import java.sql.*;




public class insert {
	
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		
		GetIn frame = new GetIn();
		
		
	}

}



 class GetIn extends JFrame implements ActionListener 
{
	
	private static final long serialVersionUID = -4448828575963338090L;
	JPanel header,footer;
	
	JLabel contact,name,phoneno,dateofb,bloodgrp,address,title,lsymptoms;
	
	JTextField namebox,phonebox;
	
    JComboBox<?> blooddrop;
    
    JTextArea addressbox;
    
    JButton submit;
    
    JDatePickerImpl datepicker;
	
	JTextArea symptoms;
    
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public GetIn()
      {
		
		
    	setLayout(null);  
    	
    	
    	
	   contact = new JLabel("© 2018 HEALTHCARE INDIA CONTACT 98766543 PUNE-01");
	   
  	   Font style5 = new Font("",Font.BOLD,20);
  	   
  	   contact.setFont(style5);
  	   
  	   contact.setForeground(Color.white);
  	   
  	   contact.setBounds(15,510, 100,100);
  	   
  	   footer = new JPanel();
  	   
  	   footer.setBounds(0,600 ,1020,140);
  	   
  	   footer.setBackground(Color.black);
  	   
  	     
  	   footer.add(contact); 
    	  
  	    header = new JPanel();
	   header.setBounds(0, 0, 1020,100);
     
	   header.setBackground(Color.yellow);
	   
	   Font style = new Font("",Font.BOLD,30);
	   
	   title = new JLabel("Make enter of  new patient ");
	    
	   title.setFont(style);
	    
	   title.setBounds(10,110,600,100);
	   
	   name = new JLabel("Name");
	   	   
	   name.setBounds(10,150,100,100);
	   
       namebox = new JTextField(40);
	   
	   namebox.setBounds(120, 190,400,20);
	   
	   phoneno = new JLabel("Phone No.");
	   
	   phoneno.setBounds(10, 190, 100,100);
	   
	   phonebox = new JTextField(40);
	   
	   phonebox.setBounds(120, 230, 400, 20);
	   
	   address = new JLabel("Address");
	   
	   address.setBounds(10,230, 300,100);
	   
	   addressbox = new JTextArea();
	   
	   addressbox.setBounds(120,270, 400, 60);
	   
	   bloodgrp = new JLabel("blood group");
	   
	   bloodgrp.setBounds(10,300,100,100);
	  
	   String[] option = {"none","O+","O-","A+","A-","B+","B-"}; 
	   blooddrop = new JComboBox(option);
	   
	   blooddrop.setBounds(120,340,400,20);
	   
	    blooddrop.setSelectedIndex(0);
	   
	    dateofb = new JLabel("DOB");
	    
	    dateofb.setBounds(10,360,100,100);
	    
	   SqlDateModel model = new SqlDateModel();
	    
	    Properties p = new Properties();
	    p.put("text.today","text");
	    p.put("text.month", "month");
	    p.put("text.year", "year");
	    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);  
	     datepicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
	    datepicker.setBounds(120,400, 200, 30);
	    datepicker.setShowYearButtons(true);
	    datepicker.setTextEditable(true);
	   
        lsymptoms = new JLabel("symptons");
    	
    	lsymptoms.setBounds(10,400,100,100);
		
    	symptoms = new JTextArea(); 
    	
    	symptoms.setBounds(120, 440, 400,100);
	    
	    JLabel label1 = new JLabel("HEALTHCARE.COM");
	    
	    Font fg = new Font("BOLD", Font.BOLD, 50);
        
        label1.setFont(fg);
         
		label1.setBounds(110,10,700,50);
		
	    header.add(label1);
		 
	    submit = new JButton("Submit");
	    
	    submit.setBounds(300,550,80,30);
	    
	   add(dateofb);
	   add(submit);	
	   add(datepicker);
	   add(blooddrop);
	   add(bloodgrp);
	   add(addressbox);
	   add(address);
	   add(phonebox);
	   add(phoneno);
	   add(title);
	   add(name);
	   add(footer);
	   add(header);
	   add(namebox);
	   add(lsymptoms);
	   add(symptoms);
	   
       submit.addActionListener(this);
	   
	  	setVisible(true);  
    	setSize(800,750);  
    	setDefaultCloseOperation(3);
    	  
    	  
      }



	@Override
	public void actionPerformed(ActionEvent e)  {
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection =  DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital","root","root");
			
			String name = namebox.getText();
			
			int phone = Integer.parseInt(phonebox.getText());
			
			String address = addressbox.getText();
			
			String blood = blooddrop.getSelectedItem().toString();
			
			String symptom = symptoms.getText();
	
	        java.sql.Date selecteddate = (java.sql.Date) datepicker.getModel().getValue();
			
	        System.out.println(selecteddate);
			java.sql.PreparedStatement state =  (PreparedStatement) connection.prepareStatement("insert into patient (name,phoneno,address,blood,dob,symptoms) values(?,?,?,?,?,?);");
		    
			state.setString(1,name);
			 state.setInt(2,phone);
			state.setString(3,address);
			state.setString(4,blood);
			state.setDate(5, selecteddate);
			state.setString(6,symptom);
		@SuppressWarnings("unused")
		int result = state.executeUpdate();
		    
			
		} catch (Exception e1)
		{
			
			
		}
		
		
	}

}
 
  class DateLabelFormatter extends AbstractFormatter
 {
	
	private static final long serialVersionUID = 1L;
	SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
	
	@Override
	public Object stringToValue(String text) throws ParseException {
		
		return date.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		
		if(value != null)
		{
			Calendar calc = (Calendar) value;
			return date.format(calc.getTime());
		}
		return "";
	}
	 
	 //  create table patient(id int(5) primary key auto_increment,name varchar(30),phoneno int(20),address varchar(30),blood varchar(12),adate timestamp default now(),dob date,symptoms varchar(20));
	 
	// insert into patient(name,phoneno,address,blood,dob,symptoms) values("omkar",23345,"ghulenagar pune","o+",'2100-3-4',"fr fd");
	 
 }