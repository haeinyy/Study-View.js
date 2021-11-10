package com.ssafy.product.repo;

import java.util.List;

import com.ssafy.product.dto.ProductDto;

public interface ProductRepo {
	List<ProductDto> list();
	ProductDto search(String code);
	int create(ProductDto productDto);
	int modify(ProductDto productDto);
	int delete(String code);
}
