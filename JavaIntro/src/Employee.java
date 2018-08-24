import java.util.Scanner;
public class Employee 
{

	//data member
	private int age;
	private String name;

	//set functions
	public void setName(String a)
	{
		name=a;
	}
	public void setAge(int a)
	{
		age=a;
	}
	
	//get functions
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void shoEmployeeDetail()
	{
		System.out.println("Name :"+getName()+"\tAge :"+getAge());
	}
	
	//main function
	public static void main(String[] args) 
	{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		String n;
		int a;
		System.out.print("Enter name:");
		n=sc.nextLine();
		e.setName(n);
		System.out.print("Enter age:");
		a=sc.nextInt();
		e.setAge(a);
		e.shoEmployeeDetail();
		
		sc.close();
	}

}
