/***************************************************************
  Program Name :  Salary.java  
  Author : 
  Date :
  Description:
   Demonstrates :Using if..else. 
	Demonstrates :switch statement
	Demonstrates :boolean variable
	
   Computes the raise and new salary for an employee

     The input to the program includes the current annual salary
     for the employee and a number indicating the performance
     rating (1=excellent, 2=good, 3=poor).    An employee with a
	  rating of 1  will receive a 6% raise, an employee with a
	  rating of 2  will receive a 4% raise, and one with a rating of 1  
	  will receive a 1.5% raise.  All other ratings are invalid 
	  and the raise will be set to 0 and a message displayed.
		 
	 ***************************************************************/
package cscExamples;

import java.util.Scanner;
import java.util.Random;

public class Switchbooleancondtionals
{
   public static void main (String[] args)
   {
      double currentSalary = 0.0;  // current annual salary
      int    rating = 0;           // performance rating
      double raise = 0.0;          // dollar amount of the raise
		String message;
		
	
	   Scanner scan = new Scanner(System.in);
		Random generator = new Random();

      // Get the current salary and performance rating
      System.out.print ("Enter the current salary: ");
      currentSalary = scan.nextDouble();
      System.out.println ("Enter the performance rating: ");
		System.out.print("1=excellent, 2=good, 3=poor. Rating is : ");  
      rating = scan.nextInt();
		
		
      // Compute the raise -- Use if ... else ...

	  if (rating == 1)
	  {
	  		raise = currentSalary * 0.06;
	  }
	  else if (rating == 2)
	  {
	  		raise = currentSalary * 0.04;
	  }
	  else if (rating == 3)
	  {
	  		raise = currentSalary * 0.015;
		}
		else
		{
			raise = 0.0;
			System.out.println("Invalid rating.  No raise calculated.");
		}


		//Use a switch statement .

			
      // Print the results
      System.out.println ("Amount of your raise: $" + raise);
      System.out.println ("Your new salary: $" + (currentSalary + raise));
		
		
   }
}

