/*
Ken Errico
10/3/16
Loops lab revised combines all the other loop labs into
custom methods and calls each in the main
*/

public class LoopsLabRevisedKen
{
	
	//starts at 1 and generates a list of the first 10 square numbers a while loop
	public void WhileSquares()
	{
		//assign value to variables
		int numA = 1;
		int squareNum = 0;

		//while loop tests condition
		while (numA <= 10)
		{
			//equation loops and prints until reset with last line, numA++;
			squareNum = numA * numA;
			System.out.print(squareNum + ", ");
			numA++;
		}
		System.out.println("");
		System.out.println("-----------------------------------");
	}

	//starts at 1 and generates a list of the first 10 square numbers a for loop
	public void ForSquares()
	{
		//assign value to variables
		int numA = 1;
		int squareNum = 0;

		/*for loop tests conditions  sets amount of iterations in
		its statement rather than after like the while loop did*/
		for (numA = 1; numA <= 10; numA++)
		{
			//equation loops and prints number set
			squareNum = numA * numA;
			System.out.print(squareNum + ", ");
		}
		System.out.println("");
		System.out.println("-----------------------------------");
	}

	//creates a time table grid from 1 -10 using a nested while loop
	public void WhileTimes()
	{
		//assign value to variables
		int numA = 1;
		int numB = 1;
		int numS = 0;

		//while loop (outer) tests condition
		while (numB <= 10)
		{
			//nested while loop (inner) completes first
			while(numA <= 10)
			{
			//equation generates table and prints line until reset and 1 is added
			numS = numA * numB;
		 	System.out.print(numS + "\t");
		 	numA++;
			}
				/*this is where the next line is started to continue the
				grid until reset for another line and finally the end*/
				System.out.println("");
				numA = 1;
				numB++;
			}
		System.out.println("-----------------------------------");
	}

	//creates a time table grid from 1 -10 using a nested for loop
	public void ForTimes()
	{
		//assign value to variables
		int numA = 1;
		int numB = 1;
		int numS = 0;

		/*for loop (outer) tests condition also sets iterations
		in the statement*/
		for (numB = 1; numB <= 10; numB++)
		{
			/*nested for loop (inner) completes first and unlike
			a while loop everything is set in the statement*/
			for (numA = 1; numA <= 10; numA++)
			{
				//equation creates result and prints
				numS = numA * numB;
			 	System.out.print(numS + "\t");
			}
		//prints new line
		System.out.println("");
		}
	System.out.println("-----------------------------------");
	}

	//generates two random numbers using a do while loop
	public void DoTwoRandom()
	{
		//declares the maximum number to randomize between
		int max = 6;
		//assign value to variables
		int random1 = 0;
		int random2 = 0;

		//tests condition
		do
		{
			//the random numbers are generated here and are of integer type value
			random1 = (int)((Math.random()*max)+1);
			random2 = (int)((Math.random()*max)+1);
		}

		/*while acts similar to how an if would by placing a condition
		that if true sends the program to do it again until numbers differ*/
		while (random1 == random2);
		System.out.println(random1 + " " + random2);
		System.out.println("-----------------------------------");
		}
	
	//generates six random and different numbers using a do while loop as a lottery would 
	public void DoLottery()
	{
		//declares the maximum number to randomize between
		int max = 6;

		//assigns value to variables 1-6
		int random1 = 0;
		int random2 = 0;
		int random3 = 0;
		int random4 = 0;
		int random5 = 0;
		int random6 = 0;

		do
		{
			//the six random numbers are generated here and are of integer type value
			random1 = (int)((Math.random()*max)+1);
			random2 = (int)((Math.random()*max)+1);
			random3 = (int)((Math.random()*max)+1);
			random4 = (int)((Math.random()*max)+1);
			random5 = (int)((Math.random()*max)+1);
			random6 = (int)((Math.random()*max)+1);
		}
		//here the program continues to randomize if any numbers are found to be equal
		while ((random1 == random2) || (random1 == random3) || (random1 == random4) || (random1 == random5) || (random1 == random6)
			  || (random2 == random3) || (random2 == random4) || (random2 == random5) || (random2 == random6)
			  || (random3 == random4) || (random3 == random5) || (random3 == random6)
			  || (random4 == random5) || (random4 == random6)
			  || (random5 == random6));
		//this prints a line containg the six differing numbers
		System.out.println(random1 + " " + random2 + " " + random3 + " " + random4 + " " + random5 + " " + random6);
	}

	//main method calls each of my custom methods
	public static void main(String args[])
	{
		LoopsLabRevisedKen llrKen = new LoopsLabRevisedKen();
		llrKen.WhileSquares();
		llrKen.ForSquares();
		llrKen.WhileTimes();
		llrKen.ForTimes();
		llrKen.DoTwoRandom();
		llrKen.DoLottery();
	}
}
