/*
Ken Errico
11/14/16
Bank Account Lab 

The purpose of this project is to create custom methods which set and get the neccesary
info to create a users bank account
*/


//bank account class
public class BankAccountKen
{
	//declare variables 
	String firstName;
	String lastName;
	String street;
	String city;
	String state;
	String zipCode;
	
	//assigning values to variables, accountNum is private so the teller cant mess with the clients account number
	private static int accountNum = 0;
	double accountNumber ;
	double deposit;
	double withdraw;
	double balance;
	double interestRate;
	
	//declaring these variables here is for setAccount to retrieve and run
	String name;
	String address;
	
	
	//constructor is used to set default values and takes no arguements
	public BankAccountKen()
	{
		//++increments my account numbers by adding 1 each time a new one is generated
		accountNum++;
		accountNumber = accountNum;
		System.out .println(accountNumber);
	}
	/*this is the overloaded constructor that is actually assigning values and adds 
	arguements, the above constructor is more like a general template where as this one
	adds specific information
	*/
	public BankAccountKen( String firstName, String lastName, String street,
	String city, String state, String zipCode)
	{
		//++increments my account numbers by adding 1 each time a new one is generated
		accountNum++;
		accountNumber = accountNum;
		System.out .println(accountNumber);
		
		//using "this" was a way to keep the compiler from being confused  by specifically
		//telling it I mean "this" variable
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	
	//method sets up account by calling previously declared variables with their types listed in arguements
	public void setAccount(String n, String a, double i)
	{
		name = (firstName + " " + lastName);
		address = (street + "," + city +  "," + state +  "," + zipCode);
	}
	
	//used to aquire previously defined variables pertaining to account holders  first and last name
	public String getName()
	{
		return "Name: " + firstName + " " + lastName;
	}
	
	//used to aquire previously defined variables pertaining to account holders address
	public String getAddress()
	{
		return "Address: " + street + ", " + city + ", " + state + ", " + zipCode;
	}
	
	//used to aquire previously defined variables pertaining to account holders account number
	public double getAccount()
	{
		return accountNumber;
	}
	
	//used to set variables that will be aquired later for deposit transaction purposes
	public void setDeposit(double dp)
	{
		deposit = dp;
	}
	
	//used to set variables that will be aquired later for withdrawal transaction purposes
	public void setWithdraw(double wd)
	{	
		withdraw = wd;
	}
	
	//used to set variables that will be aquired later for delivering the account balance
	public void setBalance(double b)
	{
		balance = b;
	}
	
	//does the math, makes changes to balance as they occur and returns a reflection of those changes
	public double getBalance()
	{
		balance = balance + deposit - withdraw;
		return balance;
	}
	
	//this custom method retrieves and prints info along with descriptions of what the info is
	public void printInfo()
	{
		System.out.println(getName());
		System.out.println(getAddress());
		System.out.println("Account Number: " + getAccount());
		System.out.println("Balance: " + "$" + balance);
		System.out.println("Deposit: " + "$" + deposit);
		System.out.println("Withdrawal: " + "$" + withdraw);		
		System.out.println("New Balance: " + "$" + getBalance());
	}
	
	//main method, the actual starting point of the program
	public static void main(String[] args)
	{
		/*
		these two objects created here are examples of accounts that use all of
		the methods in this class and set the account owners personal and banking info
		while using the mathematical equations to reflect changes made to their balances
		*/
		BankAccountKen cust1 = new BankAccountKen("Ken","Errico",
		"8th Street","Lawrence", "MA", "01830");
		cust1.setBalance(5000.00);
		cust1.setWithdraw(1000);
		cust1.setDeposit(10);
		cust1.printInfo();
		
		System.out.println();
		
		BankAccountKen cust2 = new BankAccountKen("Jamie","Errico",
		"8th Street","Lawrence", "MA", "01830");
		cust2.setBalance(4000.00);
		cust2.setWithdraw(500);
		cust2.setDeposit(10);
		cust2.printInfo();
	}
}

	

