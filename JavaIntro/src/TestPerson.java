import java.util.Scanner;
public class TestPerson 
{

	public static void main(String[] args) 
	{

		Person p = new Person();
		Person p1 = new Person(12,"ABCD");
		/*
		Scanner sc=new Scanner(System.in);
		String n;
		int a;
		System.out.print("Enter name:");
		n=sc.nextLine();
		System.out.print("Enter age:");
		a=sc.nextInt();
		p.adddata(a,n);
		p.display();
		//p1.adddata(12,"ABC");
		p1.display();
		*/
		p.display();
		p1.display();
	}

}
