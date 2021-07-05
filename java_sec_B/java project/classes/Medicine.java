package classes;

import.java.lang*;
import interfaces.IMedicineOperations;


public abstract class Medicine implements IMedicineOperations
{
	protected int medID;
	protected String medName;
	protected String medCompany;
	protected int medCost;
	protected String medGroup;
	protected String medType;
	protected int medQuantity;
	
	public Medicine(){System.out.println("Empty Medicine");}
	
	public Medicine(int medID, String medName, String medCompany, int medCost, String medGroup, String medType, int medQuantity)
	{
		System.out.println("/........./");
		this.medID = medID;
		this.medName = medName;
		this.medComapny = medComapny;
		this.medCost = medCost;
		this.medGroup = medGroup;
		this.medType = medType;
		this.medQuantity = medQuantity;
	}
	
	public void setMedID(int medID){this.medID = medID;}
	public int getMedID(){return medID;}
	
	public void setMedName(String medName){this.medName = medName;}
	public String getMedName(){return medName;}
	
	public void setMedComapny(String medComapny){this.medComapny = medCompany;}
	public String getMedCompany(){return medComapny;}
	
	public void setMedCost(int medCost){this.medCost = medCost;}
	public int getMedCost(){return medCost;}
	
	public void setMedGroup(String medGroup){this.medGroup = medGroup;}
	public String getMedGroup(){return medGroup;}
	
	public void setMedType(String medType){this.medType = medType;}
	public String getMedType(){return medType;}
	
	public void setMedQuantity(int medQuantity){this.medQuantity = medQuantity;}
	public int getMedQuantity(){return medQuantity;}
	
	public void addMedicine(int amount, String type)
	{
		if(amount>0 && type = "tablet")
		{
			medQuantity = medQuantity + amount;
			System.out.println("Avaiable Tablet after adding:" + medQuantity);
		}
		else if(amount>0 && type = "injection")
		{
			medQuantity = medQuantity + amount;
			System.out.println("Avaiable Injection after adding:" + medQuantity);
		}
		else if(amount>0 && type = "inhaler")
		{
			medQuantity = medQuantity + amount;
			System.out.println("Avaiable Inhaler after adding:" + medQuantity);
		}
		else if(amount>0 && type = "syrup")
		{
			medQuantity = medQuantity + amount;
			System.out.println("Avaiable Syrup after adding:" + medQuantity);
		}
		else
			System.out.println("Inavlid");
	}
	
	public void sellMedicine(int amount, String type)
	{
		if(amount>0 && amount<=medQuantity && type = "tablet")
		{
			medQuantity = medQuantity - amount;
			System.out.println("Avaiable Tablet after selling:" + medQuantity);
		}
		else if(amount>0 && amount<=medQuantity && type = "injection")
		{
			medQuantity = medQuantity - amount;
			System.out.println("Avaiable Injection after selling:" + medQuantity);
		}
		else if(amount>0 && amount<=medQuantity && type = "inhaler")
		{
			medQuantity = medQuantity - amount;
			System.out.println("Avaiable Inhaler after selling:" + medQuantity);
		}
		else if(amount>0 && amount<=medQuantity && type = "syrup")
		{
			medQuantity = medQuantity - amount;
			System.out.println("Avaiable Syrup after selling:" + medQuantity);
		}
		else
			System.out.println("Invalid");
	}
	
	public abstract void showDetails();
}