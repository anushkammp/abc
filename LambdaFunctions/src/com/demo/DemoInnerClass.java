package com.demo;

public class DemoInnerClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyInterface mi=new MyInterface() {
			
			@Override
			public void showData() 
			{	
				System.out.println("Demo inner class");
			}
		};
		mi.showData();

	}

}