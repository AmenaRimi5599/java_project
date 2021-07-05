package classes;
import java.lang.*;
import interfaces.*;

public class Tablet extends Medicine
{
	private String dose;
	
	public Tablet()
	{
		super();
		System.out.println("Default Tablet");
	}
	
	public Tablet(int medID, String medName, String medComapny, int medCost, String medGroup, String medType, int medQuantity, String dose)
	{
		super(medID,medName,medComapny,medCost,medGroup,medType,medQuantity);
		System.out.println("Parameterized Tablet");
		this.dose = dose;
	}
	
	public void setDose(String dose)
	{
		this.dose = dose;
	}
	public int getDose()
	{
		return dose;
	}
	public void showDetails()
	{
		System.out.println("Tablet Dose :" + getDose());
	}
}
		