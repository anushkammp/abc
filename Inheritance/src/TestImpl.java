import com.pojo.Employee;

public class TestImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeIO e=new EmployeeIOImpl();
//		Employee e1=e.readEmployee();
//		e.writeEmployee(e1);
		e.writeEmployee(e.readEmployee());
	}

}
