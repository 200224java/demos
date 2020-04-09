package com.revature.repositories;

import java.util.List;

import com.revature.models.Trainer;

public interface ITrainerDAO {
	
	public Trainer findById(int id);
	public List<Trainer> findAll();
	public void insert(Trainer t);
	public void update(Trainer t);
	public void delete(Trainer t);
	
	
}
