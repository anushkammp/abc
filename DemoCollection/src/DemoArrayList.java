import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//List :ordered,unsorted,allow duplicate
		List<String> l=new ArrayList();
		l.add("ABC");
		l.add("XYZ");
		l.add("Hello");
		l.add("Morning");
		l.add("MAD");
		l.add("MAD");
		l.add(2, "YOO");
		
//		l.size();
		
		System.out.println(l);
		System.out.println(l.size());
		
		//Iterator is interface which is implemented in ArrayList class
		Iterator<String> i=l.iterator();
		String a;
		while(i.hasNext())
		{
			a=i.next();
			System.out.println(a);
		}
		
//		--------------FOR EACH
//		for(String ar:l)
//			System.out.println(ar);
		
//		l.remove(2);
//		if(l.remove("MAD"))
//			System.out.println("Removed successfully");
//		else
//			System.out.println("No valid data");
		
//		System.out.println(l.set(2, "MAD"));
		
// 		---------------for searching data
//		if(l.contains("123"))
//			System.out.println("Value found");
//		else
//			System.out.println("Value not found");
//		public void add(List l)	{	}
		
	}

}
