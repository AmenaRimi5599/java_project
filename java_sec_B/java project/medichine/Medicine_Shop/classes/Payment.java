package classes;
import java.lang.*;
import interfaces.*;

public class Payment
{
	private int paymentId;
	private int accountId;
	
	public Payment(){System.out.println("Default Payment");}
	
	public Payment(int paymentId, int accountId)
	{
		System.out.println("Parameterized Payment");
		this.paymentId = paymentId;
		this.accountId = accountId;
	}
	
	public void setPaymentId(int paymentId){this.paymentId = paymentId;}
	public void setAccountId(int accountId){this.accountId = accountId;}
	
	public int getPaymentId(){return this.paymentId;}
	public int getAccountId(){return this.accountId;}
	
	public void showDetails()
	{
		System.out.println("\nPayment Details");
		System.out.println("Payment Id: "+paymentId);
		System.out.println("Account Id: "+accountId);
	}
}