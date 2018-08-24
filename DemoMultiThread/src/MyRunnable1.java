
public class MyRunnable1 implements Runnable {

	private Thread t1; 
	
	public MyRunnable1() 
	{
		// TODO Auto-generated constructor stub
		t1=new Thread(this);
		t1.start();
	}
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Thread running:"+Thread.currentThread().getName());
//		System.out.println("Hello");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Runnable r=new MyRunnable1();

	}

}
