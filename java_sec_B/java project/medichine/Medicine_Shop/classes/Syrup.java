package classes;
import java.lang.*;
import interfaces.*;

public class Syrup extends Medicine
{
	private String syDose;
	
	public Syrup()
	{
		super();
		System.out.println("Default Syrup");
	}
	
	public Syrup(int medID, String medName, String medComapny, int medCost, String medGroup, String medType, int medQuantity, String syDose)
	{
		super(medID,medName,medComapny,medCost,medGroup,medType,medQuantity);
		System.out.println("Parameterized Syrup");
		this.syDose = syDose;
	}
	
	public void setSyDose(String syDose)
	{
		this.syDose = syDose;
	}
	public int getSyDose()
	{
		return syDose;
	}
	public void showDetails()
	{
		System.out.println("Syrup Dose :" + getSyDose());
	}
}
		