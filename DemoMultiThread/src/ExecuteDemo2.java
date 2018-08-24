//import java.sql.CallableStatement;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Myapp1 implements Callable<Integer>
{

	private int data; 
	
	public Myapp1(int data) {
		super();
		this.data = data;
	}
	
	int perform()
	{
		int sum=0;
		for(int i=0;i<data;i++)
			sum+=i;
		return sum;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello...:"+Thread.currentThread());
		return perform();
	}
	
}

public class ExecuteDemo2 {

	public static void main(String[] args) throws InterruptedException,ExecutionException 
	{
		// TODO Auto-generated method stub
		ExecutorService exe=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<3;i++)
//			<Integer> Future<Integer> fut=exe.submit(new Myapp1(i));
		
		exe.shutdown();
	}

}
