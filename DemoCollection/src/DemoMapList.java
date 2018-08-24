import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.beans.Book;

public class DemoMapList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,List<Book>> m=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String search_book;
		
		List<Book> book1=new ArrayList<>();
		book1.add(new Book(1,"AAA","Me",123));
		book1.add(new Book(12,"BBB","Me",123));
		book1.add(new Book(124,"CCC","Me",123));
		book1.add(new Book(11,"DDD","Me",123));
		m.put("ByMe", book1);
		
		List<Book> book2=new ArrayList<>();
		book2.add(new Book(1,".net","Oracle",123));
		book2.add(new Book(12,"ETL","Oracle",123));
		book2.add(new Book(124,"Java","Oracle",123));
		m.put("Study", book2);
		
		List<Book> book3=new ArrayList<>();
		book3.add(new Book(19,"Barbie","Disney",123));
		book3.add(new Book(13,"Tinker Bell","Disney",123));
		book3.add(new Book(11,"Coco","Disney",123));
		book3.add(new Book(11,"Snow World","Disney",123));
		m.put("Fairy", book3);
		
		Set<Entry<String, List<Book>>> all=m.entrySet();
		
		Iterator<Entry<String, List<Book>>> it=all.iterator();
		
		System.out.println("Enter the collection you want to search:");
		search_book=sc.nextLine();
		
		while(it.hasNext())
		{
			Entry<String, List<Book>> ent=it.next();
//			System.out.println(ent.getKey());
			
			if(ent.getKey().equals(search_book))
			{
				List<Book> li=ent.getValue();
				
				for(Book b:li)
					System.out.println(b);
			}
	
		}

	}

}
