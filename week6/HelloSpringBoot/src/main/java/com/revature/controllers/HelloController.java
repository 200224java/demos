package com.revature.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public ResponseEntity<String> helloBoot() {
		return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("Hello World! This is my first Spring Boot app.");
	}
}
