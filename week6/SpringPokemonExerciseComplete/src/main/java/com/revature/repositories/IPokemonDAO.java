package com.revature.repositories;

import java.util.List;

import com.revature.models.Pokemon;

public interface IPokemonDAO {

	public Pokemon findById(int id);
	
	public List<Pokemon> findAll();
	
	public void insert(Pokemon p);
	
	public void delete(Pokemon p);
	
	public void update(Pokemon p);

}
