import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Book b1 = new Book();
		
		b1.setIsbn("555");
		b1.setBookTitle("Mysterious Island");
		b1.setAuthorName("Rimi");
		b1.setPrice(500.0);
		b1.setAvaiableQuantity(5);
		
		Book b2 = new Book("531","To The Moon","Amena",450.0,7);
		
		Book b3 = new Book();
		
		b3.setIsbn("213");
		b3.setBookTitle("Java");
		b3.setAuthorName("Rimjhim");
		b3.setPrice(600.0);
		b3.setAvaiableQuantity(9);
		
		Book b4 = new Book("456","C#","Mimi",550.0,3);
		
		//Book b5 = new Book("332","Advance Programming","Alex",350.0,8);
		
		Book books[] = new Book[5];
		
		books[0] = b1;
		books[1] = b2;
		books[2] = b3;
		books[3] = b4;
		
		books[4] = new Book();
		
		books[4].setIsbn("332");
		books[4].setBookTitle("Advance Programming");
		books[4].setAuthorName("Alex");
		books[4].setPrice(350.0);
		books[4].setAvaiableQuantity(8);
		
		for(int i = 0; i<books.length;i++)
		{
			books[i].showDetails();
			books[i].addQuantity(3);
			books[i].sellQuantity(5);
			System.out.println("\n");
		}
		
	}
}