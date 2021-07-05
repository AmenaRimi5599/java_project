import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		TextBook tb1 = new TextBook();
		tb1.setIsbn("R-50");
		tb1.setBookTitle("Algorithm");
		tb1.setAuthorName("xyz");
		tb1.setPrice(250);
		tb1.setAvaiableQuantity(8);
		tb1.setStandard(4);
		
		TextBook tb2 = new TextBook("R-55", "Data Structure", "abc", 300, 12, 3);
		
		TextBook tb3 = new TextBook("R-60", "Java", "pqr", 300, 12, 3);
		
		TextBook tb4 = new TextBook("R-65", "C#", "mnp", 300, 12, 3);
		
		TextBook tb5 = new TextBook("R-70", "Web Technologies", "dgh", 300, 12, 3);
		
		System.out.println("------------------------");
		
		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("A-10");
		sb1.setBookTitle("Rebecca");
		sb1.setAuthorName("XYZ");
		sb1.setPrice(350);
		sb1.setAvaiableQuantity(10);
		sb1.setCategory("Family");
		
		StoryBook sb2 = new StoryBook("A-15","Four women","ABC",450,15,"Family");
		
		StoryBook sb3 = new StoryBook("A-20","Sherlock Holmes","Arthur Conan",450,15,"Detective");
		
		StoryBook sb4 = new StoryBook("A-25","3 Goyenda","Rakib hasan",450,15,"Detective");
		
		StoryBook sb5 = new StoryBook("A-30","Heidi","Johanna Spyri",450,15,"Novel");
		
		System.out.println("------------------------");
				
		BookShop bs1 = new BookShop("Amena Library");
		
		System.out.println("------------------------");
		
		bs1.showDetails();
		//bs1.addQuantity(5);
		//bs1.sellQuantity(5);
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		//bs1.addQuantity(5);
		//bs1.sellQuantity(5);
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		//bs1.addQuantity(5);
		//bs1.sellQuantity(5);
		System.out.println("\n--------------------------------------\n");
		
		//1
		if(bs1.insertTextBook(tb1))
		{
			System.out.println(tb1.getIsbn() + " Inserted for book " + tb1.getBookTitle());
		}
		else
		{
			System.out.println(tb1.getIsbn() + " Not inserted for book " + tb1.getBookTitle());
		}
		
		//2
		if(bs1.insertTextBook(tb2))
		{
			System.out.println(tb2.getIsbn() + " Inserted"+ tb2.getBookTitle());
		}
		else
		{
			System.out.println(tb2.getIsbn() + " Not Inserted"+ tb2.getBookTitle());
		}
		
		//3
		if(bs1.insertTextBook(tb3))
		{
			System.out.println(tb3.getIsbn() + " Inserted"+ tb3.getBookTitle());
		}
		else
		{
			System.out.println(tb3.getIsbn() + " Not Inserted"+ tb3.getBookTitle());
		}
		
		//4
		if(bs1.insertTextBook(tb4))
		{
			System.out.println(tb4.getIsbn() + " Inserted"+ tb4.getBookTitle());
		}
		else
		{
			System.out.println(tb4.getIsbn() + " Not Inserted"+ tb4.getBookTitle());
		}
		
		//5
		if(bs1.insertTextBook(tb5))
		{
			System.out.println(tb5.getIsbn() + " Inserted"+ tb5.getBookTitle());
		}
		else
		{
			System.out.println(tb5.getIsbn() + " Not Inserted"+ tb5.getBookTitle());
		}
		
		/*----------------*/
		
		//1
		if(bs1.insertStoryBook(sb1))
		{
			System.out.println(sb1.getIsbn() + " Inserted for book " + sb1.getBookTitle());
		}
		else
		{
			System.out.println(sb1.getIsbn() + " Not inserted for book " + sb1.getBookTitle());
		}
		
		//2
		if(bs1.insertStoryBook(sb2))
		{
			System.out.println(sb2.getIsbn() + " Inserted"+ sb2.getBookTitle());
		}
		else
		{
			System.out.println(sb2.getIsbn() + " Not Inserted"+ sb2.getBookTitle());
		}
		
		//3
		if(bs1.insertStoryBook(sb3))
		{
			System.out.println(sb3.getIsbn() + " Inserted"+ sb3.getBookTitle());
		}
		else
		{
			System.out.println(sb3.getIsbn() + " Not Inserted"+ sb3.getBookTitle());
		}
		
		//4
		if(bs1.insertStoryBook(sb4))
		{
			System.out.println(sb4.getIsbn() + " Inserted"+ sb4.getBookTitle());
		}
		else
		{
			System.out.println(sb4.getIsbn() + " Not Inserted"+ sb4.getBookTitle());
		}
		
		//5
		if(bs1.insertStoryBook(sb5))
		{
			System.out.println(sb5.getIsbn() + " Inserted"+ sb5.getBookTitle());
		}
		else
		{
			System.out.println(sb5.getIsbn() + " Not Inserted"+ sb5.getBookTitle());
		}
		
		System.out.println("\n--------------------------------------\n");
		
		bs1.showDetails();
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		System.out.println("\n--------------------------------------\n");
		
		if(bs1.removeTextBook(tb3))
		{
			System.out.println(tb3.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(tb3.getIsbn() + " Not Removed");
		}
		
		if(bs1.removeTextBook(tb5))
		{
			System.out.println(tb5.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(tb5.getIsbn() + " Not Removed");
		}
		/*-------------*/
		
		if(bs1.removeStoryBook(sb4))
		{
			System.out.println(sb4.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(sb4.getIsbn() + " Not Removed");
		}
		
		//5
		if(bs1.removeStoryBook(sb5))
		{
			System.out.println(sb5.getIsbn() + " Removed");
		}
		else
		{
			System.out.println(sb5.getIsbn() + " Not Removed");
		}
		
		System.out.println("\n--------------------------------------\n");
		
		bs1.showDetails();
		System.out.println("\n*********** BookShop For TextBooks **************\n");
		bs1.showAllTextBooks();
		System.out.println("\n*********** BookShop For StoryBooks **************\n");
		bs1.showAllStoryBooks();
		System.out.println("\n--------------------------------------\n");
		
		TextBook txtb = bs1.searchTextBook(tb4.getIsbn());
		if(txtb != null)
		{
			System.out.println("Book Found....");
			txtb.showDetails();
		}
		else
		{
			System.out.println("No Book Found with Book Isbn: " + tb4.getIsbn());
		}
		System.out.println("\n--------------------------------------\n");
		
		StoryBook stb = bs1.searchStoryBook(sb2.getIsbn());
		if(stb != null)
		{
			System.out.println("Book Found....");
			stb.showDetails();
		}
		else
		{
			System.out.println("No Book Found with Book Isbn: " + sb2.getIsbn());
		}
		
	}
}