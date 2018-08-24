
public interface DemoInterface 
{
	void display();
	default void description()
	{
		System.out.println("Interface description");
	}
	static void count()
	{
		System.out.println("Interface count");
	}

}
