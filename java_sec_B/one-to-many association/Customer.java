import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private String phnNumber;
	private int age;
	private SavingsAccount savingsAccounts[] = new SavingsAccount[10];
	private FixedAccount fixedAccounts[] = new FixedAccount[10];

	public Customer()
	{
		System.out.println("E-Customer");
		/*savingsAccounts = new SavingsAccount[10];
		fixedAccounts = new FixedAccount[10];*/
	}
	public Customer(int nid, String name, String phnNumber, int age)
	{
		//this();
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.phnNumber = phnNumber;
		this.age = age;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	public void setAge(int age){this.age = age;}

	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	public int getAge(){return age;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Phone Number: " + phnNumber);
		System.out.println("Customer Age: " + age);
	}
	
	public boolean insertSavingsAccount(SavingsAccount sa)
	{
		boolean flag = false;
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == null)
			{
				savingsAccounts[i] = sa;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeSavingsAccount(SavingsAccount sa)
	{
		boolean flag = false;
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] == sa)
			{
				savingsAccounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllSavingsAccounts()
	{
		for(int i=0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				savingsAccounts[i].showDetails();
			}
		}
	}
	
	public SavingsAccount searchSavingsAccount(int accountNumber)
	{
		SavingsAccount sa = null;
		for(int i =0; i<savingsAccounts.length; i++)
		{
			if(savingsAccounts[i] != null)
			{
				if(savingsAccounts[i].getAccountNumber() == accountNumber)
				{
					sa = savingsAccounts[i];
					break;
				}
			}
		}
		return sa;
	}
	
	
	
	
	
	public boolean insertFixedAccount(FixedAccount fa)
	{
		boolean flag = false;
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == null)
			{
				fixedAccounts[i] = fa;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFixedAccount(FixedAccount fa)
	{
		boolean flag = false;
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] == fa)
			{
				fixedAccounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public void showAllFixedAccounts()
	{
		for(int i=0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				fixedAccounts[i].showDetails();
			}
		}
	}
	
	public FixedAccount searchFixedAccount(int accountNumber)
	{
		FixedAccount fa = null;
		for(int i =0; i<fixedAccounts.length; i++)
		{
			if(fixedAccounts[i] != null)
			{
				if(fixedAccounts[i].getAccountNumber() == accountNumber)
				{
					fa = fixedAccounts[i];
					break;
				}
			}
		}
		return fa;
	}
}