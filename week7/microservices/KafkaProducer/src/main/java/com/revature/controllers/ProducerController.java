package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.services.ProducerService;

@RestController
public class ProducerController {
	
	@Autowired
	private ProducerService ps;
	
	@PostMapping("/publish")
	public void sendMessage(@RequestParam("message") String message) {
		ps.send(message);
	}
}
