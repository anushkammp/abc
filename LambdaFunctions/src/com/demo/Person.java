package com.demo;

public class Person 
{
	private int age;
	private String name;
	
	public Person()
	{
		age=10;
		name="Unknown";
	}
	public Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Name :"+name+"\tAge  :"+age);
	}

	public void adddata(int a,String b)
	{
		name=b;
		age=a;
	}
	
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setValues()
	{
		age=10;
		name="Abc";
	}
}
