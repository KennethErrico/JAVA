/*
  Kenneth Errico
  9/19/16
  Lab generates six differing numbers
*/

//class declaration
public class DoLotteryKenErrico
{

	//main method where work is started, entry point
	public static void main(String args[])
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
}