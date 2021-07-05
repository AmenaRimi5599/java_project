package classes;
import java.lang.*;
import interfaces.*;

public class Customer
{
	private String cusName;
	private String phone;
	private String email;
	private int nid;
	private int accountId;
	
	public Customer()
	{
		System.out.println("Default Customer");
	}
	
	public Customer(String cusName, String phone, String email, int nid, int accountId)
	{
		System.out.println("Parameterized Syrup");
		this.cusName = cusName;
		this.phone = phone;
		this.email = email;
		this.nid = nid;
		this.accountId = accountId;
	}
	
	public void setCusName(String cusName)
	{
		this.cusName = cusName;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setAccountId(int accountId)
	{
		this.accountId = accountId;
	}
	
	public String getCusName()
	{
		return this.cusName;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public String getEmail()
	{
		return this.email;
	}
	public int getNid()
	{
		return this.nid;
	}
	public int getAccountId()
	{
		return this.nid;
	}
	
	public void showDetails()
	{
		System.out.println("Customer Name :" + getCusName());
		System.out.println("Phone :" + getPhone());
		System.out.println("Email :" + getEmail());
		System.out.println("NID : " + getNid());
		System.out.println("Account Id: " + getAccountId());
	}
}