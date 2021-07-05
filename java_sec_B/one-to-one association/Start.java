import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		SavingsAccount sa1 = new SavingsAccount();
		sa1.setAccountNumber(1111);
		sa1.setBalance(5000.0);
		sa1.setInterestRate(7.5);
		
		SavingsAccount sa2 = new SavingsAccount(1112, 6000.0, 7.9);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(2111);
		fa1.setBalance(1000000.0);
		fa1.setTenureYear(10);
		
		FixedAccount fa2 = new FixedAccount(2112, 2000000.0, 5);
		
		Customer c1 = new Customer();
		c1.setNid(11111111);
		c1.setName("Mr. ABC");
		c1.setPhnNumber("+8801711111111");
		c1.setAge(20);
		c1.setSavingsAccount(sa1);
		c1.setFixedAccount(fa1);
		
		Customer c2 = new Customer(11111112, "Ms. XYZ", "+8801811111111", 20, sa2, fa2);
		
		System.out.println("\n-----------------------------------\n");
		
		System.out.println("Customer NID: " + c1.getNid());
		System.out.println("Customer Name: " + c1.getName());
		System.out.println("Customer Phone Number: " + c1.getPhnNumber());
		System.out.println("Customer Age: " + c1.getAge());
		System.out.println();
		System.out.println("****************Customer Savings Account *****************");
		System.out.println();
		System.out.println("Customer - Savings Account Number: " + c1.getSavingsAccount().getAccountNumber());
		System.out.println("Customer - Savings Account Balance: " + c1.getSavingsAccount().getBalance());
		System.out.println("Customer - Savings Account Interest Rate: " + c1.getSavingsAccount().getInterestRate());
		System.out.println();
		System.out.println("****************Customer Fixed Account *****************");
		System.out.println();
		System.out.println("Customer - Fixed Account Number: " + c1.getFixedAccount().getAccountNumber());
		System.out.println("Customer - Fixed Account Balance: " + c1.getFixedAccount().getBalance());
		System.out.println("Customer - Fixed Account Interest Rate: " + c1.getFixedAccount().getTenureYear());
		
		System.out.println("\n-----------------------------------\n");
		
		c2.showDetails();
	}
}