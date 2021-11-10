package com.ssafy.product.service;

import java.util.List;

import com.ssafy.product.dto.CommentDto;

public interface CommentService {
	List<CommentDto> list(String code);
	boolean create(CommentDto commentDto);
	boolean modify(CommentDto commentDto);
	boolean delete(int commentNo);	
}
