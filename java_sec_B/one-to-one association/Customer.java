import java.lang.*;

public class Customer
{
	private int nid;
	private String name;
	private String phnNumber;
	private int age;
	private SavingsAccount savingsAccount;
	private FixedAccount fixedAccount;
	
	public Customer(){System.out.println("E-Customer");}
	public Customer(int nid, String name, String phnNumber, int age, SavingsAccount savingsAccount, FixedAccount fixedAccount)
	{
		System.out.println("P-Customer");
		this.nid = nid;
		this.name = name;
		this.phnNumber = phnNumber;
		this.age = age;
		this.savingsAccount = savingsAccount;
		this.fixedAccount = fixedAccount;
	}
	
	public void setNid(int nid){this.nid = nid;}
	public void setName(String name){this.name = name;}
	public void setPhnNumber(String phnNumber){this.phnNumber = phnNumber;}
	public void setAge(int age){this.age = age;}
	public void setSavingsAccount(SavingsAccount savingsAccount){this.savingsAccount = savingsAccount;}
	public void setFixedAccount(FixedAccount fixedAccount){this.fixedAccount = fixedAccount;}
	
	public int getNid(){return nid;}
	public String getName(){return name;}
	public String getPhnNumber(){return phnNumber;}
	public int getAge(){return age;}
	public SavingsAccount getSavingsAccount(){return savingsAccount;}
	public FixedAccount getFixedAccount(){return fixedAccount;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + nid);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Phone Number: " + phnNumber);
		System.out.println("Customer Age: " + age);
		System.out.println();
		System.out.println("****************Customer Savings Account *****************");
		System.out.println();
		savingsAccount.showDetails();
		System.out.println();
		System.out.println("****************Customer Fixed Account *****************");
		System.out.println();
		fixedAccount.showDetails();
	}
}