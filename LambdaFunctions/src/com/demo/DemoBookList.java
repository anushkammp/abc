package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.beans.Book;

public class DemoBookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books=new ArrayList<Book>();
		List<Book> output=new ArrayList<Book>();
		books.add(new Book(1234,"Adv Java","Oracle",1234));
		books.add(new Book());
		books.add(new Book(1,"AAA","Me",12));
		books.add(new Book(1,".net","Oracle",23));
		books.add(new Book(13,"Tinker Bell","Disney",123));

		System.out.println("Filtering");
		
		output=books.stream().filter(data -> {return (data.getPrice()>=123);}).collect(Collectors.toList());
		output.forEach(System.out::println);
		
	}

}
