import java.lang.*;

public class BookShop
{
	private String name;
	private TextBook textBooks[] = new TextBook[100];
	private StoryBook storyBooks[] = new StoryBook[100];

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
	
	
	public boolean insertTextBook(TextBook tb)
	{
		boolean flag = false;
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == null)
			{
				textBooks[i] = tb;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeTextBook(TextBook tb)
	{
		boolean flag = false;
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] == tb)
			{
				textBooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
		
	public TextBook searchTextBook(String isbn)
	{
		TextBook tb = null;
		for(int i =0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null)
			{
				if(textBooks[i].getIsbn() == isbn)
				{
					tb = textBooks[i];
					break;
				}
			}
		}
		return tb;
	}
	
	public void showAllTextBooks()
	{
		for(int i=0; i<textBooks.length; i++)
		{
			if(textBooks[i] != null)
			{
				textBooks[i].showDetails();
			}
		}
	}
	
	
	
	
	
	public boolean insertStoryBook(StoryBook sb)
	{
		boolean flag = false;
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == null)
			{
				storyBooks[i] = sb;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeStoryBook(StoryBook sb)
	{
		boolean flag = false;
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] == sb)
			{
				storyBooks[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public StoryBook searchStoryBook(String isbn)
	{
		StoryBook sb = null;
		for(int i =0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				if(storyBooks[i].getIsbn() == isbn)
				{
					sb = storyBooks[i];
					break;
				}
			}
		}
		return sb;
	}
	
	public void showAllStoryBooks()
	{
		for(int i=0; i<storyBooks.length; i++)
		{
			if(storyBooks[i] != null)
			{
				storyBooks[i].showDetails();
			}
		}
	}
	
}