
//-----------------------------------------------------------------------
//Program Name: JellyBeanGame
//Author:       Nicholas Smith
//Class:        CSC 110AB
//Date:         Feb 23,2015
//Description:  Play a game where the user tries to guess the
//              number of jellybeans in a jar.  Can range from 1 to 1000
//-----------------------------------------------------------------------
package ch4;

import java.util.Scanner;
import java.util.Random;

public class JellyBeanGame
{
    public static void main(String[] args)
    {
        int numOfJellyBeans = 0;       //Number of jellybeans in jar
        int guess = 0;                       //The user's guess
        char playAgain = 'Y';

		 Random generator = new Random();
		 Scanner scan = new Scanner (System.in);

		//randomly generate the number of jellybeans in jar
		 
 while (playAgain == 'Y' || playAgain == 'y')
{		
		 	numOfJellyBeans = generator.nextInt(1000) + 1;
		 	int count = 0;
		 	System.out.println("Welcome to the JellyBean game:)");
		 	System.out.println("There are between 1 and 1000 jellybeans in the jar.");
		 	System.out.println("Enter a guess.");
		 	
		do
	{
	
			guess = scan.nextInt();
		 
		 //if the guess is wrong display message
		 
			if (guess > numOfJellyBeans)
			{
				count++;
				System.out.println("Try a lower guess.");
			
			}
			else if (guess < numOfJellyBeans)
			{
				count++;
				System.out.println("Try a higher guess.");
				
			}

		 
	}	while (guess != numOfJellyBeans);
		
		count++;//Adds one more to count after guess is correct.
		
		// display message saying guess is correct
		
		System.out.println("Congratulations you have guessed the correct number of JellyBeans in "
		+ count + " guesses.");
		
		System.out.println("Would you like to play again? Enter Y/N");
		
		playAgain = scan.next().charAt(0);
}	
 		
 		System.out.println("Thanks for playing.");
 		scan.close();
 
    }
/*
Welcome to the JellyBean game:)
There are between 1 and 1000 jellybeans in the jar.
Enter a guess.
500
Try a higher guess.
750
Try a higher guess.
875
Try a higher guess.
950
Try a lower guess.
900
Try a lower guess.
880
Try a higher guess.
890
Try a lower guess.
885
Try a higher guess.
886
Congratulations you have guessed the correct number of JellyBeans in 9 guesses.
Would you like to play again? Enter Y/N
n
Thanks for playing.
 */
}
