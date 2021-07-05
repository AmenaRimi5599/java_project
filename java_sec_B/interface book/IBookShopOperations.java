import java.lang.*;

public interface IBookShopOperations
{
	boolean insertBook(Book bk);
	boolean removeBook(Book bk)'
	void showAllBooks();
	Book searchBook(String isbn);
}