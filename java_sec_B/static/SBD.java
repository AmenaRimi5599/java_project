import java.lang.*;

public class SBD
{
	static
	{
		System.out.println("Static 4");
	}
	
	private int i1;
	private static int i2;
	
	static
	{
		i2 = 10;
		System.out.println("Static 1");
	}
	static 
	{
		System.out.println("Static 2");
	}
	
	public static void main(String args[])
	{
		System.out.println("Inside Main");
		
		System.out.println("i2: " + SBD.i2);
		
		SBD.i2 = 100;
		
		SBD sbd1 = new SBD();
		sbd1.show();
		
		SBD.initialize(11);
		System.out.println("i2: " + SBD.i2);
		
		SBD sbd2 = new SBD(15, 30);
		sbd2.show();
		sbd1.show();
	}
	
	static
	{
		i2 = 20;
		System.out.println("Static 3");
	}
	
	public void show()
	{
		System.out.println("i1: "+i1);
		System.out.println("i2: "+i2);
	}
	
	public static void initialize(int a)
	{
		i2 = a;
	}
	public SBD()
	{
		
	}
	public SBD(int x, int y)
	{
		i1 = x;
		i2 = y;
	}
}