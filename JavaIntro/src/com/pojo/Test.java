package com.pojo;

import java.util.Scanner;

public class Test 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		int [] marks = new int[5];
		int roll_no;
		Scanner sc=new Scanner(System.in);
		Student s;
		
		System.out.println("Enter name:");
		name=sc.nextLine();
		
		System.out.println("Enter marks:");
		for(int i=0;i<5;i++)
			marks[i]=sc.nextInt();
		
		System.out.println("Enter roll number:");
		roll_no=sc.nextInt();

		s= new Student(name,marks,roll_no);
		
		s.display();
	}

}
