package com.ssafy.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.book.dto.CommentDto;
import com.ssafy.book.repo.CommentRepo;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepo repo;
	
	@Override
	public List<CommentDto> list(String isbn) {
		return repo.list(isbn);
	}
	@Override
	public boolean create(CommentDto commentDto) {
		return repo.create(commentDto) == 1;
	}
	@Override
	public boolean modify(CommentDto commentDto) {
		return repo.modify(commentDto) == 1;
	}
	@Override
	public boolean delete(int commentNo) {
		return repo.delete(commentNo) == 1;
	}
}
