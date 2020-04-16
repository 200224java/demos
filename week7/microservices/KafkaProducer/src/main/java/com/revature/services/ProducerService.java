package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private static Logger log = LogManager.getLogger(ProducerService.class);
	
	@Autowired
	private KafkaTemplate<String, String> kt;
	
	public void send(String message) {
		String response = String.format("Producing: %s", message);
		log.info(response);
		
		kt.send("icecream", "Flavor", message);
	}
}
