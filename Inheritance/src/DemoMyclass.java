import com.pojo.Employee;

public class DemoMyclass  {
	
	public static void main(String args[])
	{
		EmployeeIO emp=new EmployeeIO()

		{
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return new Employee();
			}
		
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				employee.display();
			}
		};
		emp.writeEmployee(emp.readEmployee());
	}
}