package interfaces;

import java.lang.*;
import classes.Medicine;

public interface IMedicineOperations
{
	void addMedicine(int amount, String type);
	void sellMedicine(int amount, String type);
}