
public class Account 
{
	private int balance=50;
	
	public int getBalance()
	{
		return balance;
	}
	public void withdrawl(int withdraw)
	{
		balance-=withdraw;
	}

}
