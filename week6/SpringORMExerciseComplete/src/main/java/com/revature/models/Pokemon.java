package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "POKEMON")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int pokeId;
	
	@Column
	private int pokedexId;
	
	@Column
	private String name;
	
	@Column
	private int baseXP;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Trainer trainer;

	public Pokemon() {
		super();
	}

	public Pokemon(int pokeId, int pokedexId, String name, int baseXP, Trainer trainer) {
		super();
		this.pokeId = pokeId;
		this.pokedexId = pokedexId;
		this.name = name;
		this.baseXP = baseXP;
		this.trainer = trainer;
	}

	public Pokemon(int pokedexId, String name, int baseXP, Trainer trainer) {
		super();
		this.pokedexId = pokedexId;
		this.name = name;
		this.baseXP = baseXP;
		this.trainer = trainer;
	}

	public int getPokeId() {
		return pokeId;
	}

	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}

	public int getPokedexId() {
		return pokedexId;
	}

	public void setPokedexId(int pokedexId) {
		this.pokedexId = pokedexId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBaseXP() {
		return baseXP;
	}

	public void setBaseXP(int baseXP) {
		this.baseXP = baseXP;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + baseXP;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pokeId;
		result = prime * result + pokedexId;
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Pokemon)) {
			return false;
		}
		Pokemon other = (Pokemon) obj;
		if (baseXP != other.baseXP) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (pokeId != other.pokeId) {
			return false;
		}
		if (pokedexId != other.pokedexId) {
			return false;
		}
		if (trainer == null) {
			if (other.trainer != null) {
				return false;
			}
		} else if (!trainer.equals(other.trainer)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pokemon [pokeId=" + pokeId + ", pokedexId=" + pokedexId + ", name=" + name + ", baseXP=" + baseXP
				+ ", trainer=" + trainer.gettId() + "]";
	}
	
	
}