/**
George Samu
purpose:The purpose of this program is to understand how to use JOptionPane
Date:6/20/2020

*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Chpt4Exercise19
{
	public static void main (String [] args)
	{
	//get information
	
	//Scanner keyboard=new Scanner(system.in);
	//System.out.println("
	//String email=keyboard.nextLine();
	String emailAddress=JOptionPane.showInputDialog("My email address is ");
	
		//Display information
	JOptionPane.showMessageDialog(null, "My email address is "+email);
	
	
	}//end main
}//end Chpt4Exercise19