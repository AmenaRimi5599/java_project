package classes;
import java.lang.*;
import interfaces.*;

public class Clark extends Employee
{
	private String previousWorkDetails;
	
	public Clark(){
		super();
		System.out.println("Default Manager");
	}
	
	public Clark(String empId, String name, double salary, String previousWorkDetails)
	{
		super(empId,name,salary);
		System.out.println("Parameterized Manager");
		this.previousWorkDetails = previousWorkDetails;
	}
	
	public void setPreviousWorkDetails(String previousWorkDetails)
	{
		this.previousWorkDetails = previousWorkDetails;
	}
	public int getPreviousWorkDetails()
	{
		return previousWorkDetails;
	}
	public void showDetails()
	{
		System.out.println("\nEmployee Type: Clark");
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Employee NID: "+getNid());
		System.out.println("Employee Phone: "+ getPhone());
		System.out.println("Employee Email: "+ getEmail());
		System.out.println("Employee Salary: "+ getSalary());
		System.out.println("Employee Previous Work Details: "+ previousWorkDetails);
	}
}