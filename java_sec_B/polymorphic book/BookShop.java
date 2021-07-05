import java.lang.*;

public class BookShop
{
	private String name;
	private Book books[] = new Book[100];
	//private StoryBook storyBooks[] = new StoryBook[100];

	public BookShop()
	{
		System.out.println("E-BookShop");
	}
	public BookShop(String name)
	{
		System.out.println("P-BookShop");
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}
	
	public void showDetails()
	{
		System.out.println("Book shop name:"+ name);
	}
	
	
	public boolean insertBook(Book bk)
	{
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = bk;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeBook(Book bk)
	{
		boolean flag = false;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == bk)
			{
				books[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
		
	public Book searchBook(String isbn)
	{
		Book bk = null;
		for(int i =0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getIsbn() == isbn)
				{
					bk = books[i];
					break;
				}
			}
		}
		return bk;
	}
	
	public void showAllBooks()
	{
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				books[i].showDetails();
				books[i].addQuantity(5);
				books[i].sellQuantity(4);
				
			}
		}
	}
	
	
}