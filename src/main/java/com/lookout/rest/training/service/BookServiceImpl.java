package com.lookout.rest.training.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookout.rest.training.beans.Book;
import com.lookout.rest.training.dao.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository dao;
	
	@Override
	public void addBokk(Book b) {
		dao.save(b);
		
	}

	@Override
	public void deleteBook(Book b) {
		dao.delete(b);
	}

	@Override
	public List<Book> getAllBooks() {
		 List<Book> result = new ArrayList<Book>();
		 dao.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Book getBook(int id) {
		return dao.findById(id).get();
	}
}
