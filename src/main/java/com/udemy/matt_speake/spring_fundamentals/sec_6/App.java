package com.udemy.matt_speake.spring_fundamentals.sec_6;

import com.udemy.matt_speake.spring_fundamentals.sec_6.config.DevConfig;
import com.udemy.matt_speake.spring_fundamentals.sec_6.config.ProdConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// System.setProperty("spring.profiles.active", "local");
		System.setProperty("spring.profiles.active", "prod");

		// ApplicationContext appCtx = new AnnotationConfigApplicationContext(DevConfig.class);
		// ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext_6.xml");
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(DevConfig.class, ProdConfig.class);

		MyService myService = appCtx.getBean(MyService.class);

		myService.handleBusinessLogic();
	}
}
