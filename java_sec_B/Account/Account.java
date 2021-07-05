import java.lang.*;

public class Account
{
	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Account");
	}
	
	public Account(int accountNumber , String accountHolderName , double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		System.out.println("Parameterized Account");
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	public double getBalance()
	{
		return balance;
	}
	void showDetails()
	{
		System.out.println("Show Account Number:" + getAccountNumber() );
		System.out.println("Show Account Holder Name:" + getAccountHolderName() );
		System.out.println("Show Account Balance:"+ getBalance());
	}
	
}