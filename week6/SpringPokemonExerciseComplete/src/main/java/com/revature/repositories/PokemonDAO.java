package com.revature.repositories;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Pokemon;

@Repository
@Transactional
public class PokemonDAO implements IPokemonDAO {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public Pokemon findById(int id) {
		Session s = sf.getCurrentSession();
		return s.get(Pokemon.class, id);
	}

	@Override
	public List<Pokemon> findAll() {
		Session s = sf.getCurrentSession();
		CriteriaQuery<Pokemon> cq = s.getCriteriaBuilder().createQuery(Pokemon.class);
		cq.from(Pokemon.class);
		return s.createQuery(cq).getResultList();
	}

	@Override
	public void insert(Pokemon p) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(p);
	}

	@Override
	public void delete(Pokemon p) {
		Session s = sf.getCurrentSession();
		s.delete(p);
	}

	@Override
	public void update(Pokemon p) {
		Session s = sf.getCurrentSession();
		s.update(p);
	}

}
