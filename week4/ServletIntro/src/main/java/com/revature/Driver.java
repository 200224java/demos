package com.revature;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Driver {
	
	private static Logger log = LogManager.getLogger(Driver.class);
	

	public static void main(String[] args) {
		
		log.info("Application started!");

		
		log.info("Application ended!");
	}

}
