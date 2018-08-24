
public class Thread1 extends Thread 
{
	private int data;
	
	public Thread1() {
		// TODO Auto-generated constructor stub
		data=10;
	}
	
	public Thread1(int data) {
		// TODO Auto-generated constructor stub
		this.data=data;
	}
	
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("Data:"+data+"\t Name:"+Thread.currentThread().getName());
	}

}
