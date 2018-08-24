
public class AccountDanger implements Runnable 
{
	private Account ac=new Account();
	

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			makeWithdrawal(10);
			if(ac.getBalance()<=0)
				System.out.println("no balance in account");
		}
	}

	 public void makeWithdrawal(int amt)
	{
		if(ac.getBalance()>=amt)
		{
			try 
			{
				System.out.println(Thread.currentThread().getName()+" withdraw :"+amt);
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ac.withdrawl(amt);
			System.out.println(Thread.currentThread().getName()+" successfully withdrawed.............");
		}
		else
			System.out.println("No sufficient balance available");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Runnable r = new AccountDanger();
		DemoWait d=new DemoWait();
		Thread me=new Thread(r);
		me.setName("Me");
//		Thread you=new Thread(r);
//		you.setName("You");
		me.start();
		me.run();
//		you.start();
	}

}



/*            OUTPUT W/O SYNC

//	public void makeWithdrawal(int amt)

In run
In run
You withdraw :10
Me withdraw :10
Me successfully withdrawed.............
You successfully withdrawed.............
You withdraw :10
Me withdraw :10
You successfully withdrawed.............
You withdraw :10
Me successfully withdrawed.............
Me withdraw :10
You successfully withdrawed.............
You withdraw :10
Me successfully withdrawed.............
Me withdraw :10
You successfully withdrawed.............
You withdraw :10
Me successfully withdrawed.............
Me withdraw :10
You successfully withdrawed.............
no balance in account
Me successfully withdrawed.............
no balance in account


				OUTPUT WITH SYNC


*/