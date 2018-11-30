/*
Ken Errico
9/28/16
Lab starts at 1 and creates 10 square numbers using a for loop
*/
//class declaration
public class ForSquaresKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
	}
}