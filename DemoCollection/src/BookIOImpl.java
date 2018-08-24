import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookIO;

public class BookIOImpl implements BookIO {

	@Override
	public Book getBook() 
	{
		// TODO Auto-generated method stub
		Book b=new Book();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no:");
		b.setIsbn(sc.nextInt());sc.nextLine();
		System.out.print("Enter name:");
		b.setName(sc.nextLine());
		System.out.print("Enter publication:");
		b.setPublication(sc.nextLine());
		System.out.print("Enter price:");
		b.setPrice(sc.nextDouble());
		sc=null;
		return b;
	}

	@Override
	public void printBook(List<Book> book1) 
	{
		// TODO Auto-generated method stub
		if(book1==null)
			System.out.println("No book");
		else
		{
			for(Book b:book1)
				System.out.println(b);
		}
	}

	@Override
	public void printBook(Book book) 
	{
		// TODO Auto-generated method stub
		if(book==null)
			System.out.println("No Book");
		else
			System.out.println(book);
	}

}
