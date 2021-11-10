package com.ssafy.book.service;

import java.util.List;

import com.ssafy.book.dto.CommentDto;

public interface CommentService {
	List<CommentDto> list(String isbn);
	boolean create(CommentDto commentDto);
	boolean modify(CommentDto commentDto);
	boolean delete(int commentNo);	
}
