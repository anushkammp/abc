package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookFile 
{
	public boolean writeDataToFile(List<Book> books);
	public List<Book> readDataFromFile();
	public boolean updateDataToFile(Book b);
}
