package com.dao;

import java.util.List;

import com.beans.Book;

public interface BookDAO 
{
	boolean addBook(Book book);
	int updateBook(Book book,int isbn);
	int deleteBook(int isbn);
	Book findBookbyID(int isbn);
	List<Book> findBookbyName(String name);
	List<Book> findAllBook();
	List<Book> findBookbyAuthor(String author);

}
