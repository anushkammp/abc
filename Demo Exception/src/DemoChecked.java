import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoChecked {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//compile time exceptions-
		//to print the exception-Table,log file(),console
		//Throwable: Exception -> IOException -> FileNotFoundxception
		

		
		try(FileInputStream fi=new FileInputStream("aa.txt");) 
		{
			ObjectInputStream oi=new ObjectInputStream(fi);
			oi.readObject();
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			
		}
		
		
	}

}
