package com.d1do;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellodockerApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker";
	}
	public static void main(String[] args) {
		System.out.println("starting...");
		SpringApplication.run(HellodockerApplication.class, args);
	}
}
