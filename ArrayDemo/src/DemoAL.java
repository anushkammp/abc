import java.util.ArrayList;

public class DemoAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(12);
		System.out.println(" Size : "+list.size());
		System.out.println("Array :"+list);
		for(Object a:list)
			System.out.print("  "+a);
		list.add(2, 10);
		System.out.println("Array :"+list);
//		list.remove(2);			//to remove using index
		list.remove(new Integer(10));//to remove particular data
		
		System.out.println("Array :"+list);

	}

}
