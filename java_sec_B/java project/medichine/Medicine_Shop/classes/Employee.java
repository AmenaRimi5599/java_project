package classes;
import java.lang.*;
import interfaces.*;

public class Employee
{
	protected String empName;
	protected String phone;
	protected String email;
	protected int nid;
	protected double salary;
	
	public Employee(){System.out.println("Default Employee");}
	
	public Employee(String empName, String phone, String email, int nid, double salary)
	{
		System.out.println("Parameterized Employee");
		this.empName = empName;
		this.phone = phone;
		this.email = email;
		this.nid = nid;
		this.salary = salary;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setNid(int nid)
	{
		this.nid = nid;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEmpName()
	{
		return this.empName;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public String getEmail()
	{
		return this.email;
	}
	public int getNid()
	{
		return this.nid;
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	public void showDetails()
	{
		System.out.println("\nPayment Details");
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee phone: "+phone);
		System.out.println("Employee email: "+email);
		System.out.println("Employee NId: "+nid);
		System.out.println("Employee salary: "+salary);
	}
	
}