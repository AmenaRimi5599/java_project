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
		SavingsAccount sa3 = new SavingsAccount(1113, 6500.0, 6.7);
		SavingsAccount sa4 = new SavingsAccount(1114, 5500.0, 7.2);
		
		FixedAccount fa1 = new FixedAccount();
		fa1.setAccountNumber(2111);
		fa1.setBalance(1000000.0);
		fa1.setTenureYear(10);
		
		FixedAccount fa2 = new FixedAccount(2112, 2000000.0, 5);
		FixedAccount fa3 = new FixedAccount(2134, 1200000.0, 3);
		FixedAccount fa4 = new FixedAccount(2113, 2500000.0, 12);
		
		
		Customer c1 = new Customer(11111111, "Mr. ABC", "+8801711111111", 20);
		
		System.out.println("\n---------------------------------------\n");
		
		c1.showDetails();
		System.out.println("*********Customer Accounts************");
		c1.showAllAccounts();

		
		/*boolean flag1 = c1.insertSavingsAccount(sa1);
		if(flag == true){System.out.println("Inserted");}
		else{System.out.println("Not Inserted");}*/
		
		/*boolean flag2 = c1.insertSavingsAccount(sa1);
		if(flag){System.out.println("Inserted");}
		else{System.out.println("Not Inserted");}*/
		
		System.out.println("\n---------------------------------------\n");
		
		if(c1.insertAccount(sa1))
		{
			System.out.println(sa1.getAccountNumber() + " Inserted");
		}
		else
		{
			System.out.println(sa1.getAccountNumber() + " Not Inserted");
		}
		
		if(c1.insertAccount(sa2)){System.out.println(sa2.getAccountNumber() + " Inserted");}
		else{System.out.println(sa2.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(sa3)){System.out.println(sa3.getAccountNumber() + " Inserted");}
		else{System.out.println(sa3.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(sa4)){System.out.println(sa4.getAccountNumber() + " Inserted");}
		else{System.out.println(sa4.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa1))
		{
			System.out.println(fa1.getAccountNumber() + " Inserted");
		}
		else
		{
			System.out.println(fa1.getAccountNumber() + " Not Inserted");
		}
		
		if(c1.insertAccount(fa2)){System.out.println(fa2.getAccountNumber() + " Inserted");}
		else{System.out.println(fa2.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa3)){System.out.println(fa3.getAccountNumber() + " Inserted");}
		else{System.out.println(fa3.getAccountNumber() + " Not Inserted");}
		
		if(c1.insertAccount(fa4)){System.out.println(fa4.getAccountNumber() + " Inserted");}
		else{System.out.println(fa4.getAccountNumber() + " Not Inserted");}
		
		System.out.println("\n---------------------------------------\n");
		
		c1.showDetails();
		System.out.println("*********Customer Accounts************");
		c1.showAllAccounts();

		
		System.out.println("\n---------------------------------------\n");
		
		if(c1.removeAccount(sa2)){System.out.println(sa2.getAccountNumber() + " Removed");}
		else{System.out.println(sa2.getAccountNumber() + " Not Removed");}
		
		if(c1.removeAccount(sa4)){System.out.println(sa4.getAccountNumber() + " Removed");}
		else{System.out.println(sa4.getAccountNumber() + " Not Removed");}
		
		if(c1.removeAccount(fa3)){System.out.println(fa3.getAccountNumber() + " Removed");}
		else{System.out.println(fa3.getAccountNumber() + " Not Removed");}
		
		System.out.println("\n---------------------------------------\n");
		
		c1.showDetails();
		System.out.println("*********Customer Accounts************");
		c1.showAllAccounts();

		
		System.out.println("\n---------------------------------------\n");
		
		Account a1 = c1.searchAccount(sa2.getAccountNumber());
		if(a1 != null)
		{
			System.out.println("Object Found....");
			a1.showDetails();
		}
		else
		{
			System.out.println("No object found with account number: " + sa2.getAccountNumber());
		}
		
		System.out.println("\n---------------------------------------\n");
		
		Account a2 = c1.searchAccount(fa2.getAccountNumber());
		if(a2 != null)
		{
			System.out.println("Object Found....");
			a2.showDetails();
		}
		else
		{
			System.out.println("No object found with account number: " + fa2.getAccountNumber());
		}
		System.out.println("\n---------------------------------------\n");
		
	}
	
}