package com.lookout.rest.training.dao;


import org.springframework.data.repository.CrudRepository;

import com.lookout.rest.training.beans.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
