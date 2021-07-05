package interfaces;
import java.lang.*;
import classes.Employee;

public interface IEmployeeManagementOperations
{
	boolean addEmployee(Employee e);
	boolean removeEmployee(Employee e);
	void showAllEmployee();
	Employee searchEmployee(int NID);
}