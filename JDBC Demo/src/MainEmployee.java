import java.util.List;
import java.util.Scanner;

import com.pojos.Employee;

public class MainEmployee {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeeDAO dao=new EmployeeDAO();

//		USER INPUT TO ADD EMPLOYEE
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter EmpID:");
//		int id=sc.nextInt();sc.nextLine();
//		System.out.print("Enter Emp name:");
//		String name=sc.nextLine();
//		System.out.print("Enter Emp salary:");
//		int salary=sc.nextInt();
//		Employee e=new Employee(id,salary,name);
		
//		ADD DATA
//		int row=dao.addEmployee(e);
//		if(row>0)
//			System.out.println(row+" rows affected");
//		else
//			System.out.println("Failed to execte query");
		
//		DISPLAY DATA
		System.out.println("Display data");
		List<Employee> emp=dao.getAllEmployee();
		for(Employee em:emp)
			System.out.println(em);
		
//		UPDATE DATA
		System.out.println("Update data");
		int id=12;
		Employee e=new Employee(0,20000,"ABC");
		Employee eupdate=dao.updateEmployee(id, e);
		System.out.println(eupdate);
		
//		FIND EMPLOYEE BY ID
//		int id=12;
//		Employee e=dao.findEmployee(id);
//		System.out.println(e);
	}

}
