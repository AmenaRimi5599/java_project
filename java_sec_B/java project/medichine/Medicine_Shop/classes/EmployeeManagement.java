package classes;
import java.lang.*;
import interfaces.*;

public class EmployeeManagement implements IEmployeeManagementOperations
{
	private Employee employees[] = new Employee[100];
	
	public boolean addEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
					employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
		
	public Employee searchEmployee(int NID)
	{
		Employee e = null;
		for(int i =0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getNid() == NID )
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployee()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				employees[i].showDetails();
			}
		}
	}
}