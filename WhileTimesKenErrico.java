/*
Ken Errico
9/28/16
Lab creates times table grid for numbers 1-10 using a nested while loop
*/

//class declaration
public class WhileTimesKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
	}
}