package com.revature;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.models.Pokemon;
import com.revature.models.PokemonType;
import com.revature.models.Trainer;
import com.revature.repositories.PokemonDAO;
import com.revature.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {
		
		// This object here is TRANSIENT
		// It has yet to be associated with any hibernate session
		Pokemon p = new Pokemon();
		Trainer t = new Trainer();
		
		Session s = HibernateUtil.getSession();
		Transaction tx = s.beginTransaction();
		
		p.setName("Bulbasaur");
		p.setType(PokemonType.LEAF);
		
		t.setName("Nathan Mejia");
		p.setTrainer(t);
		t.addPokemon(p);
		
		
		// This method also applies the auto generated primary key
		// that previous object is now PERSISTENT
		s.save(t);
		s.save(p);
		
		tx.commit();
		HibernateUtil.closeSession();
		
		// That object is now DETACHED
		
		s = HibernateUtil.getSession();
		
		Pokemon p2 = s.get(Pokemon.class, 1);
		
		Set<Pokemon> set = new PokemonDAO().findAll();
		
		for( Pokemon p3 : set) {
			System.out.println(p3);
		}
		
//		System.out.println(p2);
		
		Set<Pokemon> set2 = new PokemonDAO().findByType(PokemonType.LEAF);
		
		for( Pokemon p3 : set2) {
			System.out.println(p3);
		}
		
		Set<Pokemon> set3 = new PokemonDAO().findByTrainer(t);
		
		for( Pokemon p3 : set3) {
			System.out.println(p3);
		}
		
		Set<Pokemon> set4 = new PokemonDAO().findByType(PokemonType.AIR);
		
		for( Pokemon p3 : set4) {
			System.out.println(p3);
		}
		
		
		Query<Pokemon> q = s.getNamedQuery("getAll");
		
		for(Pokemon p3 : q.list() ) {
			System.out.println(p3);
		}
		
		Query<Pokemon> q2 = s.getNamedQuery("getBulbasaur");
		
		System.out.println(q2.getSingleResult());
	}
}
