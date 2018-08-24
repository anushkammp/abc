package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> li=new ArrayList<>();
		li.add("AA");
		li.add("BBBB");
		li.add("CC");
		li.add("DDD");
		
		System.out.println(li);
		
		System.out.println("Using For each");
		
		li.forEach(System.out::println);
		
		System.out.println("Testing.....");
		li.stream().filter(data -> {return data.length()>=3;}).collect(Collectors.toList()).forEach(System.out::println);

		
//		book price>123 or name starting with ABCXYZ
	}

}
