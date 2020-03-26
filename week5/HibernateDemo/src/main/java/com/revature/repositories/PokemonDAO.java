package com.revature.repositories;

import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.revature.models.Pokemon;
import com.revature.models.PokemonType;
import com.revature.models.Trainer;
import com.revature.util.HibernateUtil;

/*
 * Methods that are available on session:
 * 
 * save() & persist() -> result in a SQL insert
 * update() & merge() -> result in a SQL update
 * delete() 		  -> results in a SQL delete
 * get() & load()	  -> results in a SQL select
 * 
 * saveOrUpdate()	  -> result in either a SQL insert or update, accordingly
 * 
 * update() does NOT allow duplicates in your cache
 * merge() will insert into the cache or overwrite the value in the cache accordingly
 * 
 * get() will retrieve from the database immediately
 * 
 * load() will use a placeholder (called a proxy) until you actually need the value
 * 	- Using a proxy after the session is closed will result in a LazyInitializationException
 */

public class PokemonDAO implements IPokemonDAO {

	@Override
	public Pokemon findById(int id) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		Pokemon p = ses.get(Pokemon.class, id);
		
		tx.commit();
		HibernateUtil.closeSession();
		
		return p;
	}

	@Override
	public Set<Pokemon> findAll() {
		Set<Pokemon> set = null;
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		// The code below queries using the Hibernate 5 Criteria Query API
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Pokemon> query = builder.createQuery(Pokemon.class);
		Root<Pokemon> root = query.from(Pokemon.class);
		query.select(root);
		
		Query<Pokemon> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		// HQL = Hibernate Query Language
		// Similar to JPQL = java Persistence Query Language
		
		// Note the table that we query MUST be the entity name
//		String hql = "FROM Pokemon p";
//		
//		Query<Pokemon> query = ses.createQuery(hql, Pokemon.class);
//		
//		set = (Set<Pokemon>) query.getResultStream()
//				.collect(Collectors.toSet());
		
		
		// HQL does not directly support INSERT INTO table VALUES
		// However, it DOES provide an INSERT INTO table SELECT stuff
		
		
		// Native SQL query
		// Note the table that we query MUST be the table name
//		String sql = "SELECT * FROM POKEMON";
//		
//		Query<Pokemon> query = ses.createNativeQuery(sql, Pokemon.class);
//		set = (Set<Pokemon>) query.stream()
//			.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}



	@Override
	public void insert(Pokemon p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.save(p);
		tx.commit();
		HibernateUtil.closeSession();
	}

	@Override
	public void delete(Pokemon p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.delete(p);
		tx.commit();
		HibernateUtil.closeSession();
	}

	@Override
	public void update(Pokemon p) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		ses.update(p);
		tx.commit();
		HibernateUtil.closeSession();
	}

	@Override
	public Set<Pokemon> findByType(PokemonType type) {
		Set<Pokemon> set = null;
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Pokemon> query = builder.createQuery(Pokemon.class);
		
		Root<Pokemon> root = query.from(Pokemon.class);
		
		query.select(root).where(builder.equal(root.get("type"), type));
		
		Query<Pokemon> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}

	@Override
	public Set<Pokemon> findByTrainer(Trainer t) {
		Set<Pokemon> set = null;
		
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		
		CriteriaBuilder builder = ses.getCriteriaBuilder();
		CriteriaQuery<Pokemon> query = builder.createQuery(Pokemon.class);
		
		Root<Pokemon> root = query.from(Pokemon.class);
		
		query.select(root).where(builder.equal(root.get("trainer"), t));
		
		Query<Pokemon> q = ses.createQuery(query);
		
		set = q.getResultStream()
				.collect(Collectors.toSet());
		
		tx.commit();
		
		return set;
	}
}
