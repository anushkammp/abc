package com.demo;

public class DemoLambda2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		Person person1,person2;
		Interface2 i2=(p1,p2)->{return(p1.getAge()==p2.getAge());};
		i2.add(new Person(),new Person());

//		System.out.println();
	}

}
