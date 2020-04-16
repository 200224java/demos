package com.revature.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Flashcard;
import com.revature.repositories.FlashcardRepository;

@RestController
public class FlashcardController {
	
	@Autowired
	private FlashcardRepository fcdao;
	
	@Autowired
	Environment env;
	
	@GetMapping("/server")
	public String getPort() {
		String serverPort = env.getProperty("local.server.port");
		
		return "Hello, this came from port " + serverPort;
	}

	@GetMapping
	public ResponseEntity<List<Flashcard>> findAll() {
		List<Flashcard> all = fcdao.findAll();
		
//		if(all.isEmpty()) {
//			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(all);
//		}
		
		return ResponseEntity.ok(all);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Flashcard> findById(@PathVariable("id") int id) {
		Optional<Flashcard> optional = fcdao.findById(id);
		
		if(optional.isPresent()) {
			return ResponseEntity.ok(optional.get());
		}
		
		return ResponseEntity.noContent().build();
	}
	
	@PostMapping
	public ResponseEntity<Flashcard> insert(@RequestBody Flashcard f) {
		int oldId = f.getId();
		int newId = fcdao.save(f).getId();
		
		if(newId == oldId) {
			return ResponseEntity.badRequest().build();
		}
		
		return ResponseEntity.status(201).body(f);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Flashcard> delete(@PathVariable("id") int id) {
		Optional<Flashcard> option = fcdao.findById(id);

		if(option.isPresent()) {
			fcdao.delete(option.get());
			return ResponseEntity.accepted().body(option.get());
		}
		
		return ResponseEntity.notFound().build();
	}
}
