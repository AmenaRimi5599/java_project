import java.lang.*;

public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public void setId(int i)
	{
		id = i;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setCgpa(double c)
	{
		cgpa = c;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	
	public static void main(String []args)
	{
		Student s = new Student();
		
		s.setId(555);
		s.setName("Rimi");
		s.setCgpa(3.5);
		
		System.out.println("ID is : " + s.getId());
		System.out.println("NAME is  : " +s.getName());
		System.out.println("CGPA is : " +s.getCgpa());
	}
}
	