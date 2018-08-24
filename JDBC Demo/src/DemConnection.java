import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class DemConnection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try 
		{
			Connection c=MyConnection.getConnection();
			System.out.println("Connection successfull");
			
			
//			TO INSERT INTO TABLE
			Statement stmt=c.createStatement();
			stmt.executeUpdate("insert into EMPLOYEE values(1,'ONE',12)");
//			
			
//			FETCH DATA FROM DB
			Statement st=c.createStatement();
			ResultSet rs=st.executeQuery("SELECT EMPID,ENAME FROM EMPLOYEE;");
			while(rs.next())
				System.out.println(rs.getInt(1)+" : "+rs.getString(2));
			
			
			MyConnection.closeConnection();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}