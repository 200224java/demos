package com.revature.repositories;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.models.Trainer;

@Repository
@Transactional
public class TrainerDAO implements ITrainerDAO {
	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public Trainer findById(int id) {
		Session s = sf.getCurrentSession();
		return s.get(Trainer.class, id);
	}

	@Override
	public List<Trainer> findAll() {
		Session s = sf.getCurrentSession();
		CriteriaQuery<Trainer> cq = s.getCriteriaBuilder().createQuery(Trainer.class);
		cq.from(Trainer.class);
		return s.createQuery(cq).getResultList();
	}

	@Override
	public void insert(Trainer t) {
		Session s = sf.getCurrentSession();
		s.saveOrUpdate(t);
	}

	@Override
	public void update(Trainer t) {
		Session s = sf.getCurrentSession();
		s.update(t);
	}

	@Override
	public void delete(Trainer t) {
		Session s = sf.getCurrentSession();
		s.delete(t);
	}

}
