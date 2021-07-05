package interfaces;

import java.lang.*;
import classes.Medicine;

public interface IMedicineShopOperations
{
	boolean insertMedicine(Medicine med);
	boolean removeMedicine(Medicine med);
	void showAllMedicine();
	Medicine searchMedicine(String medName);
}