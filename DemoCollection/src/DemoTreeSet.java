import java.util.Set;
import java.util.TreeSet;

import com.beans.Book;
import com.compare.MyComparator;

public class DemoTreeSet {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<Book> books=new TreeSet(new MyComparator());
		books.add(new Book());
		books.add(new Book(1234,"Adv Java","Oracle",1234));
		books.add(new Book(123,"Java","Oracle",34));
		books.add(new Book(102,"Spring","Oracle",1234));
		
		System.out.println("size:"+books.size());
		for(Book b:books)
			System.out.println(b);

	}

}
