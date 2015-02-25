//-----------------------------------------------------------------------
//Program Name: CinemaPrice
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 23,2015
//Description:  Determine how much someone pays for a cinema ticket.
//-----------------------------------------------------------------------


package ch4;

import java.util.Scanner;
import java.text.NumberFormat;

public class CinemaPriceEnhanced
{

	public static void main(String[] args)
	{
		//Declare variables
		
		double ticketPrice = 0;
		double fullTicketPrice;
		int age;
		
	//Initiate Scanner, and Currency Formatter
		
		Scanner scan = new Scanner(System.in);
		NumberFormat nFmt = NumberFormat.getCurrencyInstance();
		
	//Prompt user for full ticket price 
		
		System.out.println("Please enter the cost of a ticket.");
		fullTicketPrice = scan.nextDouble();
		System.out.println("The full price of a ticket is: " + nFmt.format(fullTicketPrice));
		
		System.out.println("Please enter your age. (0 to quit)");
		age = scan.nextInt();
		
	//Assign value for ticket price using if else statement
		
		while (age > 0)
		{
			
			if ( age > 54)
			{
				ticketPrice = (0);
				System.out.println("Ticket is free. ");
			}
			else if ( age > 12)
			{
				ticketPrice = (fullTicketPrice);
				System.out.println("Ticket is full price. ");				
			}
			else if ( age > 4)
			{
				ticketPrice = ( fullTicketPrice / 2 );
				System.out.println("Ticket is half price. ");				
			}
			else
			{
				ticketPrice = (0);
				System.out.println("Ticket is free. ");
			}
			
			System.out.println("For someone age " + age + " a ticket costs: " +
			nFmt.format(ticketPrice));			
			
			System.out.println("Please enter another age. (0 to quit) ");
			age = scan.nextInt();
		}
	//Display exit message
		
		System.out.println("Goodbye.");
	
	//Close scanner
		scan.close();	
	
	}
/* OUTPUT
Please enter the cost of a ticket.
15.00
The full price of a ticket is: $15.00
Please enter your age. (0 to quit)
10
Ticket is half price. 
For someone age 10 a ticket costs: $7.50
Please enter another age. (0 to quit) 
24
Ticket is full price. 
For someone age 24 a ticket costs: $15.00
Please enter another age. (0 to quit) 
0
Goodbye.

 */	
}
