package classes;

import java.lang.*;
import interfaces.IMedicineShopOperations;

public class MedicineShop implements IMedicineShopOperations
{
	private String medShopName;
	private String ownerName;
	
	private Medicine medicines[] = new Medicine[300];
	
	public MedicineShop(){System.out.println("Empty Medicine Shop");}
	
	public MedicineShop(String medShopName, String ownerName)
	{
		System.out.println("/......./");
		this.medShopName = medShopName;
		this.ownerName = ownerName;
	}
	
	public void setMedShopName(String medShopName){this.medShopName = medShopName;}
	public String getMedShopName(){return medShopName;}
	
	public void setOwnerName(String ownerName){this.ownerName = ownerName;}
	public String getOwnerName(){return ownerName;}
	
	public void showDetails()
	{
	System.out.println("Medicine Shop name:" +getMedShopName()+ "and Owner name:" +getOwnerName();
	}
	
	public boolean insertMedicine(Medicine med)
	{
		boolean flag = false;
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] == null)
			{
				medicines[i] = med;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeMedicine(Medicine med)
	{
		boolean flag = false;
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] == med)
			{
				medicines[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
		
	public Medicine searchMedicine(String medName)
	{
		Medicine med = null;
		for(int i =0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMedName() == medName )
				{
					med = medicines[i];
					break;
				}
			}
		}
		return med;
	}
	
	public void showAllMedicine()
	{
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				medicines[i].showDetails();
				medicines[i].addMedicine(5,"inhaler");
				medicines[i].sellMedicine(4,"syrup");
				
			}
		}
	}
	
	
	