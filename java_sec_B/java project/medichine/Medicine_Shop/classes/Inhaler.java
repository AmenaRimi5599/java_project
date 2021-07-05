package classes;
import java.lang.*;
import interfaces.*;

public class Inhaler extends Medicine
{
	private String type;
	
	public Inhaler()
	{
		super();
		System.out.println("Default Inhaler");
	}
	
	public Inhaler(int medID, String medName, String medComapny, int medCost, String medGroup, String medType, int medQuantity, String type)
	{
		super(medID,medName,medComapny,medCost,medGroup,medType,medQuantity);
		System.out.println("Parameterized Inhaler");
		this.type = type;
	}
	
	public void setInhType(String type)
	{
		this.type = type;
	}
	public int getInhType()
	{
		return type;
	}
	public void showDetails()
	{
		System.out.println("Inhaler Type :" + getInhType());
	}
}
		