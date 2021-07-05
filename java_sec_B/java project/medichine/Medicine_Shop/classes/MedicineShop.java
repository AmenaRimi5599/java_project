package classes;
import java.lang.*;
import interfaces.*;

public class MedicineShop implements IMedicineShopOperations
{
	private String medShopName;
	private String ownerName;
	
	private Medicine medicines[] = new Medicine[300];
	
	public MedicineShop(){System.out.println("Default MedicineShop");}
	
	public MedicineShop(String medShopName, String ownerName){
		System.out.println("Parameterized MedicineShop");
		this.medShopName = medShopName;
		this.ownerName = ownerName;
	}
	
	public void setMedShopName(String medShopName){this.medShopName = medShopName;}
	public String getMedShopName(){return medShopName;}
	
	public void setOwnerName(String ownerName){this.ownerName = ownerName;}
	public String getOwnerName(){return ownerName;}
	
	public void showDetails(){
	System.out.println("Medicine Shop name: " +getMedShopName()+ " and Owner name: " +getOwnerName());
	}
	
	public boolean insertMedicine(Medicine med){
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
	
	public boolean removeMedicine(Medicine med){
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
		
	public Medicine searchMedicine(String medName){
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
	
	public void showAllMedicine(){
		for(int i=0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				medicines[i].showDetails();
				System.out.println("\n");
			}
		}
	}
	
	public Medicine medicineSell(String medName, int amount){
		Medicine med2 = null;
		for(int i =0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMedName() == medName )
				{
					int r = medicines[i].getMedQuantity();
					r= r-amount;
					med2 = medicines[i];
					break;
				}
			}
		}
		return med2;
	}
	
	public Medicine medicineAdd(String medName, int amount){
		Medicine med3 = null;
		for(int i =0; i<medicines.length; i++)
		{
			if(medicines[i] != null)
			{
				if(medicines[i].getMedName() == medName )
				{
					int v = medicines[i].getMedQuantity();
					v= v+amount;
					med3 = medicines[i];
					break;
				}
			}
		}
		return med3;
	}
}	