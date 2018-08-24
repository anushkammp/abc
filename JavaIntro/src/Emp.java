
public class Emp 
{

	private int empID;
	private double salary;
	private String empName;
	private String compName;
	
	public Emp()
	{
		empID=1;
		empName="ANY";
		salary=100;
		compName="CSIPL";
	}
	public Emp(int empID,String empName,double salary)
	{
		this();
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Employee data");
		System.out.println("EmpID :"+empID+"\tEmpName :"+empName+"\tSalary :"+salary+"\tCompName :"+compName);
	}
	public static void main(String args[])
	{
		Emp e=new Emp(12,"Me",100000);
		e.display();
	}
}
