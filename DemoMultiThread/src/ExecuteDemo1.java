import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myapp implements Runnable
{
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		perform();
	}
	public void perform()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" : "+Thread.currentThread());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ExecuteDemo1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExecutorService exec=Executors.newFixedThreadPool(3);
		ExecutorService exec1=Executors.newFixedThreadPool(2);
		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
			exec1.execute(new myapp());
		}
		
		exec.shutdown();
		exec1.shutdown();
		
		System.out.println("Done");

	}

}
