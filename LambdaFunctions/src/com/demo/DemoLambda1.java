package com.demo;

public class DemoLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myntrface2 mi=(a,b) -> {System.out.println("Addition:"+(a+b));};
		mi.add(12,13);
	}

}
