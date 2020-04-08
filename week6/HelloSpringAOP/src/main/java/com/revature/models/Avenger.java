package com.revature.models;

import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Avenger {
	
	private int id;
	private String name;
	private String power;
	private String true_identity;
	
	public Avenger() {
		super();
	}

	public Avenger(int id, String name, String power, String true_identity) {
		super();
		this.id = id;
		this.name = name;
		this.power = power;
		this.true_identity = true_identity;
	}

	public Avenger(String name, String power, String true_identity) {
		super();
		this.name = name;
		this.power = power;
		this.true_identity = true_identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getTrue_identity() {
		return true_identity;
	}

	public void setTrue_identity(String true_identity) {
		this.true_identity = true_identity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, power, true_identity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Avenger)) {
			return false;
		}
		Avenger other = (Avenger) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(power, other.power)
				&& Objects.equals(true_identity, other.true_identity);
	}

	@Override
	public String toString() {
		return "Avenger [id=" + id + ", name=" + name + ", power=" + power + ", true_identity=" + true_identity + "]";
	}
	
	

}
