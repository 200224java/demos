package com.revature.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	private static Logger log = LogManager.getLogger(ConsumerService.class);
	
	@KafkaListener(topics = "icecream")
	public void consume(String message) {
		String response = String.format("Consuming: %s", message);
		log.info(response);
	}
}
