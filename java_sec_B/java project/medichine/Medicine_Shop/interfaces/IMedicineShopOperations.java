package interfaces;
import java.lang.*;
import classes.*;

public interface IMedicineShopOperations{
	boolean insertMedicine(Medicine med);
	boolean removeMedicine(Medicine med);
	void showAllMedicine();
	Medicine searchMedicine(String medName);
	Medicine medicineSell(String medName, int amount);
	Medicine medicineAdd(String medName, int amount);
}