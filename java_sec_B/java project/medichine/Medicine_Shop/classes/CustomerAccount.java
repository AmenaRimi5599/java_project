package classes;
import java.lang.*;
import interfaces.*;

public class CustomerAccount implements ICustomerAccountOptions
{
	private String accountType;
	
	private Payment payments[] = new Payment[100];
	private Medicine medicines[] = new Medicine[100];
	private Customer customers[] = new Customer[100];
	
	public void setAccountType(String accountType){this.accountType = accountType;}
	public String getAccountType(){return accountType;}
	
	
	public CustomerAccount(){System.out.println("Default CustomerAccount");}
	
	public CustomerAccount(String accountType){
		System.out.println("Parameterized CustomerAccount");
		this.accountType = accountType;
	}
	
	public void showAllPayments(int accountId){
		for(int i=0; i<payments.length; i++)
		{
			if(payments[i] != null && payments[i].getAccountId() == accountId)
			{
				payments[i].showDetails();
				System.out.println("\n");
			}
		}
	}
	
	public boolean deletePaymentHistory(Payment pay){
		boolean flag = false;
		for(int i=0; i<payments.length; i++)
		{
			if(payments[i] == pay)
			{
				payments[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Medicine newPayment(String medName, int amount, Payment pay){
		Medicine med2 = null;
		for(int i =0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMedName() == medName )
				{
					int p = medicines[i].getMedQuantity();
					p= p-amount;
					med2 = medicines[i];
					payments[i] = pay; 
					break;
				}
			}
		}
		return med2;
	}
	
	public Payment searchPayment(int paymentId){
		Payment pay1 = null;
		for(int i =0; i<payments.length; i++)
		{
			if(payments[i] != null)
			{
				if(payments[i].getPaymentId() == paymentId )
				{
					pay1 = payments[i];
					break;
				}
			}
		}
		return pay1;
	}
	
	public void showAllCustomer(){
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				customers[i].showDetails();
				System.out.println("\n");
			}
		}
	}
	
	public boolean insertCustomer(Customer c){
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == null)
			{
				customers[i] = c;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeCustomer(Customer c2){
		boolean flag = false;
		for(int i=0; i<customers.length; i++)
		{
			if(customers[i] == c2)
			{
				customers[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Customer searchCustomer(int nid){
		Customer c3 = null;
		for(int i =0; i<customers.length; i++)
		{
			if(customers[i] != null)
			{
				if(customers[i].getNid() == nid )
				{
					c3 = customers[i];
					break;
				}
			}
		}
		return c3;
	}
	
	
}