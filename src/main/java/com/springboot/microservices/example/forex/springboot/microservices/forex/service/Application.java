package com.springboot.microservices.example.forex.springboot.microservices.forex.service;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		SpringApplication.run(Application.class, args);
	}
	
	
	@RequestMapping(value="/")
	public String hello() {
		return "Hello World";
	}
	

}
