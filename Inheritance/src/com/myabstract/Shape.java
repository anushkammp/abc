package com.myabstract;

abstract public class Shape 
{
	private String name;
	
	public Shape()
	{
		name="no name";
	}
	public Shape(String name)
	{
		super();
		this.name=name;
	}
	
	public void desc()
	{
		System.out.println("Name:"+name);
	}
	
	abstract public double area();
	
}
