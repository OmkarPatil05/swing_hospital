package swinginit;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;




import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

import com.mysql.jdbc.*;

public class Admin {
	

	public static void main(String[] args) throws Exception
	{        @SuppressWarnings("unused")
	         Work frame = new Work(); 	

	}

}


class Work extends JFrame implements ActionListener 

{
     
	private static final long serialVersionUID = 1L;

	JLabel Name,Id,Admin;
       
       JTextField ntext,Itext;
       
       JTable data;
       
       JButton Search,discharge;
       JLabel idno,name,phone,adate,DOB,contact;
     
       JPanel header,footer;
       
       
       
       Work()
       {
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
    	   header.setBounds(0, 0,1020,100);
           
    	   header.setBackground(Color.ORANGE);
    	   
    	   header.add(Admin);
    	   
    	   setContentPane(new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\project image\\500_F_47061772_8qnuRmazxpZpcURhdGbJCGVgSVa3haYg.jpg")));
    	   
    	   
    	   
    	   Name = new JLabel("Name");
    	   
    	   Name.setBounds(100,89, 150,150);
    	   
           Font letter = new Font("", Font.BOLD, 20);
           
           Name.setFont(letter);
           
           Id = new JLabel("Id No.");
           
           Id.setBounds(100, 138, 150, 150);
           
           Id.setFont(letter);
           
           ntext = new JTextField(40);
           
           ntext.setBounds(250, 150, 400,20 );
        	
           Itext = new JTextField(40);
           
           Itext.setBounds(250, 200, 400,20);
        	
             data = new JTable();
           data.setBounds(90,350, 900,18);
            
         
          
          
           Search = new JButton("search");
           
           Search.setBounds(270,270, 200, 30);
           
           discharge = new JButton("Discharge");
           
           discharge.setBounds(270,420,200,30);
           
           
           
           idno = new JLabel("ID");
           
           idno.setBounds(110, 290, 100, 100);
           Font style1 = new Font("", Font.BOLD, 15);
           idno.setFont(style1);
             
           name = new JLabel("NAME");
           
           name.setBounds(280, 290, 100,100);
           name.setFont(style1);
           
           phone = new JLabel("PHONE NO.");
           phone.setBounds(450,290, 300, 100);
           phone.setFont(style1);
           
           Font style2 = new Font("", Font.BOLD,15);
          adate = new JLabel("ADMIT DATE");
           adate.setBounds(650, 290,300, 100);
           adate.setFont(style2);
           
           DOB = new JLabel("DOB");
           DOB.setBounds(850, 290,100,100);
           DOB.setFont(style2);
           Search.addActionListener(this);
           discharge.addActionListener(this);
           
            add(discharge);
            add(Admin);          
            add(Name);
            add(Id);
            add(ntext);
            add(Itext);
            add(data);
            add(Search);
            add(idno);
            add(name);
            add(phone);
            add(adate);
            add(DOB);
            add(header);
            add(footer);
    	     setLayout(null);   
    	   setVisible(true);
    	   setDefaultCloseOperation(3);
    	   setSize(800,700);
    	   
    	   
       }



	public void actionPerformed(ActionEvent e) 
	{
		
		Object object = e.getSource();
		JButton button = (JButton) object;
		
		if( button == Search )
		{	
			
		try{
			
		Class.forName("com.mysql.jdbc.Driver");
		
		 HelpertoPass.name= ntext.getText();
		 
		 HelpertoPass.id = Integer.parseInt(Itext.getText());
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
		
	     PreparedStatement  state =  (PreparedStatement) con.prepareStatement("select id,name,phoneno,adate,dob from patient where name='"+HelpertoPass.name+"' and id ="+HelpertoPass.id+"");
		  
		  ResultSet set = state.executeQuery();
		      
		  
		data.setModel(DbUtils.resultSetToTableModel(set));
		
		
		
		}
		catch(Exception  exe)
		{
			
			
			
		}
		}
		 if(button == discharge)
		{
			new Balance();
			
		}
		
		
	}
	


}


