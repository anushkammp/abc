
public class DemoNotify extends Thread 
{

	public static int sum=0;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			sum=sum+i;
			synchronized (this)
			{
				notify();
			}
		}
		
	}
}
