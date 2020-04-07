package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Pokemon;
import com.revature.models.Trainer;
import com.revature.repositories.IPokemonDAO;
import com.revature.repositories.ITrainerDAO;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ITrainerDAO tdao = ac.getBean(ITrainerDAO.class);
		
		IPokemonDAO pdao = ac.getBean(IPokemonDAO.class);
		
		Trainer t = ac.getBean(Trainer.class);
		
		t.setName("Tim");
		tdao.insert(t);

		Pokemon p = ac.getBean(Pokemon.class);
		p.setName("Bulbasaur");
		p.setPokedexId(1);
		p.setBaseXP(64);
		p.setTrainer(tdao.findById(1));
		
		pdao.insert(p);
		
		Trainer t2 = tdao.findById(1);
		
		System.out.println(t2);
	}

}
