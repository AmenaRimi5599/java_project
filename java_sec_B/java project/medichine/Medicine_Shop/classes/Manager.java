package classes;
import java.lang.*;
import interfaces.*;

public class Manager extends Employee
{
	private String academicDetails;
	
	public Manager(){
		super();
		System.out.println("Default Manager");
	}
	
	public Manager(String empId, String name, double salary, String academicDetails)
	{
		super(empId,name,salary);
		System.out.println("Parameterized Manager");
		this.academicDetails = academicDetails;
	}
	
	public void setAcademicDetails(String academicDetails)
	{
		this.academicDetails = academicDetails;
	}
	public int getAcademicDetails()
	{
		return academicDetails;
	}
	public void showDetails()
	{
		System.out.println("\nEmployee Type: Manager");
		System.out.println("Employee Name: "+getEmpName());
		System.out.println("Employee NID: "+getNid());
		System.out.println("Employee Phone: "+ getPhone());
		System.out.println("Employee Email: "+ getEmail());
		System.out.println("Employee Salary: "+ getSalary());
		System.out.println("Employee Academic Details: "+ academicDetails);
	}
}