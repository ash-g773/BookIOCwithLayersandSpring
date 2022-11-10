package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //getters and setters
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private int noOfCopies;
	
	
}
