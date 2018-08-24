import java.util.Scanner;

public class DString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String a,b;
		String [] arr;
		
		System.out.println("Enter the string:");
		a=sc.next();
		
		System.out.println("String:"+a);
		
		System.out.print("Concatination:");
		a=a.concat(" Hello");
		System.out.println("String:"+a);
		
		System.out.print("Split:");
		arr=a.split(a);
		System.out.println("String:"+arr);
		
		System.out.print("Replace string:");
		System.out.println("Enter the string:");
		b=sc.next();
		a=a.replaceAll(a, b);
		System.out.println("String:"+a);
		
		System.out.print("Lower case:");
		a=a.toLowerCase();
		System.out.println("String:"+a);
		
		System.out.print("Replace character:");
		a=a.replace("a", "t");
		System.out.println("String:"+a);
		
		System.out.print("Substring:");
		a=a.substring(2, 4);
		System.out.println("String:"+a);
	

	}

}
