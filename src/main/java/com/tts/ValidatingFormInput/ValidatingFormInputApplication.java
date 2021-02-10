package com.tts.ValidatingFormInput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatingFormInputApplication {

	public static void main(String[] args) {

		SpringApplication.run(ValidatingFormInputApplication.class, args);
	}

}

/*
To activate Spring MVC, you would normally add @EnableWebMvc to the Application class.
But Spring Boot’s @SpringBootApplication already adds this annotation when it detects
spring-webmvc on your classpath. This same annotation lets it find the annotated
@Controller class and its methods.
The Thymeleaf configuration is also taken care of by @SpringBootApplication. By default,
templates are located in the classpath under templates/ and are resolved as views by
stripping the '.html' suffix off the file name.
 */