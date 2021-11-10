package com.ssafy.product.repo;

import java.util.List;

import com.ssafy.product.dto.CommentDto;

public interface CommentRepo {
	List<CommentDto> list(String code);
	int create(CommentDto commentDto);
	int modify(CommentDto commentDto);
	int delete(int commentNo);	
}
