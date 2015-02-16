//-----------------------------------------------------------------------
//Program Name: UsernameGenerator
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 9,2015
//Description:  Generates a username for the user
//-----------------------------------------------------------------------
package ch3;

import java.util.Scanner;
import java.util.Random;


public class UsernameGenerator
{

	public static void main(String[] args)
	{	
		//Declare variables
		String username;
		String firstName;
		String lastName;
		int randomNumber; 
		
		
		//Open scanner and RNG
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		
		//Welcome and Prompt user to enter name
		System.out.println("Welcome to Username Generator!");
		System.out.println("Please enter your first name:");
		
		firstName = scan.nextLine();
		
		System.out.println("Please enter your last name:");
		
		lastName = scan.nextLine();
		
		randomNumber = generator.nextInt(901)+1000;
		
		username = firstName.substring(0,1) + lastName.substring(0,3) + randomNumber;
		
		System.out.println("Username: " + username);
		
		scan.close();
		
		}
/*Output
 * 
Welcome to Username Generator!
Please enter your first name:
Nick
Please enter your last name:
Smith
Username: NSmi1826
 * 
 */

}
