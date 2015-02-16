/*-----------------------------------------------------------------------
Program Name: Cards
Author:       Nicholas Smith
Class:        CSC 110AB
Date:         Feb 13,2015
Description:  Randomly selects a card for the user and computer
			  compares the two and declares winner.

Suit heirarchy: 
Ascending alphabetical order: clubs (lowest), followed by diamonds, hearts, 
and spades (highest). 

------------------------------------------------------------------------*/
package ch4;

import java.util.Random;

public class Cards
{

	public static void main(String[] args)
	{
		//Declare Variables
		
			int randomUserSuit;
			int randomUserCard;
			int randomComputerSuit;
			int randomComputerCard;
			String suit;
			String card;
			String computerSuit;
			String computerCard;
			int userCardValue;
			int computerCardValue;
			
		//Open random number generator
			
			Random generator = new Random();
			
		//Assign value for random number for suit
			
			randomUserSuit = generator.nextInt(4) + 1;
			
		//Assign value to suit string
			
			switch (randomUserSuit)
			{
				case 1 : suit = "of Clubs";
					break;
				case 2 : suit = "of Diamonds";
					break;
				case 3 : suit = "of Hearts";
					break;
				case 4 : suit = "of Spades";
					break;
				default : suit = "";
			}
			
		//Assign value for random number card  
			
			randomUserCard = generator.nextInt(13) + 1;
			
		//Assign value to card string
			
			switch (randomUserCard)
			{
				case 1 : card = "2 ";
					break;
				case 2 : card = "3 ";
				    break;
				case 3 : card = "4 ";
					break;
				case 4 : card = "5 ";
					break;
				case 5 : card = "6 ";
					break;
				case 6 : card = "7 ";
					break;
				case 7 : card = "8 ";
					break;
				case 8 : card = "9 ";
					break;
				case 9 : card = "10 ";
					break;
				case 10 : card = "Jack ";
					break;
				case 11 : card = "Queen ";
					break;
				case 12 : card = "King ";
					break;
				case 13 : card = "Ace ";
					break;
				default : card = "";
			}
			
		//Assign value for random number computer suit
			
			randomComputerSuit = generator.nextInt(4) + 1;
			
		//Assign value to computer suit string
			
			switch (randomComputerSuit)
			{
				case 1 : computerSuit = "of Clubs";
					break;
				case 2 : computerSuit = "of Diamonds";
					break;
				case 3 : computerSuit = "of Hearts";
					break;
				case 4 : computerSuit = "of Spades";
					break;
				default : computerSuit = "";
			}
						
		//Assign value to number for computer card
			
			randomComputerCard = generator.nextInt(13) + 1;
			
		//Assign value to string for computer card
			
			switch (randomComputerCard)
			{
				case 1 : computerCard = "2 ";
					break;
				case 2 : computerCard = "3 ";
				    break;
				case 3 : computerCard = "4 ";
					break;
				case 4 : computerCard = "5 ";
					break;
				case 5 : computerCard = "6 ";
					break;
				case 6 : computerCard = "7 ";
					break;
				case 7 : computerCard = "8 ";
					break;
				case 8 : computerCard = "9 ";
					break;
				case 9 : computerCard = "10 ";
					break;
				case 10 : computerCard = "Jack ";
					break;
				case 11 : computerCard = "Queen ";
					break;
				case 12 : computerCard = "King ";
					break;
				case 13 : computerCard = "Ace ";
					break;
				default : computerCard = "";
			}			
		
		//Display the cards 
				
				System.out.println("The ranking of suits is Spades > Hearts > Diamonds > Clubs. ");
				System.out.println("You drew a " + card + suit);
				System.out.println("The computer drew a " + computerCard + computerSuit);
				
		//Determine winner and give prize
			switch (randomUserSuit)
			{
				case 1 : userCardValue = 0 + randomUserCard;
					break;
				case 2 : userCardValue = 10 + randomUserCard;
					break;
				case 3 : userCardValue = 20 + randomUserCard;
					break;
				case 4 : userCardValue = 30 + randomUserCard;
					break;
				default : userCardValue = 0;
			}
			switch (randomComputerSuit)
			{
				case 1 : computerCardValue = 0 + randomComputerCard;
					break;
				case 2 : computerCardValue = 10 + randomComputerCard;
					break;
				case 3 : computerCardValue = 20 + randomComputerCard;
					break;
				case 4 : computerCardValue = 30 + randomComputerCard;
					break;
				default : computerCardValue = 0;
			}	
			
			if (computerCardValue == userCardValue)
				{	
					System.out.println("No winner.");
				}
			else if (userCardValue > computerCardValue)
				{
					System.out.println("You win $50,000");
				}
			else
				{
					System.out.println("Computer wins :(");
				}	
	
	}
/*OUTPUT
 * 
The ranking of suits is Spades > Hearts > Diamonds > Clubs. 
You drew a 4 of Hearts
The computer drew a King of Spades
Computer wins :(
*
The ranking of suits is Spades > Hearts > Diamonds > Clubs. 
You drew a 9 of Spades
The computer drew a Jack of Hearts
You win $50,000
*
*/
	
}
