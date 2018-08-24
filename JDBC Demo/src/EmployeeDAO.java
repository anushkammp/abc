import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.pojos.Employee;

public class EmployeeDAO 
{
	public int addEmployee(Employee e)
	{
		int no = 0;
		String q="insert into Employee values(?,?,?)";
		try 
		{
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			ps.setInt(1, e.getEmpID());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getSalary());
			no=ps.executeUpdate();
			
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return no;
	}
	
	public List<Employee> getAllEmployee()
	{
		Statement st;
		List<Employee> emps = new ArrayList();
		try 
		{
			Connection con=MyConnection.getConnection();
			st = con.createStatement();
			ResultSet rs=st.executeQuery("Select * from Employee");
			while(rs.next())
			{
				emps.add(new Employee(rs.getInt(1),rs.getInt(3),rs.getString(2)));
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emps;
	}
	
	public Employee updateEmployee(int id,Employee emp)
	{
		Employee e=new Employee();
		
		String q="update Employee set salary=? where empid=?";
		try 
		{
			PreparedStatement st=MyConnection.getConnection().prepareStatement(q);
			st.setInt(1, emp.getSalary());
			st.setInt(2, id);
			int row=st.executeUpdate();
			if(row>0)
				e=findEmployee(id);
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

	
	public Employee findEmployee(int id)
	{
		Employee e=new Employee();
	
		try 
		{
			Connection con=MyConnection.getConnection();
			String q="select * from employee where empid=?";
			Statement ps=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery(q);
			rs.next();
			e=new Employee(rs.getInt("empid"),rs.getInt("salary"),rs.getString("ename"));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return e;
	}
	
	public Employee updateAll()
	{
		Employee e=new Employee();
	
		try 
		{
			Connection con=MyConnection.getConnection();
			String q="select * from employee where empid=?";
			Statement ps=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
//			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery(q);
			while(rs.next())
			{
				rs.updateInt(3, 12000);
				rs.updateRow();
			}
			e=new Employee(rs.getInt("empid"),rs.getInt("salary"),rs.getString("ename"));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	
	public void MetaData() 
	{
		// TODO Auto-generated method stub
		try 
		{
			Connection con=MyConnection.getConnection();
			DatabaseMetaData meta=con.getMetaData();
			
			String q="select * from employee";
			Statement ps=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs=ps.executeQuery(q);
			System.out.println("DB Metadata:"+meta.getDatabaseProductName());
			ResultSetMetaData rsmeta=rs.getMetaData();
			System.out.println("RS Column cnt:"+rsmeta.getColumnCount());
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}


/*
 * 
 * to update data using result set
 * st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
 * 
 * 
 */
