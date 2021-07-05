import java.lang.*;

public class Book
{
	private String  isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String category;
	private static double discountRate ;
	
	public Book()
	{
		System.out.println("Empty Book");
	}
	
	public Book(String isbn , String bookTitle , String authorName , double price , int availableQuantity , String category)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.category = category;
		System.out.println("Parameterized Book");
	}
	
	public static void setDiscountRate(double rate)
	{
		discountRate = rate;
	}
	public static double getDiscountRate()
	{
		return discountRate;
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
	public void setCategory(String category)
	{
		this.category = category;
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
	public String getCategory()
	{
		return category;
	}
	
	void showDetails()
	{
		System.out.println("Show isbn:" + getIsbn() );
		System.out.println("Show Book Title:" + getBookTitle() );
		System.out.println("Show Author Name:"+ getAuthorName());
		System.out.println("Show Price:"+ getPrice());
		System.out.println("Show Avaiable Quantity:"+ getAvaiableQuantity());
		System.out.println("Show Book Category:"+ getCategory());
		System.out.println("Show Book Discount Rate:"+ getDiscountRate());
		
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