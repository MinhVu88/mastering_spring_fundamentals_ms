package com.udemy.matt_speake.spring_fundamentals.sec_1_5;

import com.udemy.matt_speake.spring_fundamentals.sec_1_5.business.ServicesImplementation2;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.udemy.matt_speake.spring_fundamentals.sec_1_5.business.Services;
import com.udemy.matt_speake.spring_fundamentals.sec_1_5.business.ServicesImplementation1;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
		/*
			- There are 3 application contexts to create the Spring container

			- FileSystemXmlApplicationContext & ClassPathXmlApplicationContext are xml-based approaches

			- AnnotationConfigApplicationContext is non-xml-based approach
		*/
		// ApplicationContext appContext = new FileSystemXmlApplicationContext("applicationContext_1_5.xml");
		// ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext_1_5.xml");
		// ApplicationContext appContext = new AnnotationConfigApplicationContext("com.udemy.matt_speake.spring_fundamentals.sec_1_5");
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		// bean1, bean2 & bean3 point to either the same Bean instance or different ones in the Spring Container
		// this is Singleton/Prototype scope, defined in either applicationContext.xml or DevConfig.java
		ServicesImplementation1 bean1 = appContext.getBean(ServicesImplementation1.class);
		ServicesImplementation1 bean2 = appContext.getBean(ServicesImplementation1.class);
		ServicesImplementation1 bean3 = appContext.getBean(ServicesImplementation1.class);
		System.out.println("\tbean1 -> " + bean1 + "\n\tbean2 -> " + bean2 + "\n\tbean3 -> " + bean3);

		// System.out.println("\t***************************************");

		// Repos repoBean = appContext.getBean(Repos.class);
		// repoBean.queryDb();

		// System.out.println("\t***************************************");
		
		// ServicesImplementation1 serviceBean1 = appContext.getBean(ServicesImplementation1.class);
		// serviceBean1.doBusinessLogic();

		// System.out.println("\t***************************************");

		Services serviceBean2 = appContext.getBean(ServicesImplementation1.class);
		serviceBean2.doBusinessLogic();

		Services serviceBean3 = appContext.getBean(ServicesImplementation2.class);
		serviceBean3.doBusinessLogic();

		((AnnotationConfigApplicationContext) appContext).close();
	}
}
