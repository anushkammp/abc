import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		File fn=new File("myfile.txt");
		try 
		{
			fn.createNewFile();
			System.out.println("File created successfully.");
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
