package com.ssafy.book.repo;

import java.util.List;

import com.ssafy.book.dto.CommentDto;

public interface CommentRepo {
	List<CommentDto> list(String isbn);
	int create(CommentDto commentDto);
	int modify(CommentDto commentDto);
	int delete(int commentNo);	
}
