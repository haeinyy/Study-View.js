package com.ssafy.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.book.dto.BookDto;
import com.ssafy.book.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo repo;
	
	@Override
	public List<BookDto> list() {
		return repo.list();
	}
	@Override
	public BookDto search(String isbn) {
		return repo.search(isbn);
	}
	@Override
	public boolean create(BookDto bookDto) {
		return repo.create(bookDto) == 1;
	}
	@Override
	public boolean modify(BookDto bookDto) {
		return repo.modify(bookDto) == 1;
	}
	@Override
	public boolean delete(String isbn) {
		return repo.delete(isbn) == 1;
	}
}
