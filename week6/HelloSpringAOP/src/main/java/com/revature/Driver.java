package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Avenger;
import com.revature.respositories.AvengerDAO;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Avenger a = ac.getBean(Avenger.class);
		AvengerDAO dao = ac.getBean(AvengerDAO.class); 
		
		a.setId(7);
		a.setName("Scarlet Witch");
		a.setPower("Magic hands");
		a.setTrue_identity("Wanda Maximoff");
		
		Avenger a2 = dao.getById(1);
		
		dao.fight(a, "an energy bolt", 15);

		dao.fight(a2, "a smash of his shield", 1.2);

	}
	
}
