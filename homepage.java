package swinginit;
import java.sql.*;

import java.util.Properties;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;




import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;

public class homepage {

	public static void main(String[] args) throws Exception {
		
		@SuppressWarnings("unused")
		sign h=new sign();
		
	}

}

@SuppressWarnings("serial")
class sign extends JFrame implements ActionListener
{

	JPanel header,footer;
	JLabel contact,title,login,signin,username,password,signword,question,name,email,phoneno,gender,passwords,repassword,DOB;
    JTextField userbox,namebox,emailbox,phonebox;
    JButton loginbutton,signinbutton,buttonsignin;
    JRadioButton yes,no,male,female;
    ButtonGroup bgroup,gendergroup;
    JPasswordField passtext,repasstext,passwordbox;
    JDatePickerImpl datepicker;
	sign()
	{
		
		
		 contact = new JLabel("© 2018 HEALTHCARE INDIA CONTACT 98766543 PUNE-01");
  	   
  	   Font style5 = new Font("",Font.BOLD,20);
  	   
  	   contact.setFont(style5);
  	   
  	   contact.setForeground(Color.white);
  	   
  	   contact.setBounds(15,540, 100,100);
  	   
  	   footer = new JPanel();
  	   
  	   footer.setBounds(0,630 ,1020,140);
  	   
  	   footer.setBackground(Color.black);
  	   
  	     
  	   footer.add(contact); 
		
		
		
		setContentPane(new JLabel(new ImageIcon("")));
 		
		setLayout(null);
		
	    header = new JPanel();
	    
	    header.setBackground(Color.CYAN);
	    
	    header.setLayout(null);
	    
	    header.setBounds(0, 0,1020, 100);
		
		title = new JLabel("HEALTHCARE.COM");
		
        title.setLayout(null);
         
        Font fg = new Font("BOLD", Font.BOLD, 50);
         
        title.setFont(fg);
         
		title.setBounds(110,10,700,50);
		
	    header.add(title);
		
	    login = new JLabel("LOGIN");
	    
	    Font size = new Font("",Font.BOLD,30);
	    
	    login.setFont(size);
	    
	    login.setBounds(350,40,300,300);
	    
        signin = new JLabel("SIGN IN");
	     
        signin.setFont(size);
	    
        signin.setBounds(350,40,300,300);
	    signin.setVisible(false);
	    username = new JLabel("username");
	    
	    username.setBounds(180,200,100,100);
	    
        name = new JLabel("name");
	    
	    name.setBounds(180,200,100,100);
	    
	    name.setVisible(false);
	    userbox = new JTextField(40);
	    
	    userbox.setBounds(250,240, 400, 20);
	    
	    namebox = new JTextField(40);
	    
	    namebox.setBounds(250,240, 400, 20);
        namebox.setVisible(false); 
	    
	    password = new JLabel("password");
	    
	    password.setBounds(180,250,100,100);
	    
	    email = new JLabel("email ID");
	    
	    email.setBounds(180,250,100,100);
        email.setVisible(false);
	    
	    passwordbox = new JPasswordField(40);
	    
	    passwordbox.setBounds(250,290,400,20);
        
	    emailbox = new JTextField(40);
	    
	    emailbox.setBounds(250,290,400,20);
        
	    emailbox.setVisible(false);
	    
	    phoneno = new JLabel("Phone no.");
	    
	    phoneno.setBounds(180,300,100,100);
	    
	    phonebox = new JTextField(40);
	    
	    phonebox.setBounds(250,340, 400,20);
	    
	    gender = new JLabel("Gender");
	    
	    gender.setBounds(180,350,100,100);
	    
	    male = new JRadioButton("male");
	    
	    male.setBounds(270,375,70,50);
	    
	    female = new JRadioButton("female");
	    
	    female.setBounds(380,375,70,50);
	    
	    passwords = new JLabel("Password");
	    
	    passwords.setBounds(180,400,100,100);
	    
	    passtext = new JPasswordField(40);
        
	    passtext.setBounds(250,440,400,20);
	    
	    repassword = new JLabel("re-Password");
	    
	    repassword.setBounds(170,450,100,100);
	    
	    repasstext = new JPasswordField(40);
        
	    repasstext.setBounds(250,490,400,20);
	    
	    DOB = new JLabel("DOB");
	    
	    DOB.setBounds(200,500, 100,100);
	    
	    repasstext.setVisible(false);
	    repassword.setVisible(false);
	    passtext.setVisible(false);
	    male.setVisible(false);
	    female.setVisible(false);
	    gender.setVisible(false);
	    passwords.setVisible(false);
	    phoneno.setVisible(false);
	    phonebox.setVisible(false);
	    DOB.setVisible(false);
	    
	    
	    question = new JLabel("Dont't have a account ?");
	    
	    question.setBounds(250,450,400,100);
	    
	    yes = new JRadioButton("yes");
	    
	    yes.setBounds(390,475,50,50);
	    
        no = new JRadioButton("no");
        
        no.setBounds(450,475,50,50);
        
        loginbutton = new JButton("login");
        
       loginbutton.setBounds(390,340,80,30);
        
       loginbutton.addActionListener(this);
       
       signinbutton = new JButton("signin");
       
       signinbutton.setBounds(390,590,80,30);
       
       signinbutton.addActionListener(this);
       
       
       
       buttonsignin = new JButton("sign in");
       
       buttonsignin.setBounds(390,590,80,30);
       
       buttonsignin.setVisible(false);
       
       buttonsignin.addActionListener(this);
       
       
       
       
       
       SqlDateModel model = new SqlDateModel();
	    
	    Properties p = new Properties();
	    p.put("text.today","text");
	    p.put("text.month", "month");
	    p.put("text.year", "year");
	    JDatePanelImpl datePanel = new JDatePanelImpl(model, p);  
	     datepicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
	    datepicker.setBounds(250,540, 200, 30);
	    datepicker.setShowYearButtons(true);
	    datepicker.setTextEditable(true);
        
	    datepicker.setVisible(false);
       
	    add(buttonsignin); 
        add(DOB);        
        add(datepicker); 
        add(signinbutton);
        add(loginbutton);
	    add(no);
	    add(yes);
	    add(question);
	    add(passwordbox);
	    add(password);
	    add(userbox);
	    add(username);
	    add(login);
		add( header);
		add(footer);
      
		add(signin);
		add(name);
		add(namebox);
		add(email);
		add(emailbox);
		add(passwords);
		add(passtext);
		add(gender);
		add(male);
		add(female);
		add(phoneno);
		add(phonebox);
         add(repassword);
         add(repasstext);
		
	
		setLayout(null);
		setVisible(true);
		setSize(1020,1020);
		
		setDefaultCloseOperation(3);
		
		
	}
   
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	{
		
		Object object = e.getSource();
		JButton button = (JButton) object;
		
		if(button == loginbutton)
		{
			
			String userIdFromUI, passwordFromUI;
			userIdFromUI = userbox.getText();
			passwordFromUI = passwordbox.getText();

			try 
			{
			    Class.forName("com.mysql.jdbc.Driver");
			    
			    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospital", "root", "root");
			    	
			    Statement stmt = con.createStatement();
			    
			    ResultSet rs = stmt.executeQuery("select * from signin");
			    
			    while (rs.next()) 
			    {
			    	
				    String userName = rs.getString("name");
				    
				    String password = rs.getString("password");
				    
				    if(userIdFromUI.equals(userName) && passwordFromUI.equals(password)) 
				   {
				    	new All();
			       }
				
			    }
			      
			    
			    con.close();
			}
			
			catch (Exception exception)
			{
			    System.out.println(exception);
			}

			
			
			
			
		}
		
		if(button ==signinbutton)
		{
			
			if(yes.isSelected())
			{
				
				login.setVisible(false);
				username.setVisible(false);
				userbox.setVisible(false);
				password.setVisible(false);
				passwordbox.setVisible(false);
			    loginbutton.setVisible(false);
				question.setVisible(false);
				yes.setVisible(false);
				no.setVisible(false);
			    signinbutton.setVisible(false);
			    
			    
				signin.setVisible(true);
				name.setVisible(true);
				namebox.setVisible(true);
				email.setVisible(true);
				emailbox.setVisible(true);
				passtext.setVisible(true);
			    male.setVisible(true);
			    female.setVisible(true);
			    gender.setVisible(true);
			    passwords.setVisible(true);
			    phoneno.setVisible(true);
			    phonebox.setVisible(true);
			    repassword.setVisible(true);
			    repasstext.setVisible(true);
			    datepicker.setVisible(true);
			    DOB.setVisible(true);
			    buttonsignin.setVisible(true);
			}
			
			
			
		}
		if(button ==buttonsignin)
		{
			signin.setVisible(false);
			name.setVisible(false);
			namebox.setVisible(false);
			email.setVisible(false);
			emailbox.setVisible(false);
			passtext.setVisible(false);
		    male.setVisible(false);
		    female.setVisible(false);
		    gender.setVisible(false);
		    passwords.setVisible(false);
		    phoneno.setVisible(false);
		    phonebox.setVisible(false);
		    repassword.setVisible(false);
		    repasstext.setVisible(false);
		    datepicker.setVisible(false);
		    DOB.setVisible(false);
		    buttonsignin.setVisible(false);
			 
			
		    
		    login.setVisible(true);
			username.setVisible(true);
			userbox.setVisible(true);
			password.setVisible(true);
			passwordbox.setVisible(true);
		    loginbutton.setVisible(true);
			question.setVisible(true);
			yes.setVisible(true);
			no.setVisible(true);
		   
		    signinbutton.setVisible(true);
			
		    
		    String gender ="not selected";
			if (male.isSelected()) {
			    gender = "male";
			} else if (female.isSelected()) {
			    gender = "female";
			}
			
			try {
			   String name = namebox.getText();
			   String email = emailbox.getText();
			   int phone_no = Integer.parseInt(phonebox.getText());
			   String password = passtext.getText();
			    
			    Class.forName("com.mysql.jdbc.Driver");
			    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/omkar", "root", "root");

			    String query = "insert into signin(name,gender,email,phone_no,password) values(?,?,?,?,?)";

			    PreparedStatement st = con.prepareStatement(query);
			    st.setString(1, name);
			    st.setString(2, gender);
			    st.setString(3, email);
			    st.setLong(4, phone_no);
			    st.setString(5, password);
			    
			    st.executeUpdate();

			    

			   
			} catch (Exception Exception) {
			    System.out.println(Exception);
			}

		    
		    
		    
		}	
			
	}
	
}	
		
	


	 
	
