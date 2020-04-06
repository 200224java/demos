package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.services.InnerService;
import com.revature.services.OuterService;

public class Driver {
	
	public static void main(String[] args) {
		System.out.println(DoesItWork());
	}

	private static String DoesItWork() {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		InnerService inServ = ac.getBean(InnerService.class);
		OuterService outServ = ac.getBean(OuterService.class);
		
		String s1 = outServ.getFront();
		String s2 = inServ.getFront();
		String s3 = inServ.getBack();
		String s4 = outServ.getBack();
				
		if(s1==null||s2==null||s3==null||s4==null) {
			return "The stairway to success is built with failures. Try again, you're on the right path.";
		}else {
			return ("Go to this link and see how you did: "+s1+s2+s3+s4);
		}
	}

}
