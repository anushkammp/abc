package com.demo;

public class DemoLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi = ()-> {System.out.println("in Lambda");};
		mi.showData();
	}
	

}
