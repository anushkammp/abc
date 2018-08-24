public class Medicine 
{

	private String medicine_name;
	private float medicine_price;
	
	public Medicine() 
	{
		medicine_name=null;
		medicine_price=0;
	}
	public Medicine(String medicine_name,float medicine_price) 
	{
		this.medicine_name=medicine_name;
		this.medicine_price=medicine_price;
	}
	
	
	public String getMedicine_name() 
	{
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) 
	{
		this.medicine_name = medicine_name;
	}
	public float getMedicine_price() 
	{
		return medicine_price;
	}
	public void setMedicine_price(float medicine_price) 
	{
		this.medicine_price = medicine_price;
	}
	
	public void display()
	{
		System.out.println("Medicine data");
		System.out.println("Name :"+medicine_name+"\tPrice :"+medicine_price);
	}
	
	public static void main(String args[])
	{
		Medicine m = new Medicine();
		m.display();
		System.out.println(m.medicine_name);
	}
}
