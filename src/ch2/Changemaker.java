//-----------------------------------------------------------------------
//Program Name: Changemaker
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 3,2015
//Description:  Takes user input 1-99 for cents and tells you how many of each coin
//-----------------------------------------------------------------------
/* Pseudocode

*Prompt user for amount of cents (.01-.99) 

*Calculate individual number of coins and display

*/
package ch2;

import java.util.Scanner;

public class Changemaker
{

	public static void main(String[] args)
	{
	//Declare variables
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		int change;
		
		
	//Open scanner
		Scanner scan = new Scanner(System.in);
		
	//Prompt user input
		System.out.println("Enter a number 1-99 for the amount of change:");
		
		change = scan.nextInt();
		scan.close();
	//Calculate amount of each coin
		
		quarters = change / QUARTER;
		
		change = change % QUARTER;
		
		dimes = change / DIME;
		
		change = change % DIME;
		
		nickels = change / NICKEL;
		
		change = change % NICKEL;
		
		pennies = change;
		
	//Display change in amount of each coin
		
		System.out.println("Quarters: " + quarters +
						   "\nDimes: " + dimes +
		                   "\nNickels: " + nickels +
		                   "\nPennies: " + pennies);
	}
/*Output
* Enter a number 1-99 for the amount of change:
88
Quarters: 3
Dimes: 1
Nickels: 0
Pennies: 3
* 
*Enter a number 1-99 for the amount of change:
51
Quarters: 2
Dimes: 0
Nickels: 0
Pennies: 1 
*
Enter a number 1-99 for the amount of change:
17
Quarters: 0
Dimes: 1
Nickels: 1
Pennies: 2
*
Enter a number 1-99 for the amount of change:
4
Quarters: 0
Dimes: 0
Nickels: 0
Pennies: 4
*/

}
