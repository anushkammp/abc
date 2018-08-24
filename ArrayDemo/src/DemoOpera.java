import java.util.Arrays;

public class DemoOpera 
{

	public static void main(String[] args) 
	{
		int [] numbers = {12, 34, 56,3 ,78, 91, 21, 43, 65, 87, 19};
//		Arrays.fill(numbers,3,5, 0);
		
		int [] a= Arrays.copyOf(numbers, 7);
		
		for(int f:numbers)
			System.out.print("  "+f);
		
		System.out.println("");
		for(int f1:a)
			System.out.print("  "+f1);
		
		if(Arrays.equals(a, numbers))
			System.out.println("Equal");
		else
			System.out.println("not Equal");
		
		Arrays.sort(a);

		System.out.println("");
		for(int f1:a)
			System.out.print("  "+f1);
		
		System.out.println("Index:"+Arrays.binarySearch(a, 3));
	}

}
