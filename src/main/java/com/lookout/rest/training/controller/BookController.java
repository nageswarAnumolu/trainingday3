package com.lookout.rest.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lookout.rest.training.aspect.Logging;
import com.lookout.rest.training.beans.Book;
import com.lookout.rest.training.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getBooks() {
		System.out.println("**************************");
		return service.getAllBooks();
	}
	
	@Logging
	@RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
	public Book getBook(@PathVariable int id) {
		System.out.println("inside........ method");
		return service.getBook(id);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public Book getBookById(@RequestParam int id) {
		return service.getBook(id);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.POST)
	public void addBook(@RequestBody Book book) {
		System.out.println(book.getName());
		 service.addBokk(book);
	}
}
