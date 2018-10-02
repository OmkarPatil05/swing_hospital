package swinginit;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignIn {

	public static void main(String[] args) {
     @SuppressWarnings("unused")
	Detail d=new Detail();
	}

}

@SuppressWarnings("serial")
class Detail extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3;
	JPasswordField p1,p2;
	JButton b;
	JRadioButton r1,r2;
     ButtonGroup bg;
	
	

    	Detail()
       {
    		l1=new JLabel("Full Name");
    		l2=new JLabel("Email ID");
    		l3=new JLabel("Phone no.");
    		l4=new JLabel("Password");
    		l5=new JLabel("Reenter Password");
    		l6=new JLabel("Gender");
    		
    		t1=new JTextField(20);
    		t2=new JTextField(20);
    		t3=new JTextField(20);
    		
    		p1=new JPasswordField(20);
    		p2=new JPasswordField(20);
            
    	    r1=new JRadioButton("male");
    	    r2=new JRadioButton("female");

             bg=new ButtonGroup();
             bg.add(r1);
             bg.add(r2);
             
            b=new JButton("conform");
            add(l1);
            add(t1);
            add(l6);
            add(r1);
            add(r2);
            add(l2);
            add(t2);
            add(l3);
            add(t3);
            add(l4);
            add(p1);
            add(l5);
            add(p2);
            add(b);
		 setLayout(new FlowLayout());
	   setVisible(true);
	   setSize(300,300);
	   setDefaultCloseOperation(3);

   }
	@Override
	   public void actionPerformed(ActionEvent e) {
		
	    }
	

}