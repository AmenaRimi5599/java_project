import java.lang.*;

public class TextBook extends Book
{
	private int standard;
	
	public TextBook()
	{
		super();
		System.out.println("Empty text book");
	}
	
	public TextBook(String isbn, String bookTitle, String authorName, double price, int avaiableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, avaiableQuantity);
		System.out.println("parameter text book");
		this.standard = standard;
	}
	
	public void setStandard(int standard)
	{
		this.standard = standard;
	}
	
	public int getStandard()
	{
		return standard;
	}
	public void showDetails()
	{
		System.out.println("Books Standard :" + getStandard());
	}
}