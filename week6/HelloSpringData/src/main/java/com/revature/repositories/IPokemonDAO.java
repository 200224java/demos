package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Pokemon;

public interface IPokemonDAO extends JpaRepository<Pokemon, Integer>{

}
