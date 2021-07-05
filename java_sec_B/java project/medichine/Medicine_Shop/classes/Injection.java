package classes;
import java.lang.*;
import interfaces.*;

public class Injection extends Medicine
{
	private int volume;
	
	public Injection()
	{
		super();
		System.out.println("Default Injection");
	}
	
	public Injection(int medID, String medName, String medComapny, int medCost, String medGroup, String medType, int medQuantity, int volume)
	{
		super(medID,medName,medComapny,medCost,medGroup,medType,medQuantity);
		System.out.println("Parameterized Injection");
		this.volume = volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	public int getVolume()
	{
		return volume;
	}
	public void showDetails()
	{
		System.out.println("Injection volume :" + getVolume());
	}
}
		