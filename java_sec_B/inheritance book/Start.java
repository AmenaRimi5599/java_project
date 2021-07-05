import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("A-10");
		sb1.setBookTitle("Java");
		sb1.setAuthorName("XYZ");
		sb1.setPrice(350);
		sb1.setAvaiableQuantity(10);
		sb1.setCategory("OOP1");
		System.out.println("------------------------");
		
		StoryBook sb2 = new StoryBook("B-5","C#","ABC",450,15,"OPP2");
		System.out.println("------------------------");
		
		TextBook tb1 = new TextBook();
		tb1.setIsbn("C-6");
		tb1.setBookTitle("Algorithm");
		tb1.setAuthorName("xyz");
		tb1.setPrice(250);
		tb1.setAvaiableQuantity(8);
		tb1.setStandard(4);
		System.out.println("------------------------");
		
		TextBook tb2 = new TextBook("D-4", "Data Structure", "abc", 300, 12, 3);
		System.out.println("------------------------");
		
		System.out.println("Book isbn: "+sb1.getIsbn());
		System.out.println("Book Title: "+sb1.getBookTitle());
		System.out.println("Book Author name: "+sb1.getAuthorName());
		System.out.println("Book price: "+sb1.getPrice());
		System.out.println("Avaiable Book: "+sb1.getAvaiableQuantity());
		System.out.println("Book category: "+ sb1.getCategory());
		System.out.println("------------------------");
		
		sb2.showDetails();
		sb2.addQuantity(5);
		sb2.sellQuantity(5);
		
		System.out.println("------------------------");
		
		System.out.println("Book isbn: "+tb1.getIsbn());
		System.out.println("Book Title: "+tb1.getBookTitle());
		System.out.println("Book Author name: "+tb1.getAuthorName());
		System.out.println("Book price: "+tb1.getPrice());
		System.out.println("Avaiable Book: "+tb1.getAvaiableQuantity());
		System.out.println("Book standard: "+ tb1.getStandard());
		System.out.println("------------------------");
		
		tb2.showDetails();
		tb2.addQuantity(5);
		tb2.sellQuantity(5);
	}
}