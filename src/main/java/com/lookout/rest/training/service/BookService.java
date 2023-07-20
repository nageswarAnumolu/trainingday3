package com.lookout.rest.training.service;

import java.util.List;

import com.lookout.rest.training.beans.Book;

public interface BookService {
	
	
	public void addBokk(Book b);
	
	public Book getBook(int id);
	
	public void deleteBook(Book b);
	
	public List<Book> getAllBooks();

}
