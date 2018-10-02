package swinginit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import com.mysql.jdbc.PreparedStatement;



public class Discharge 
{

	public static void main(String[] args)
	{
	    
		@SuppressWarnings("unused")
		Balance windowb = new Balance();
		
		
	}

}



@SuppressWarnings("serial")
class Balance extends JFrame implements ActionListener
{

	JLabel contact,Admin,discharge,name,id,phone,collen,collen1,collen2,collen3,adate;
	
	JPanel footer,header;
	JButton confirm;
	JTable table1,table2,table3,table4;
	
	
     
	Balance() 
	{
		
		setLayout(null) ; 
    	
		   Font style1 = new Font("",Font.BOLD,30);
		
           discharge = new JLabel("Confirmation of Discharge");    	
           
           discharge.setBounds(100,50,800,300);
           
           discharge.setFont(style1);
           
           name = new JLabel("Name");
           
           name.setBounds(100,200,100,100);
           
           
           
           table1 = new JTable();
           
           table1.setBounds(230,240,400,18);
           
           try{
   			
       		Class.forName("com.mysql.jdbc.Driver");
       		
       		 
       		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
       		
       	     PreparedStatement  state =  (PreparedStatement) con.prepareStatement("select name from patient where name='"+HelpertoPass.name+"' and id ="+HelpertoPass.id+"");
       		  
       		  ResultSet set = state.executeQuery();
       		      
       		  
       		table1.setModel(DbUtils.resultSetToTableModel(set));
       		
       		
       		
       		}
       		catch(Exception  exe)
       		{
       			
       			
       			
       		}
         
  		      
  		  
  		
           
  		
  	           
           
           collen = new JLabel(":");
           
           collen1 = new JLabel(":");
           collen2= new JLabel(":");
           collen3 = new JLabel(":");
           
           collen.setBounds(200,200,10,100);
           
           add(collen);
           
           id = new JLabel("Id");
           
           id.setBounds(100,250,100,100);
           
           table2 = new JTable();
           table2.setBounds(230,290,400,18);
       
           try{
      			
          		Class.forName("com.mysql.jdbc.Driver");
          		
          		 
          		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
          		
          	     PreparedStatement  state =  (PreparedStatement) con.prepareStatement("select id from patient where name='"+HelpertoPass.name+"' and id ="+HelpertoPass.id+"");
          		  
          		  ResultSet set = state.executeQuery();
          		      
          		  
          		table2.setModel(DbUtils.resultSetToTableModel(set));
          		
          		
          		
          		}
          		catch(Exception  exe)
          		{
          			
          			
          			
          		}
         
           
         
           
           collen1.setBounds(200,250,10,100);
           
           add(collen1);
           
           phone = new JLabel("Phone No.");
           
           phone.setBounds(100,300,100,100);
           
           table3 = new JTable();
           table3.setBounds(230,340,400,18);
           
           try{
      			
          		Class.forName("com.mysql.jdbc.Driver");
          		
          		 
          		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
          		
          	     PreparedStatement  state =  (PreparedStatement) con.prepareStatement("select phoneno from patient where name='"+HelpertoPass.name+"' and id ="+HelpertoPass.id+"");
          		  
          		  ResultSet set = state.executeQuery();
          		      
          		  
          		table3.setModel(DbUtils.resultSetToTableModel(set));
          		
          		
          		
          		}
          		catch(Exception  exe)
          		{
          			
          			
          			
          		}
           
           
           
           
           collen2.setBounds(200,300,10,100);
           
           add(collen2);

                  
           adate = new JLabel("Date of Admit ");
           
           adate.setBounds(100,350,200,100);
            
           table4 = new JTable();
           table4.setBounds(230,390,400,18);
           
           try{
      			
          		Class.forName("com.mysql.jdbc.Driver");
          		
          		 
          		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
          		
          	     PreparedStatement  state =  (PreparedStatement) con.prepareStatement("select adate from patient where name='"+HelpertoPass.name+"' and id ="+HelpertoPass.id+"");
          		  
          		  ResultSet set = state.executeQuery();
          		      
          		  
          		table4.setModel(DbUtils.resultSetToTableModel(set));
          		
          		
          		
          		}
          		catch(Exception  exe)
          		{
          			
          			
          			
          		}
           
           
           collen3.setBounds(200,350,10,100);
           
           add(collen3);
           
           Icon img = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\project image\\confirm.jpg");
           
           confirm = new JButton(img);
           
           confirm.setBounds(300,460,200,60);
           
           confirm.addActionListener(this);
           
		   contact = new JLabel("© 2018 HEALTHCARE INDIA CONTACT 98766543 PUNE-01");
		   
	  	   Font style5 = new Font("",Font.BOLD,20);
	  	   
	  	   contact.setFont(style5);
	  	   
	  	   contact.setForeground(Color.white);
	  	   
	  	   contact.setBounds(15,510, 100,100);
	  	   
	  	   footer = new JPanel();
	  	   
	  	   footer.setBounds(0,600 ,1020,140);
	  	   
	  	   footer.setBackground(Color.black);
	  	   
	  	     
	  	   footer.add(contact); 
	  	   
          Admin = new JLabel("ADMIN");
 	   
 	      Admin.setBounds(160, 5 ,360 ,100);
        
 	      Font style = new Font("",Font.BOLD,60);
 	   
 	      Admin.setFont(style);
 	      
 	     
	    	  
	      header = new JPanel();
		  header.setBounds(0, 0, 1020,100);
	     
		  header.setBackground(Color.yellow);
		  
		  
		  
		  
		  
          
            add(table1);
            add(table2);
            add(table3);
            add(table4);
		    add(confirm);
		    add(adate);
		    add(phone);
		    add(id); 
		    add(name); 
		    add(discharge);
		    add(header);
            add(footer);
		    header.add(Admin);
		    setVisible(true);  
	    	setSize(800,750);  
	    	setDefaultCloseOperation(3);
		
		
	}
	
	
	
	
	
	




	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		
		new All();
		
	}
	



}
