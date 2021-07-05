import java.lang.*;

public class TextBook
{
	private String  isbn;
	private String textBookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String category;
	private static double discountRate ;
	
	public TextBook()
	{
		System.out.println("Empty TextBook");
	}
	
	public TextBook(String isbn , String textBookTitle , String authorName , double price , int availableQuantity , String category)
	{
		this.isbn = isbn;
		this.textBookTitle = textBookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.category = category;
		System.out.println("Parameterized TextBook");
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
	public void setTextBookTitle(String textBookTitle)
	{
		this.textBookTitle = textBookTitle;
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
	public String getTextBookTitle()
	{
		return textBookTitle;
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
		System.out.println("Show Book Title:" + getTextBookTitle() );
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
				System.out.println("Avaiable Text Books after adding:" +availableQuantity);
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
				System.out.println("Avaiable Text Books after selling:" +availableQuantity);
			}
		else
			{
				System.out.println("Invalid");
			}
	}
	
}