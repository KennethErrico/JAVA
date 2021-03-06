/*
Ken Errico
11/16/16
Teller class
Teller adds a scanner which allows the user to input the tellers name 
and the date of the transactions which are then printed
*/

import java.util.Scanner;

public class TellerKen2
{
	public String name;
	int monthProcessed;
	int dayProcessed;
	int yearProcessed;
	
	public void setTellerInfo(String n, int m, int d, int y)
	{
		name = n;
		monthProcessed = m;
		dayProcessed = d;
		yearProcessed = y;
	}
	
	public String getTellerInfo()
	{
		System.out.println("Hello my name is: " + "\n" + name + "\n");
		System.out.println("The date of today's transactions are: ");
		return monthProcessed + "/" + dayProcessed + "/" + yearProcessed + "\n";
		
	}
	
	public void printTellerInfo()
	
	{
		System.out.println("");
		System.out.println(getTellerInfo());
	}
	
	public static void main(String[] args)
	{
		/*
		these are my objects each of which draws from previous classes using all
		methods created proving that all pieces of this program
		not only compile but do their job as intended
		*/
		
		Scanner in = new Scanner(System.in);
		
		TellerKen2 tk2 = new TellerKen2();
		
		System.out.println("Enter Tellers Name. Then enter the Month, Day, and Year of Transaction"); 
		System.out.println("Press Enter After Each Entry");
		tk2.setTellerInfo(in.next(),in.nextInt(),in.nextInt(),in.nextInt());
		tk2.printTellerInfo();
		
		
		BankAccountKen cust1 = new BankAccountKen("Ken","Errico",
		"8th Street","Lawrence", "MA", "01830" );
		cust1.setBalance(5000.00);
		cust1.setWithdraw(1000);
		cust1.setDeposit(10);
		cust1.printInfo();
		
		System.out.println("");
		
		CheckingKen cust2 = new CheckingKen("Jamie","Errico",
		"8th Street","Lawrence", "MA", "01830");
		cust2.setOverdraft();
		cust2.setBalance(100.00);
		cust2.setWithdraw(1000);
		cust2.setDeposit(10);
		cust2.printInfo();
		
		System.out.println("");

		SavingsKen cust3 = new SavingsKen("John","Errico",
		"8th Street","Lawrence", "MA", "01830" );
		cust3.setBalance(6000.00);
		cust3.setWithdraw(1000);
		cust3.setDeposit(10);
		cust3.setInterest(2.7);
		cust3.printInfo();
		
		System.out.println("");
	}
}
