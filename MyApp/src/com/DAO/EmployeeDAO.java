package com.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.pojos.Employee;

public class EmployeeDAO 
{
	
	public List<Employee> findAllEmployee()
	{
		List<Employee> emp=new ArrayList<Employee>();
		String q="select * from employee";
		
		Connection con=MyConnection.getConnection();
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs=st.executeQuery(q);
			while(rs.next())
			{
				Employee e=new Employee();
				e.setEmpID(rs.getInt(1));
				e.setSalary(rs.getInt(3));
				e.setName(rs.getString(2));
				emp.add(e);
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return emp;
	}

}
