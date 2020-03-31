package com.revature.beans;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private int Id;
	
	private String name;
	
	private Account acc;

	public User() {
		super();
	}
	@Autowired
	public User(Account acc) {
		super();
		this.acc = acc;
	}

	public User(int id, String name, Account acc) {
		super();
		Id = id;
		this.name = name;
		this.acc = acc;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, acc, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User other = (User) obj;
		return Id == other.Id && Objects.equals(acc, other.acc) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", acc=" + acc + "]";
	}
	
	  

}
