/*
Ken Errico
11/16/16
Checking Class

This class draws info from bank account while adding a new feature
called overdraft which acts like a credit line if the user withdraws more than
the existing balance of the account
*/

//this class is extended from bank account meaning it inherits its info and adds to it
public class CheckingKen extends BankAccountKen
{
	//constuctor lists types of variables as arguements
	CheckingKen(String firstName, String lastName, String street,
	String city, String state, String zipCode)
	{
		//by using super im able to call to, and override, its parent constructor
		super( firstName,  lastName,  street,
		city,  state,  zipCode);
	}	
	
	//assigns value to variable
	double overdraftAmt = 0;
	
	/*
		this method decides if balance is in the negative using an if statement and 
		prints a helpful message letting the user know they are, in fact, worse than broke
	*/
	public void setOverdraft()
	{
		if(balance < 0)
		{
		System.out.println("Your Account is Negative By: " + balance);
		}
	}
	
	//this method returns the accounts negative balance
	public double getOverdraftAmount()
	{
		return  overdraftAmt;
	}
	
	/*
		this method does the math that allows the credit line like overdraft feature
		to go into the negative using if and else statements to decide whether the 
		account is in the red or the black, finally returning the results of the new balance
		reflecting the positive or negative amount
	*/
	public double getBalance()
	{
		if (balance < withdraw)
		{
		balance = balance + deposit - withdraw + getOverdraftAmount();
		}
		else
		{
			balance = balance + deposit - withdraw;
		}
	
		return balance;
		
	}
}