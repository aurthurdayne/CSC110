//-----------------------------------------------------------------------
//Program Name: Exam
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 3,2015
//Description:  Displays average score based off three exam scores
//-----------------------------------------------------------------------
/* Pseudocode

*Prompt user for three int values for three exam scores

*Calculate total average score and display as double

*/

package ch2;

import java.util.Scanner;

public class Exam
{

	public static void main(String[] args)
	{
	// Declare variables
		int examOne;
		int examTwo;
		int examThree;
		double averageScore;
		
	// Open a scanner
		Scanner scan = new Scanner(System.in);
		
	//Prompt user for exam scores and store in variables above
		System.out.println("Welcome!\nPlease enter a score for Exam 1:");
		
		examOne = scan.nextInt();
		
		System.out.println("Please enter a score for Exam 2:");
		
		examTwo = scan.nextInt();
		
		System.out.println("Please enter a score for Exam 3:");
		
		examThree = scan.nextInt();
		
		scan.close();
		
	//Calculate average score and display
		
		averageScore = (double) (examOne+examTwo+examThree)/3;//Demonstrates casting
		
		System.out.println("Thank You!\nThe average exam score is: " + averageScore);
		
	}
/*	
Welcome!
Please enter a score for Exam 1:
90
Please enter a score for Exam 2:
91
Please enter a score for Exam 3:
100
Thank You!
The average exam score is: 93.66666666666667	
*/	
	
}
