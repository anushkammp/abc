import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try 
		{
			FileReader fr=new FileReader("abc.txt");
//			System.out.println("File successfully opened");
			byte value = 0;
			do
			{
				int data=fr.read();
				if(data!=-1)
						System.out.print((char)data);
				value=(byte)data;
			}while(value!=-1);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
