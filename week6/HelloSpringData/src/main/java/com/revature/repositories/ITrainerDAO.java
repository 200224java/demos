package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Trainer;

public interface ITrainerDAO extends JpaRepository<Trainer, Integer>{

	Trainer findByName(String name);


}
