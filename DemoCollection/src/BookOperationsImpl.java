import java.util.ArrayList;
import java.util.List;
import com.beans.Book;
import com.interfaces.BookOperations;

public class BookOperationsImpl implements BookOperations 
{
	public List<Book> books=new ArrayList<Book>();
	
	@Override
	public int addBook(Book book) 
	{
		// TODO Auto-generated method stub
		BookFileImpl bf=new BookFileImpl();
		List<Book> bo=new ArrayList<Book>();
		bo.add(book);	
		bf.writeDataToFile(bo);
		return 1;
	}

	@Override
	public boolean deleteBook(Book book) 
	{
		// TODO Auto-generated method stub
		boolean removed=books.remove(book);
		if(removed)
			return true;
		else
			return false;
	}

	@Override
	public Book findBookbyID(Book book) 
	{
		// TODO Auto-generated method stub
		boolean found=books.contains(book);
		Book bf=null;
		boolean flag=false;
		if(found)
		{
			for(Book b1:books)
			{
				if(b1.getIsbn()==book.getIsbn())
					{
						bf=b1;
						flag=true;
						break;
					}
			}
			if(flag)
				return bf;
			else
				return null;
		}
		else
			return null; 
		
	}

	@Override
	public List<Book> findBookByName(String book_name) 
	{
		// TODO Auto-generated method stub
//		BookIOImpl b=new BookIOImpl();
		List<Book> li=new ArrayList<Book>();
		boolean flag=false;
		for(Book b1:books)
		{
			if(book_name.equals(b1.getName()))
				{
					li.add(b1);
					flag=true;
				}
		}
		if(flag)
			return li;
		else
			return null;
		}

	public void printAll()
	{
		
		for(Book b:books)
			System.out.println(b);
	}
}
