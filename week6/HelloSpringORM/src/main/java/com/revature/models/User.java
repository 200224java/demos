package com.revature.models;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="orm_users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="user_friends", joinColumns= {@JoinColumn(name="source_id", referencedColumnName = "id")}, 
		inverseJoinColumns = {@JoinColumn(name="target_id", referencedColumnName= "id")})
	private List<User> friends;

	public User() {
		super();
	}

	public User(int id, String firstname, String lastname, List<User> friends) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.friends = friends;
	}

	public User(String firstname, String lastname, List<User> friends) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.friends = friends;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstname, friends, id, lastname);
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
		return Objects.equals(firstname, other.firstname) && Objects.equals(friends, other.friends) && id == other.id
				&& Objects.equals(lastname, other.lastname);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", friends=" + friends + "]";
	}
	
	
	
	

}
