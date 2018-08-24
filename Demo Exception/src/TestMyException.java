import com.exception.MyException;

public class TestMyException {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int age=1;
		try
		{
			if(age<18)
			{
				throw new MyException("Your age is not greater than 18");
			}
		}
		catch(MyException e)
		{
			e.printStackTrace();
		}

	}

}
