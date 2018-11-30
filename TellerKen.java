/*
Ken Errico
11/16/16
Teller class 

this class draws from all previous classes and also adds new features and objects
one of which is an interactive menu driven by a loop and switch that allows the user
to make deposits, withdrawals, and check balances along the way
*/

//imports a built in utility called scanner
import java.util.Scanner;

public class TellerKen
{
	//creates new scanner object
	Scanner in = new Scanner(System.in);
	
	//variables that declare the types of teller info
	String name;
	String dateProcessed;
	
	//a set of constructors, the second overrides the parent to add info using "this"
	public TellerKen()
	{
		name = "Unknown";
		dateProcessed = "Unknown";
	}
	/*this is the overloaded constructor that is actually assigning values and adds 
	arguements, the above constructor is more like a general template where as this one
	adds specific information
	*/
	public TellerKen(String n, String dateP)
	{
		this.name = n;
		this.dateProcessed = dateP;
		System.out.println("Your Teller is: " + name);
		System.out.println("Date of Transaction: "  + dateProcessed);
	}
	
	/*
	i finally get to make some use out of this hard work, this is my menu, although more
	procedural than OO I did change it into a mehtod to be called in the 4th object
	*/
	public void ExtraCredit()
	{
		int userChoice;
		boolean quit = false;
		double balance = 0;
		
		do
		{
		System.out.println("Press 1 Then Enter To Deposit: ");
		System.out.println("Press 2 Then Enter To Withdraw: ");
		System.out.println("Press 3 Then Enter To Check Balance: ");
		System.out.println("Press 0 Then Enter To Quit");
		userChoice = in.nextInt();
		
		switch (userChoice)
			{
				case 1:
					double amount;
					System.out.println("Amount to Deposit");
					amount = in.nextDouble();
					if(amount <= 0)
					{
						System.out.println("Can't Deposit Negative Amount");
					}
					
					else
					{
						balance += amount;
						System.out.println("$" + amount + " Has Been Deposited");
					}
					break;
					
				case 2:
					System.out.print("Amount to Withdraw:");
					amount = in.nextDouble();
					if (amount <= 0 || amount > balance)
					{
						System.out.println("You Ain't Got That Kinda Cash Sucka!");
					}
					else
					{
						balance -= amount;
						System.out.println("$" + amount + " Has Been Withdrawn");
					}
					break;
				
				case 3:
						System.out.println("Your Balance: $" + balance);
					break;
				
				case 0:
						quit = true;
					break;
				
				default:
						System.out.println("Wrong Choice Sucka");
					break;
			}
			
					System.out.println();
		}

				while (!quit);
				{
					System.out.println("Bring More $$$ Next Time Sucka!");
				}
	}
	
	//main method, the actual starting point of the program
	public static void main(String[] args)
	{
		/*
		these are my 4 objects each of which draws from previous classes using all
		methods created from all classes proving that all pieces of this insane puzzle
		not only compile but do their job as well
		*/
		
		BankAccountKen cust1 = new BankAccountKen("Ken","Errico",
		"187th Street","Lawrence", "MA", "01830" );
		cust1.setBalance(5000.00);
		cust1.setWithdraw(1000);
		cust1.setDeposit(10);
		cust1.printInfo();
		
		System.out.println("");
		
		CheckingKen cust2 = new CheckingKen("Jamie","Errico",
		"187th Street","Lawrence", "MA", "01830");
		cust2.setOverdraft();
		cust2.setBalance(100.00);
		cust2.setWithdraw(1000);
		cust2.setDeposit(10);
		cust2.printInfo();
		
		System.out.println("");

		SavingsKen cust3 = new SavingsKen("Ken","Errico",
		"187th Street","Lawrence", "MA", "01830" );
		cust3.setBalance(6000.00);
		cust3.setWithdraw(1000);
		cust3.setDeposit(10);
		cust3.setInterest(2.7);
		cust3.printInfo();
		
		System.out.println("");
		System.out.println("");
		
		TellerKen cust4 = new TellerKen("Jamie", "11/16/16" );
		System.out.println("");
		cust4.ExtraCredit();
		
		
		
		
	}
}