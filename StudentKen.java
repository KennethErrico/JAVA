/*
Ken Errico
10/20/16
This is a class file with no main that creates the print
format for the custom method StudentInfo() using
string variables and an int variable
*/

public class StudentKen
{
	//these are declarations of variables
	String fName;
	String lName;
	int noc;
	String program;
	
	//custom function creates template for studen info
	public void StudentInfo()
	{
		System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Number of Classes: " + noc);
		System.out.println("Program: " + program);
	}
}


