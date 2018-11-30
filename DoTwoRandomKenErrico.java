/*
  Ken Errico
  9/19/16
  Lab generates six numbers that differ using a do while loop
*/

//class declaration
public class DoTwoRandomKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
		}
}

