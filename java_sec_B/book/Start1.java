import java.lang.*;

public class Start1
{
	public static void main(String args[])
	{
		Book b1 = new Book();
		
		b1.setIsbn("555");
		b1.setBookTitle("Mysterious Island");
		b1.setAuthorName("Rimi");
		b1.setPrice(500.0);
		b1.setAvaiableQuantity(5);
		b1.setCategory("thriller");
		b1.setDiscountRate(0.4);
		
		System.out.println("Book Isbn: "+b1.getIsbn());
		System.out.println("Book Title: "+b1.getBookTitle());
		System.out.println("Book Author Name: "+b1.getAuthorName());
		System.out.println("Book Price: "+b1.getPrice());
		System.out.println("Book Avaiable Quantity: "+b1.getAvaiableQuantity());
		System.out.println("Book Category: "+b1.getCategory());
		System.out.println("Book Discount Rate: "+b1.getDiscountRate());
		
		System.out.println("\n");
		
		Book b2 = new Book("55","To The Moon","Rimi",450.0,5,"Journey");
		b2.showDetails();
		b2.addQuantity(3);
		b2.sellQuantity(3);
		
		System.out.println("\n");
		TextBook t1 = new TextBook();
		
		t1.setIsbn("125");
		t1.setTextBookTitle("Java");
		t1.setAuthorName("Rimi");
		t1.setPrice(450.0);
		t1.setAvaiableQuantity(9);
		t1.setCategory("Programming Book");
		t1.setDiscountRate(0.3);
		
		System.out.println("Book Isbn: "+t1.getIsbn());
		System.out.println("Book Title: "+t1.getTextBookTitle());
		System.out.println("Book Author Name: "+t1.getAuthorName());
		System.out.println("Book Price: "+t1.getPrice());
		System.out.println("Book Avaiable Quantity: "+t1.getAvaiableQuantity());
		System.out.println("Book Category: "+t1.getCategory());
		System.out.println("Book Discount Rate: "+t1.getDiscountRate());
		
		System.out.println("\n");
		
		TextBook t2 = new TextBook("98","C#","Rimi",350.0,10,"Programming Book");
		t2.showDetails();
		t2.addQuantity(2);
		t2.sellQuantity(4);
	}
}