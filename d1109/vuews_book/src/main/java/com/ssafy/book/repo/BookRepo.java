package com.ssafy.book.repo;

import java.util.List;

import com.ssafy.book.dto.BookDto;

public interface BookRepo {
	List<BookDto> list();
	BookDto search(String isbn);
	int create(BookDto bookDto);
	int modify(BookDto bookDto);
	int delete(String isbn);
}
