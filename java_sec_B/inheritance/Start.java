import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber(1112);
		sa1.setAccountHolderName("OOP1 E");
		sa1.setBalance(3000.0);
		sa1.setInterestRate(7.6);
		System.out.println("------------------------");
		
		SavingsAccount sa2 = new SavingsAccount(1111,"OOP1 B", 2000.0, 5.7);
		System.out.println("------------------------");
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(2112);
		fa1.setAccountHolderName("OOP1 D");
		fa1.setBalance(3500.0);
		fa1.setTenureYear(5);
		System.out.println("------------------------");
		
		FixedAccount fa2 = new FixedAccount(2111, "OOP1 A", 2500.0, 10);
		System.out.println("------------------------");
		
		System.out.println("Account Number: "+sa1.getAccountNumber());
		System.out.println("Account Holder Name: "+sa1.getAccountHolderName());
		System.out.println("Balance : "+sa1.getBalance());
		System.out.println("Interest Rate: "+ sa1.getInterestRate());
		System.out.println("------------------------");
		
		sa2.showDetails();
		
		System.out.println("------------------------");
		
		System.out.println("Account Number: "+fa1.getAccountNumber());
		System.out.println("Account Holder Name: "+fa1.getAccountHolderName());
		System.out.println("Balance : "+fa1.getBalance());
		System.out.println("Tenure Year: "+ fa1.getTenureYear());
		System.out.println("------------------------");
		
		fa2.showDetails();
	}
}