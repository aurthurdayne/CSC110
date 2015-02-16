//-----------------------------------------------------------------------
//Program Name: CinemaPrice
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 13,2015
//Description:  Determine how much someone pays for a cinema ticket.
//-----------------------------------------------------------------------
package ch4;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Random;

public class CinemaPrice
{

	public static void main(String[] args)
	{
		//Declare variables
		
			double ticketPrice;
			double fullTicketPrice;
			int age;
			
		//Intiate Scanner,RNG, and Currency Formatter
			
			Random generator = new Random();
			Scanner scan = new Scanner(System.in);
			NumberFormat nFmt = NumberFormat.getCurrencyInstance();
			
		//Prompt user for full ticket price
			
			System.out.println("Please enter the cost of a ticket");
			fullTicketPrice = scan.nextDouble();
		
		//Generate random number for age between 1 & 100
			
			age = generator.nextInt(99) + 1;
			
		//Print out information stored so far
			
			System.out.println("The age is set to: " + age);
			System.out.println("The full price of a ticket is: " + nFmt.format(fullTicketPrice));
			
		//Assign value for ticket price using if else statement
			
			if ( age > 54)
			{
				ticketPrice = (0);
				System.out.println("The Ticket is free.");
			}
			else if ( age > 12)
			{
				ticketPrice = (fullTicketPrice);
				System.out.println("The Ticket is full price.");
			}
			else if ( age > 4)
			{
				ticketPrice = ( fullTicketPrice / 2 );
				System.out.println("The Ticket is half price.");
			}
			else
			{
				ticketPrice = (0);
				System.out.println("The Ticket is free.");
			}
			
		//Display the actual ticket price for generated age
			
			System.out.println("For the random age " + age + " a ticket costs: " +
				nFmt.format(ticketPrice));
		
		//Close scanner
			scan.close();
	}
/*OUTPUT
Please enter the cost of a ticket
12.63
The age is set to: 95
The full price of a ticket is: $12.63
The Ticket is free.
For the random age 95 a ticket costs: $0.00
*/
	
}
