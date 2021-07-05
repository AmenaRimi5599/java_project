import java.lang.*;

public class Book
{
	private String  isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	
	public Book()
	{
		System.out.println("");
	}
	
	public Book(String isbn , String bookTitle , String authorName , double price , int availableQuantity )
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		//System.out.println("Parameterized Book");
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
	public void setAvaiableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
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
		return availableQuantity;
	}
	
	
	void showDetails()
	{
		System.out.println("Show isbn:" + getIsbn() );
		System.out.println("Show Book Title:" + getBookTitle() );
		System.out.println("Show Author Name:"+ getAuthorName());
		System.out.println("Show Price:"+ getPrice());
		System.out.println("Show Avaiable Quantity:"+ getAvaiableQuantity());
		
	}
	
	void addQuantity(int amount)
	{
		if(amount>0)
			{
				availableQuantity = availableQuantity + amount;
				System.out.println("Avaiable Books after adding:" +availableQuantity);
			}
		else
			{
				System.out.println("Invalid");
			}
	}
	void sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
			{
				availableQuantity = availableQuantity - amount;
				System.out.println("Avaiable Books after selling:" +availableQuantity);
			}
		else
			{
				System.out.println("Invalid");
			}
	}
	
}