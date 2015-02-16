//-----------------------------------------------------------------------
//Program Name: Seconds
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 3,2015
//Description:  Displays user time input in seconds.
//-----------------------------------------------------------------------
/* Pseudocode

*Prompt user for three int values for #hours, #minutes, #seconds

*Calculate total amount in seconds. 1hour = 3600 seconds etc.

*Display the total time in seconds

*/

package ch2;

import java.util.Scanner;

public class Seconds
{

	public static void main(String[] args)
	{
	//Declare variables:
		int sec;
		int minutes;
		int hours;
		int totalSec;
		
	//Open scanner
		Scanner scan = new Scanner(System.in);
		
	//Prompt User for time and assign to variables above
		System.out.println("Please enter the number of hours:");
		
		hours = scan.nextInt();
		
		System.out.println("Please enter the number of minutes:");
		
		minutes = scan.nextInt();
		
		System.out.println("Please enter the number of seconds:");
		
		sec = scan.nextInt();
		scan.close();
		
	//Solve for Total Seconds and Display
		
		totalSec = (hours*3600) + (minutes*60) + (sec);
		
		System.out.println("The total time in seconds is: " + totalSec);
		
	
		
/* Output 1----------------------------------------------------------------------------

Please enter the number of hours:
1
Please enter the number of minutes:
1
Please enter the number of seconds:
2
The total time in seconds is: 3662		
		
   Output 2----------------------------------------------------------------------------	

Please enter the number of hours:
1
Please enter the number of minutes:
45
Please enter the number of seconds:
0
The total time in seconds is: 6300

   Output 3 --------------------------------------------------------------------------
		
Please enter the number of hours:
0
Please enter the number of minutes:
6
Please enter the number of seconds:
0
The total time in seconds is: 360		
*/
	}

}
