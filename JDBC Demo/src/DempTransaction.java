import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.connection.MyConnection;

public class DempTransaction {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Connection con=MyConnection.getConnection();
		
		try 
		{
			con.setAutoCommit(false);				//by default true
			
			Statement st=con.createStatement();
			st.executeUpdate("insert into Employee values(11,'AAA',120)");
			st.executeUpdate("insert into Employee values(161,'BBB',320)");
			st.executeUpdate("insert into Employee values(18,'CCC',420)");
			st.executeUpdate("insert into Employee values(112,'AAA',120)");
			
			con.commit();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			try 
			{
				con.rollback();
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

}
