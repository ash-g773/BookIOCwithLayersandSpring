package com.book.service;

import java.util.Collection;

import com.book.entity.Book;

public interface BookService {

	Collection<Book> getAllBooks(); //list all books
	
	Book searchBookById(int id); //search book id
	
	boolean addNewBook(Book book);//add new book
	
		
}
