package swinginit;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AdminMain 
{

	public static void main(String[] args)
	{
		   @SuppressWarnings("unused")
		All windowwork = new All();
                                                    
	}

}



@SuppressWarnings("serial")
class All extends JFrame implements ActionListener
{
    JLabel contact,Admin;
    JPanel footer,header;
    
    JButton create,search,signout;
    
    All()
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
	  	   
           Admin = new JLabel("ADMIN");
    	   
    	   Admin.setBounds(160, 5 ,360 ,100);
           
    	   Font style = new Font("",Font.BOLD,60);
    	   
    	   Admin.setFont(style);
	    	  
	  	    header = new JPanel();
		   header.setBounds(0, 0, 1020,100);
	     
		   header.setBackground(Color.yellow);
		
		   Icon img = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\project image\\create.jpg");
		   
		   create = new JButton(img);
		   
		   create.setBounds(50,150, 200, 200);
		   
		   Icon img1 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\project image\\dingana.jpg");
		   
		   search = new JButton(img1);
		   
		   search.setBounds(400,150,200,200);
		   
		   Icon img2 = new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\project image\\signout.png");
		   
		   signout = new JButton(img2);
		   
		   signout.setBounds(250,400,300,100);
		   
		   search.addActionListener(this);
		   create.addActionListener(this);
		   signout.addActionListener(this);
		   
		   add(signout);
		   add(search);
 		   add(create);
		   add(header);
           add(footer);
		   header.add(Admin);
		   setVisible(true);  
	    	setSize(800,750);  
	    	setDefaultCloseOperation(3);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object object = e.getSource();
		JButton button = (JButton) object;
		   
		  if(button == create)
		  {
               new GetIn();		  
			  
		  }
		  else if (button == search)
		  {
			  new Work();
		  }
		  else if (button == signout)
		  {
			  new sign();
			  
		  }
		
	}
	


}