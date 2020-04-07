package com.revature.respositories;

import org.springframework.stereotype.Repository;

import com.revature.models.Avenger;

@Repository
public class AvengerDAO {
	
	public static Avenger[] team = {
			(new Avenger(1, "Captian America", "World's number 1 pretty boy", "Steve Rodgers")),
			(new Avenger(2, "Iron Man", "Super Genius and he knows it", "Tony Stark")),
			(new Avenger(3, "Hawkeye", "Being the best Avenger", "Clint Barton")),
			(new Avenger(4, "Black Widow", "Killer thighs", "Natalia Alianovna Romanova")),
			(new Avenger(5, "Hulk", "SMASH", "Bruce Banner")),
			(new Avenger(6, "Thor", "God of thunder and perfect hair", "Thor Odinson"))};
	
	public Avenger[] getAll() {
		return team;
	}
	
	public Avenger getById(int id) {
		
		if(id>team.length || id<1) {
			return null;
		}
		return team[id-1];
	}
	
	public Avenger update(Avenger a) {
		if (a.getId()>team.length||a.getId()<1) {
			return null;
		}else {
			team[(a.getId())-1] = a;
			return getById(a.getId());
		}
		
	}

}
