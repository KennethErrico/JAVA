/*
	Ken Errico
	11/16/16
	Savings Class
	
	This class draws info from bank account while adding a new feature
	called interest which increases the amount by a specified percentage
*/
public class SavingsKen extends BankAccountKen
{
	
	//these are constructors of which the second overrides the parent using super
	SavingsKen(String firstName, String lastName, String street,
	String city, String state, String zipCode)
	{
		super( firstName,  lastName,  street,
		city,  state,  zipCode);
	}
	
	//assigns value to variable
	double interestRate;
	
	//this method sets the interest to be calculated into the balance later in the object created in teller
	public void setInterest(double i)
	{
		interestRate = i;
        System.out.println("Interest Rate: " + interestRate);
	}
	/*
		this method does the math to calculate the actual interest that will be added to
		the balance, the interest rate itself is set in the object in teller so as to be more
		realistic by allowing each account (object) to have differing interest rates
	*/
	public double getBalance()
	{
		balance = (((balance + deposit) - withdraw) * interestRate) + balance;
		return balance;
	}
}
