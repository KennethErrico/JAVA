/*
  Ken Errico
  9/19/16
  Lab 2 (Switch) generates a random number that uses a switch to
  determine the output, in some cases omitting breaks to get multiple results
*/

//class declaration
public class SwitchOneKenErrico
{

//main method where work is started, entry point
public static void main(String args[])
{

//declares the maximum number to randomize between
	int max = 10;

//the random number that is generated here
	int random = (int)((Math.random()*max)+1);
//starts the decision making process between all the cases
	switch(random)
	{
//cases are different pathways that can be chosen by the switch
	case 1 :
		System.out.println("Bananas");
			break;
	case 2 :
		System.out.println("apples");
			break;
	case 3 :
		System.out.println("plums");
	case 4 :
		System.out.println("pears");
	case 5 :
		System.out.println("peaches");
			break;
/*you had 6 written as "six" but the program wouldnt run so I
listed it the same as the rest of the cases Im hoping this was a test
and that I passed...*/
	case 6 :
		System.out.println(" oranges");
			break;
//same with 7/seven...
	case 7 :
		System.out.println(" ignore this case");
			break;
	case 8 :
		System.out.println(" grapes");
			break;
//if all else fails this is what it does as an end result
	default :
		System.out.println(" nuts");

	}
}
}