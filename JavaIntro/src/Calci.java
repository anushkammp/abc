import java.lang.Math;
import java.util.Scanner;

public class Calci 
{
	private double number1,number2;
	
	public void set(double number1,double number2)
	{
		this.number1=number1;
		this.number2=number2;
	}
	public double Ceil(double num)
	{
		double c;
		c=Math.ceil(num);
		return c;
	}
	
	public double Max(double num1,double num2)
	{
		return Math.max(num1, num2);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.print("Enter first number :");
		a=sc.nextDouble();
		System.out.print("Enter second number:");
		b=sc.nextDouble();
		Calci c = new Calci();
		
		//ceiling value
		System.out.println("Ceiling value of "+a+" is :"+c.Ceil(a));
		System.out.println("Ceiling value of "+b+" is :"+c.Ceil(b));
		
		//maximum
		System.out.println("Maximum of "+a+" "+b+" is :"+c.Max(a, b));
		
		//sqareroot
		System.out.println("Square root of "+a+" is :"+Math.sqrt(a));
		System.out.println("Square root of "+b+" is :"+Math.sqrt(b));
		
		//round
		System.out.println("Round of "+a+" is :"+Math.round(a));
		System.out.println("Round of "+b+" is :"+Math.round(b));

	}

}
