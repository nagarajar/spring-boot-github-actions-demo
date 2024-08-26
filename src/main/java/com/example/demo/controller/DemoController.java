package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	
	@GetMapping("/message")
	public String getMessage() {
		return "Hello, Welcome to Spring Boot With GitHub Actions.....!";
	}

}
