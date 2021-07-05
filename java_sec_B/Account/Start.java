import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Account acc = new Account();
		
		acc.setAccountNumber(555);
		acc.setAccountHolderName("Rimi");
		acc.setBalance(5000.0);
		
		System.out.println("Account Number: "+acc.getAccountNumber());
		System.out.println("Account Holder Name: "+acc.getAccountHolderName());
		System.out.println("Account Balance: "+acc.getBalance());
		
		System.out.println("\n");
		
		Account acc1 = new Account(55,"rimpim",4500.0);
		acc1.showDetails();
		
	}
}