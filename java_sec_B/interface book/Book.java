import java.lang.*;

public abstract class Book implements IBookOperations
{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int avaiableQuantity;
	
	public Book()
	{
		System.out.println("Empty book !!");
	}
	
	public Book( String isbn, String bookTitle, String authorName, double price, int avaiableQuantity)
	{
		System.out.println("Parameter book");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.avaiableQuantity = avaiableQuantity;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAvaiableQuantity(int avaiableQuantity)
	{
		this.avaiableQuantity = avaiableQuantity;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	public String getBookTitle()
	{
		return bookTitle;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public double getPrice()
	{
		return price;
	}
	public int getAvaiableQuantity()
	{
		return avaiableQuantity;
	}
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			avaiableQuantity = avaiableQuantity + amount;
			System.out.println("Avaiable Book after adding:" + avaiableQuantity);
		}
		else
			System.out.println("Inavlid");
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=avaiableQuantity)
		{
			avaiableQuantity = avaiableQuantity - amount;
			System.out.println("Avaiable Book after selling:" + avaiableQuantity);
		}
		else
			System.out.println("Invalid");
	}
	
	public abstract void showDetails();
	/*{
		System.out.println("Book isbn:" + isbn);
		System.out.println("Book Title name:" + bookTitle);
		System.out.println("Book Author Name:" + authorName);
		System.out.println("Book Price:" + price);
		System.out.println("Avaiable Book:" + avaiableQuantity);
	}*/
}