import java.lang.*;


public class Start
{
	public static void main(String args[])
	{
		Account a1 = new Account();
		a1.setAccountNumber(11111111);
		a1.setAccountHolderName("Sakib");
		a1.setBalance(5000.0);
		
		Account a2 = new Account(11111112, "Ihraz", 4500.0);
		
		Account a3 = new Account();
		a3.setAccountNumber(11111113);
		a3.setAccountHolderName("Rifat");
		a3.setBalance(5000.0);
		
		Account a4 = new Account(11111114, "Amena", 4500.0);
		
		Account accounts[] = new Account [5];
		
		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;
		accounts[3] = a4;
		
		accounts[4] = new Account();
		
		accounts[4].setAccountHolderName("Tasmia");
		accounts[4].setAccountNumber(11111115);
		accounts[4].setBalance(2000.0);
	
		for(int i=0; i<accounts.length; i++)
		{
			accounts[i].showDetails();
			System.out.println("-----------------------");
		}
		
	}
}