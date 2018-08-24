package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnotation 
{
	@MyAnnotation(value=12)
	@MyDate(date=13,month="Jan",year=2019)
	@Annotation1(number2=12)
	public static int add(int no1,int no2)
	{
		return no1+no2;
	}
//	public static void display()
//	{
//		System.out.println("Display");
//	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestAnnotation test= new TestAnnotation();
		Class c1=test.getClass();
		
		Method[] methods=c1.getMethods();
		for(Method method:methods)
		{
			Annotation[] an=method.getAnnotations();
			for(Annotation a:an)
			{
				if(a.annotationType().equals(Annotation1.class))
				{
					Annotation1 no=(Annotation1)a;
//					int date=m.date();
					System.out.println("Sum:"+add(no.number1(),no.number2()));
				}
			}
		}
	}
}