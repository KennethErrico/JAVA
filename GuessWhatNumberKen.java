/*
Ken Errico 
Guess What Number Lab
10/7/16
This lab generates a random number and gives the user 10 attempts
to match the number generating a message when correct
*/

//in order to use the scanner it must be brought in
import java.util.Scanner;

//Class Declaration
public class GuessWhatNumberKen
{
	
	//Main Method, Entry Point to the Program
	public static void main(String args[])
	{
		
		//Declare Variables, in the case of  "random" it is an equation
		int max = 1;
		int random = (int)(Math.random()*10+1);
		int input;
		
		//Create Scanner
		Scanner scnr = new Scanner (System.in);
		
		//Lines Print outside of loop to keep from repeating
		System.out.println("Enter A Number Between 1 & 10");
		System.out.println("You Have 10 Guesses So If You Don't Get It,");
		System.out.println("You Might Want To Rethink Your System...");
		System.out.println("GO!!");

		
		//Start of Looping Process
		do
		{
			input = scnr.nextInt();
			max++;	
		}
		
		//Sets a Condition and Limit
		while ((input != random) && (max <=10));
		
		//Sets Alternate Condition That Will Print If True
		if (input == random)
		{
			System.out.println("YOU GOT IT RIGHT!" );
		}
	}
}

