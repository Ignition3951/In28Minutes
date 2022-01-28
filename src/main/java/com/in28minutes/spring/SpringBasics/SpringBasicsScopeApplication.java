package com.in28minutes.spring.SpringBasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.SpringBasics.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBasicsScopeApplication {
	
	private static Logger LOGGER =  LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(
//				new QuickSortAlgorithm());
		ApplicationContext applicationContext = 
new AnnotationConfigApplicationContext(SpringBasicsScopeApplication.class);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		
		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConnection());

	}

}
