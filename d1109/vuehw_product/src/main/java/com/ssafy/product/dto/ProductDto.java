package com.ssafy.product.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ProductDto : 제품 한권의 정보", description = "제품의 상세 정보를 나타낸다.")
public class ProductDto {

	@ApiModelProperty(value = "고유번호", example = "111-111-1111")
	private String code;
	@ApiModelProperty(value = "상품제목")
	private String title;
	@ApiModelProperty(value = "제조자")
	private String company;
	@ApiModelProperty(value = "가격", example = "10000")
	private int price;
	@ApiModelProperty(value = "상세정보")
	private String content;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "ProductDto [code=" + code + ", title=" + title + ", company=" + company + ", price=" + price + ", content="
				+ content + "]";
	}

}
