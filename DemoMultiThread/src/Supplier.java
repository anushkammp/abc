
public class Supplier implements Runnable 
{
	private Message m;
	public Supplier(Message m) 
	{
		// TODO Auto-generated constructor stub
		this.m=m;
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("In Supplier");
		try {
			Thread.sleep(100);
			notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}