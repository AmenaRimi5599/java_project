package classes;
import java.lang.*;
import interfaces.*;

public abstract class Medicine 
{
	protected int medID;
	protected String medName;
	protected String medCompany;
	protected int medCost;
	protected String medGroup;
	protected String medType;
	protected int medQuantity;
	
	public Medicine(){System.out.println("Default Medicine");}
	
	public Medicine(int medID, String medName, String medCompany, int medCost, String medGroup, String medType, int medQuantity)
	{
		System.out.println("Parameterized Medicine");
		this.medID = medID;
		this.medName = medName;
		this.medCompany = medCompany;
		this.medCost = medCost;
		this.medGroup = medGroup;
		this.medType = medType;
		this.medQuantity = medQuantity;
	}
	
	public void setMedID(int medID){this.medID = medID;}
	public int getMedID(){return medID;}
	
	public void setMedName(String medName){this.medName = medName;}
	public String getMedName(){return medName;}
	
	public void setMedComapny(String medCompany){this.medCompany = medCompany;}
	public String getMedCompany(){return medCompany;}
	
	public void setMedCost(int medCost){this.medCost = medCost;}
	public int getMedCost(){return medCost;}
	
	public void setMedGroup(String medGroup){this.medGroup = medGroup;}
	public String getMedGroup(){return medGroup;}
	
	public void setMedType(String medType){this.medType = medType;}
	public String getMedType(){return medType;}
	
	public void setMedQuantity(int medQuantity){this.medQuantity = medQuantity;}
	public int getMedQuantity(){return medQuantity;}
	
	
	
	public abstract void showDetails();
}