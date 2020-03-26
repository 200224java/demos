package com.revature.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TRAINERS")
public class Trainer {

	@Id
	private int tId;
	
	private String name;
	
	@OneToMany(mappedBy = "trainer", fetch = FetchType.LAZY)
	private Set<Pokemon> party = new HashSet<>();

	public Trainer() {
		super();
	}

	public Trainer(int tId, String name, Set<Pokemon> party) {
		super();
		this.tId = tId;
		this.name = name;
		this.party = party;
	}
	
	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Pokemon> getParty() {
		return party;
	}

	public void setParty(Set<Pokemon> party) {
		this.party = party;
	}
	
	public boolean addPokemon(Pokemon p) {
		return this.party.add(p);
	}
	
	public boolean removePokemon(Pokemon p) {
		return this.party.remove(p);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Trainer)) {
			return false;
		}
		Trainer other = (Trainer) obj;
		return Objects.equals(name, other.name) && tId == other.tId;
	}

	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", name=" + name + "]";
	}
}
