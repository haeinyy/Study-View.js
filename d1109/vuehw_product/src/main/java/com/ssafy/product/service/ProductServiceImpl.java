package com.ssafy.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.product.dto.ProductDto;
import com.ssafy.product.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepo repo;
	
	@Override
	public List<ProductDto> list() {
		return repo.list();
	}
	@Override
	public ProductDto search(String code) {
		return repo.search(code);
	}
	@Override
	public boolean create(ProductDto productDto) {
		return repo.create(productDto) == 1;
	}
	@Override
	public boolean modify(ProductDto productDto) {
		return repo.modify(productDto) == 1;
	}
	@Override
	public boolean delete(String code) {
		return repo.delete(code) == 1;
	}
}
