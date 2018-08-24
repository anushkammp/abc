package com.beans;

public class Book 
{
	private int isbn;
	private String name,publication,author;
	public Book() 
	{
		// TODO Auto-generated constructor stub
		isbn=10;
		name="AA";
		publication="No one";
		author="unknown";
	}
	public Book(int isbn, String name, String publication, String author) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.author = author;
	}
	@Override
	public String toString() {
		return "isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", author=" + author ;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
