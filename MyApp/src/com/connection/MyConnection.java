package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnection 
{
	private static Connection con;
	
	public static Connection getConnection()
	{
		try 
		{
			Context c=new InitialContext(); 
			Context env=(Context) c.lookup("java:comp/env");
			DataSource ds=(DataSource) env.lookup("jdbc/TestDB");
			con=ds.getConnection();
			System.out.println("Connection established");
			
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
			
		}
		catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	
	public static void closeConnection()
	{
		try 
		{
			con.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
