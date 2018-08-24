import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InputStreamReader rd=new InputStreamReader(System.in);
	
		try 
		{
			System.out.println("Enter number:");
			int value = rd.read();
			System.out.println("Value:"+(char)value);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
