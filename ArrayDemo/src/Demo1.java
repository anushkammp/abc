//import Package1.My

public class Demo1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] a={10,12,13};
		int[] b;
		a[0]=12;
		
		int [] numbers;
		
		numbers= new int[5];
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=10;
		numbers[3]=40;
		numbers[4]=30;
		//sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
		//numbers[3]=10;
		
		//System.out.println("1st ele:"+numbers[0]+"\t2nd ele :"+numbers[1]+"\t3rd ele :"+numbers[2]);
//		
		
//		for(int i=0;i<5;i++)
//		{
//			sum=sum+numbers[i];
//		}
//		
//		sum = add(numbers);
//		System.out.println("Sum:"+sum);
//	
//	public static int add(int [] number)
//	{
//		return(number[0]+number[1]+number[2]+number[3]+number[4]);
//	}
		System.out.println("While");
		int i=0;
		while(i<numbers.length)
		{
			System.out.println(numbers[i]);
			i++;
		}
		
		System.out.println("Do While");
		i=0;
		do
		{
			System.out.println(numbers[i]);
			i++;
		}while(i<numbers.length);
	}
}
