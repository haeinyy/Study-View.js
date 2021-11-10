package com.ssafy.product.service;

import java.util.List;

import com.ssafy.product.dto.ProductDto;

public interface ProductService {
	List<ProductDto> list();
	ProductDto search(String code);
	boolean create(ProductDto productDto);
	boolean modify(ProductDto productDto);
	boolean delete(String code);
}
