package com.ssafy.book.service;

import java.util.List;

import com.ssafy.book.dto.BookDto;

public interface BookService {
	List<BookDto> list();
	BookDto search(String isbn);
	boolean create(BookDto bookDto);
	boolean modify(BookDto bookDto);
	boolean delete(String isbn);
}
