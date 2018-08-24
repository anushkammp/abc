import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriter {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try 
		{
			FileWriter fw=new FileWriter("abc.txt",true);
			fw.write("\nCSIPL,Pune");
			System.out.println("data added");
			fw.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
