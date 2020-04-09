package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.repositories.IPokemonDAO;
import com.revature.repositories.ITrainerDAO;

@RestController
@RequestMapping(value="pokemon")
@CrossOrigin
public class PokeController {
	
	private IPokemonDAO pdao;
	private ITrainerDAO tdao;
	
	@GetMapping
	public ResponseEntity<List<Trainer>> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(tdao.findAll());
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Trainer> getTrainer(@PathVariable("id") int id) {
		return ResponseEntity.status(HttpStatus.OK).body(tdao.findById(id));
	}
	
	@PostMapping
	public  ResponseEntity<List<Trainer>> newTrainer(@RequestBody Trainer t) {
		tdao.insert(t);
		return ResponseEntity.status(HttpStatus.OK).body(tdao.findAll());
	}
	
	@PutMapping
	public ResponseEntity<List<Trainer>> newPokemon(@RequestBody Pokemon p) {
		pdao.insert(p);
		return ResponseEntity.status(HttpStatus.OK).body(tdao.findAll());
	}
	@Autowired
	public PokeController(IPokemonDAO pdao, ITrainerDAO tdao) {
		super();
		this.pdao = pdao;
		this.tdao = tdao;
	}

	public IPokemonDAO getPdao() {
		return pdao;
	}
	public void setPdao(IPokemonDAO pdao) {
		this.pdao = pdao;
	}

	public ITrainerDAO getTdao() {
		return tdao;
	}
	public void setTdao(ITrainerDAO tdao) {
		this.tdao = tdao;
	}

	
	
}
