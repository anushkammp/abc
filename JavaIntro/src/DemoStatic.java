
public class DemoStatic 
{
	private float age;
	private String name;
	
	private static int val;
	
	public DemoStatic()
	{
		age=10.12f;
		name="ABC";
		val++;
	}
	static
	{
		val=0;
	}
	
	public void display()
	{
		System.out.println(name+"\t"+age+"\t"+val);
	}
	
	public static void show()
	{
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("\t"+val);
		DemoStatic.show();
		DemoStatic d = new DemoStatic();
		DemoStatic d1 = new DemoStatic();
		DemoStatic d2 = new DemoStatic();
		d2.show();
		DemoStatic d3 = new DemoStatic();
		d3.show();
	}

}
