import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Book;
import com.connection.MyConnection;
import com.dao.BookDAO;

public class BookDAOImpl implements BookDAO 
{

	@Override
	public boolean addBook(Book book) 
	{
		boolean flag=false;
		String q="insert into Book values(?,?,?,?)";
		try 
		{
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getName());
			ps.setString(3, book.getPublication());
			ps.setString(4, book.getAuthor());
			if(ps.executeUpdate()==1)
				flag=true;
			else
				flag=false;
			
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return flag;
	}

	
	@Override
	public int updateBook(Book book, int isbn) 
	{
		// TODO Auto-generated method stub
		int row = 0;
		String q="update Book set name=? where isbn=?";
		try 
		{
			PreparedStatement st=MyConnection.getConnection().prepareStatement(q);
			st.setString(1, book.getName());
			st.setInt(2, isbn);
			row=st.executeUpdate();
			
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return row;
	}

	@Override
	public int deleteBook(int isbn) 
	{
		// TODO Auto-generated method stub
		int row = 0;
		String q="Delete from Book where isbn=?";
		try 
		{
			PreparedStatement st=MyConnection.getConnection().prepareStatement(q);
			st.setInt(1, isbn);
			row=st.executeUpdate();
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return row;
	}

	@Override
	public Book findBookbyID(int isbn) 
	{
		// TODO Auto-generated method stub
		Book e=new Book();
		
		try 
		{
			String q="select * from Book where isbn=?";
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			ps.setInt(1, isbn);
			
			ResultSet rs=ps.executeQuery();
			rs.next();
			e=new Book(rs.getInt("isbn"),rs.getString("name"),rs.getString("publication"),rs.getString("author"));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return e;
	}

	@Override
	public List<Book> findBookbyName(String name) 
	{
		// TODO Auto-generated method stub
		List<Book> li=new ArrayList<>();
		
		try 
		{
			String q="select * from Book where name=?";
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			ps.setString(1, name);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				li.add(new Book(rs.getInt("isbn"),rs.getString("name"),rs.getString("publication"),rs.getString("author")));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return li;
	}

	@Override
	public List<Book> findAllBook() 
	{
		// TODO Auto-generated method stub
		List<Book> li=new ArrayList();
		
		try 
		{
			String q="select * from Book";
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				li.add(new Book(rs.getInt("isbn"),rs.getString("name"),rs.getString("publication"),rs.getString("author")));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return li;
	}

	@Override
	public List<Book> findBookbyAuthor(String author) 
	{
		// TODO Auto-generated method stub
		List<Book> li=new ArrayList<>();
		
		try 
		{
			String q="select * from Book where author=?";
			PreparedStatement ps=MyConnection.getConnection().prepareStatement(q);
			ps.setString(1, author);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
				li.add(new Book(rs.getInt("isbn"),rs.getString("name"),rs.getString("publication"),rs.getString("author")));
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return li;
	}

}
