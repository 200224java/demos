package com.revature.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.revature.models.Avenger;
import com.revature.respositories.AvengerDAO;

@Controller
@RequestMapping(value="/avenger")
public class AvengerController {
	
	@Autowired
	private AvengerDAO dao;
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody //this will automatically send the response as JSON
	public List<Avenger> Assemble() {
		return Arrays.asList(dao.getAll());
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Avenger> findById(@PathVariable("id") int id) {
		Avenger a = dao.getById(id);
		if(a==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.OK).body(a);
	}
	
	@PutMapping
	@ResponseBody
	public ResponseEntity<Avenger> update(@RequestBody Avenger a){
		a = dao.update(a);
		if(a==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(a);
	}

}
