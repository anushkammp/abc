import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHashMap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,Book> m=new HashMap<>();
		
		
//		m.put("DB", "Mumbai");		
		m.put("Stories", new Book(12,"AAA","Me",123));
		m.put("History", new Book(123,"Chawa","King",434));
		m.put("Mytho",new Book(34,"Shiva","Amish",234));
		m.put("Study", new Book(1234,"Adv Java","Oracle",1234));
		System.out.println(m);
		
		
		Set<Entry<String,Book>> entries=m.entrySet();
		
		Iterator<Entry<String,Book>> it=entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String,Book> ent=it.next();
			System.out.println(ent.getKey()+" : "+ent.getValue());
		}

	}

}
