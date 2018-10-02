package swinginit;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class firstgui {

	public static void main(String[] args) {
		   		   
		 @SuppressWarnings("unused")
		abc a=new abc();
		   

	}

}
@SuppressWarnings("serial")
class abc extends JFrame// (default layout)cardlayout:same like when we take bundle of cards we can see only one which top at the top of stack of card
{
     abc()
     {
    	   setLayout(new FlowLayout());//flowlayout(try to occupy the middle part of JFrame) gridlayout null 
    	 JLabel l=new JLabel(" I AM OMKAR___________________ ");
    	 add(l);
         JLabel l2=new JLabel("________________PATIL");
         add(l2);
    	 setVisible(true);
		   setSize(400, 490);
    	 setDefaultCloseOperation(3);//to terminate the application
     }


}