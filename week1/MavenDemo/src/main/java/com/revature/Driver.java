package com.revature;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class Driver {
	
	private static Logger log = Logger.getLogger(Driver.class);
	// The Log4j Logger class has a static method called getLogger that we use to get our instance
	// of the logger for this particular class
	
	
	/*
	 * Log4j has several logging levels
	 * OFF: No logging at all
	 * ALL: Turns on all levels of logging
	 * TRACE: Adds more information to debug level logs
	 * DEBUG: Basically for developers, turns on all of the following levels
	 * INFO: That important business processes have completed and good news is "as expected";
	 * 			System administrators will generally watch these info logs to track what is happening
	 * WARN: Suggests that the application might be continued, but you should take extra caution
	 * ERROR: Shouts that something has gone very wrong and should be investigated immediately
	 * FATAL: Very uncommon, but signals that something is terribly wrong, and will likely result
	 * 			in application failure
	 */

	public static void main(String[] args) {
		log.info("The application has started.");
		
		try {
			recur();
		} catch(Error e) {
			log.error("Oh no! Something has gone wrong!", e);
		}
		
		log.info("The application continued to this point...");
		
		List<Object> list = new ArrayList<>();
		try {
			
//			while(true) {
//				list.add(new String("Some really long text, I dunno what to even say."));
//			}
		} catch(Error e) {
			log.error("Oh no! Something has gone wrong! We had " + list.size() + " objects.", e);
		}
	}
	
	public static void recur() {
		recur();
	}
}
