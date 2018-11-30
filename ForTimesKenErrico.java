/*
Ken Errico
9/28/16
Lab creates time table grid for numbers 1-10 using a nested for loop
*/

//class declaration
public class ForTimesKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
	}
}