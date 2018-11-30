/*
Ken Errico
9/28/16
Lab starts at 1 and creates the first 10 square numbers
using a while loop
*/
//class declaration
public class WhileSquaresKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
	}
}