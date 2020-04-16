package com.revature.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
@RefreshScope
public class MessageController {
	
	// @RefreshScope will refresh the configuration for this controller without having to restart the service
	
	@Value("${message}")
	private String message;

	@GetMapping
	public String getMessage() {
		return message;
	}
}
