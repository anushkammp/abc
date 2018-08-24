package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class LoginDAO 
{
	public boolean checkLogin(String username,String password)
	{
		boolean success=false;

		Connection con=MyConnection.getConnection();
		try 
		{
			PreparedStatement st=con.prepareStatement("SELECT UNAME FROM LOGIN WHERE UNAME=(?) and PASSWORD=(?)");
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			if(rs.next())
				success=true;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return success;
	}

}
