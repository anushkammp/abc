import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class MyDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		List<Object> list=new ArrayList<Object>();
		addInfo(list);
		
		List<Book> list1=new ArrayList<Book>();
		addInfo1(list);
		
		List<IOException> list2=new ArrayList<IOException>();
		addInfo2(list2);

	}

	public static void addInfo(List<Object> books) 
	{
		System.out.println("Add info List Object");
		books.add(new Book());
	}
	
	public static void addInfo1(List<? extends Object> books) 
	{
		System.out.println("Add info List Object");
//		books.add(new Book());
	}
	
	public static void addInfo2(List<? super FileNotFoundException> books) 
	{
		System.out.println("Add info List Object");
//		books.add(new Book());
	}
}
