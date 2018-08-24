
public class DemoBlock 
{
	public DemoBlock()
	{
		System.out.println("Constructor invoked");
	}
	
	{
		System.out.println("Non static block invoked");
	}
	
	static
	{
		System.out.println("Static block invoked");
	}
	
	public void display()
	{
		System.out.println("Display invoked");
	}
	public static void show()
	{
		System.out.println("Static show invoked");
	}
	
	public static void main(String args[])
	{
		DemoBlock.show();
		DemoBlock d= new DemoBlock();
		d.display();
		DemoBlock d2= new DemoBlock();
		d2.display();
		d2.show();
	}
}
