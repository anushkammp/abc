import java.util.Scanner;

import com.pojo.Employee;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e;
		String name;
		int age,id;
		double salary;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter name:");
		name=sc.nextLine();
		System.out.print("Enter age:");
		age=sc.nextInt();
		System.out.print("Enter ID:");
		id=sc.nextInt();
		System.out.print("Enter salary:");
		salary=sc.nextDouble();
		
		e=new Employee(age,name,id,salary);
		e.display();
		sc.close();
	}

}
