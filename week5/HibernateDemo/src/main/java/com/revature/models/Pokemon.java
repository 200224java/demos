package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMON")
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "poke_id")
	private int pokeId;
	
	// The @Column annotation is optional
	@Column(name = "name")
	private String name;
	
	@Column(name = "type")
	private PokemonType type;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trainer_id")
	private Trainer trainer;

	public Pokemon() {
		super();
	}

	public Pokemon(int pokeId, String name, PokemonType type, Trainer trainer) {
		super();
		this.pokeId = pokeId;
		this.name = name;
		this.type = type;
		this.trainer = trainer;
	}
	
	public int getPokeId() {
		return pokeId;
	}

	public void setPokeId(int pokeId) {
		this.pokeId = pokeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PokemonType getType() {
		return type;
	}

	public void setType(PokemonType type) {
		this.type = type;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pokeId, trainer, type);
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
		return Objects.equals(name, other.name) && pokeId == other.pokeId && Objects.equals(trainer, other.trainer)
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "Pokemon [pokeId=" + pokeId + ", name=" + name + ", type=" + type + ", trainer=" + trainer + "]";
	}
}
