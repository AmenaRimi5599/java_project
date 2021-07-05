package classes;

import java.lang.*;

public class Injection extends Medicine
{
	private int volume;
	
	public Injection()
	{
		super();
		System.out.println("Empty I");
	}
	
	public Injection(int medID, String medName, String medComapny, int medCost, String medGroup, String medType, int medQuantity, int volume)
	{
		super(medID,medName,medComapny,medCost,medGroup,medType,medQuantity);
		System.out.println("/....Injection..../");
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
		