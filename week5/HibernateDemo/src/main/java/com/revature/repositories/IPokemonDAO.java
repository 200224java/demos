package com.revature.repositories;

import java.util.Set;

import com.revature.models.Pokemon;
import com.revature.models.PokemonType;
import com.revature.models.Trainer;

public interface IPokemonDAO {

	public Pokemon findById(int id);
	
	public Set<Pokemon> findAll();
	
	public Set<Pokemon> findByTrainer(Trainer t);
	
	public void insert(Pokemon p);
	
	public void delete(Pokemon p);
	
	public void update(Pokemon p);
	
	public Set<Pokemon> findByType(PokemonType type);
}
