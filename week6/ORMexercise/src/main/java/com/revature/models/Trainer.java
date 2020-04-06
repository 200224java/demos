package com.revature.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "TRAINERS")
public class Trainer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int tId;

	@Column
	private String name;

	@OneToMany(mappedBy = "trainer", fetch = FetchType.EAGER)
	private List<Pokemon> party = new ArrayList<>();

	public Trainer() {
		super();
	}

	public Trainer(int tId, String name, List<Pokemon> party) {
		super();
		this.tId = tId;
		this.name = name;
		this.party = party;
	}

	public Trainer(String name, List<Pokemon> party) {
		super();
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

	public List<Pokemon> getParty() {
		return party;
	}

	public void setParty(List<Pokemon> party) {
		this.party = party;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((party == null) ? 0 : party.hashCode());
		result = prime * result + tId;
		return result;
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
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (party == null) {
			if (other.party != null) {
				return false;
			}
		} else if (!party.equals(other.party)) {
			return false;
		}
		if (tId != other.tId) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Trainer [tId=" + tId + ", name=" + name + ", party=" + party + "]";
	}

}
