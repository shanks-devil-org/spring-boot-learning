package com.shanks.spring.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Predicates;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

	@Bean
	public Docket systemApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("system")
				.apiInfo(apiInfo())
				.select()
				.paths(Predicates.not(PathSelectors.regex("/example/.*")))
				.build();
	}
	
	@Bean
	public Docket businessApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("business")
				.apiInfo(apiInfo())
				.select()
				.paths(PathSelectors.regex("/example/.*"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("String Boot Learning")
				.description("this service work on spring boot, provide service of user")
				.termsOfServiceUrl("https://github.com/shanks-devil")
				.contact(new Contact("shanks", "https://github.com/shanks-devil", "roux.d.shanks@gmail.com"))
				.license("Apache License Version 2.0")
				.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
				.version("2.0")
				.build();
	}
}
