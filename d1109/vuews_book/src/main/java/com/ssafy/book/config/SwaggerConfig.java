package com.ssafy.book.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.*;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//3.0.0 http://localhost:8080/vuews/swagger-ui/index.html
//2.9.2 http://localhost:8080/vuews/swagger-ui.html
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		ApiInfo apiInfo=new ApiInfoBuilder()
			.title("SSAFY API")
			.description("<h2>SSAFY VUE Book WorkShop API Reference for Developers</h2><img src='../ssafy.png'>")
			.termsOfServiceUrl("https://edu.ssafy.com")
			.license("SSAFY License")
			.licenseUrl("https://www.ssafy.com/ksp/jsp/swp/etc/swpPrivacy.jsp")
			.version("6.0")
			.build();
		return new Docket(DocumentationType.SWAGGER_2)
			.groupName("ssafyVueBookWS")
			.apiInfo(apiInfo)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.ssafy.book.controller"))
			//.paths(PathSelectors.ant("/*/book/**").or(PathSelectors.ant("/*/comment/**"))) //3.0.0
			//.paths(PathSelectors.ant("/book/**").or(PathSelectors.ant("/comment/**"))) //2.9.2
			.paths(PathSelectors.ant("/**/book/**").or(PathSelectors.ant("/**/comment/**"))) //3.0.0 or 2.9.2
			.build();
	}
}
