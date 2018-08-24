package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookOperations 
{
	public int addBook(Book book);
	public boolean deleteBook(Book book);
	public Book findBookbyID(Book book);
	public List<Book> findBookByName(String book_name);

}
