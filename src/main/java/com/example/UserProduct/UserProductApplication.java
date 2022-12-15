package com.example.UserProduct;

import com.example.UserProduct.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserProductApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean jwtFilter(){
//		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
//		filterRegistrationBean.setFilter(new JwtFilter());
//		filterRegistrationBean.addUrlPatterns("/userProductapp/user/product/*");
//		return filterRegistrationBean;
//	}

	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build();
	}
}
