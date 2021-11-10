package com.ssafy.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ssafy.product.dto.ProductDto;
import com.ssafy.product.service.ProductService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/product")
public class ProductRestController {
	private static final Logger logger = LoggerFactory.getLogger(ProductRestController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	ProductService productService;

	@ApiOperation(value = "모든 제품의 정보를 반환한다.", response = List.class)
	@GetMapping
	public ResponseEntity<List<ProductDto>> listBook() {
		logger.debug("listBook - 호출");
		return new ResponseEntity<>(productService.list(), HttpStatus.OK);
	}

	@ApiOperation(value = "code에 해당하는 제품의 정보를 반환한다.", response = ProductDto.class)
	@GetMapping("/{code}")
	public ResponseEntity<ProductDto> searchBook(@PathVariable String code) {
		logger.debug("searchBook - 호출");
		return new ResponseEntity<>(productService.search(code), HttpStatus.OK);
	}

	@ApiOperation(value = "새로운 제품 정보를 입력한다. 그리고 DB입력 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PostMapping
	public ResponseEntity<String> createBook(@RequestBody ProductDto productDto) {
		logger.debug("createBook - 호출");
		if(productService.create(productDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@ApiOperation(value = "code에 해당하는 제품의 정보를 수정한다. 그리고 DB수정 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@PutMapping("{code}")
	public ResponseEntity<String> modifyBook(@RequestBody ProductDto productDto) {
		logger.debug("modifyBook - 호출");
		logger.debug("" + productDto);
		if(productService.modify(productDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@ApiOperation(value = "code에 해당하는 제품의 정보를 삭제한다. 그리고 DB삭제 성공여부에 따라 'success' 또는 'fail' 문자열을 반환한다.", response = String.class)
	@DeleteMapping("{code}")
	public ResponseEntity<String> deleteBook(@PathVariable("code") String code) {
		logger.debug("deleteBook - 호출");
		if(productService.delete(code)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}
