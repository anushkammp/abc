import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			System.out.println("Enter 1st no:");
			String a1=br.readLine();
			int a=Integer.parseInt(a1);
			System.out.println("Enter 2nd no:");
			String b1=br.readLine();
			int b=Integer.parseInt(b1);
			System.out.println("Maximum is:"+Math.max(a, b));
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
